package cn.com.xbgy.pm.action.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import com.opensymphony.xwork2.ModelDriven;

import cn.com.xbgy.core.action.impl.BaseActionImpl;
import cn.com.xbgy.core.util.PageResult;
import cn.com.xbgy.core.util.QueryHelper;
import cn.com.xbgy.pm.action.StaffAction;
import cn.com.xbgy.pm.bean.Depart;
import cn.com.xbgy.pm.bean.Staff;
import cn.com.xbgy.pm.vo.StaffVO;
@Controller("staffAction")
@Scope("prototype")
public class StaffActionImpl extends BaseActionImpl<Staff> implements StaffAction{

	public String staffPage(){
		QueryHelper qh= new QueryHelper(Staff.class, "s");
		PageResult pageResult = staffService.findObject(getPageNo(),getPageSize(),qh);
		getActionContext().put("pageResult", pageResult);
		return "index";
	}
	
	public String addStaffPage(){
		List<Depart> departList = departService.findAll();
		getActionContext().put("departList", departList);
		return "add";
	}
	
	public String addStaff(){
		if(staff.getStaName()==null || "".equals(staff.getStaName())){
			//TODO  需要重定向到staffPage页面  并且
			getActionContext().put("error", "用户名不能为空");
			return "index";
		}
		staffService.save(staff);
		//TODO 应该是重定向到addStaffPage
		return "redirectIndex";
	}
	
	public String search(){
		QueryHelper qh = new QueryHelper(Staff.class, "s");
		List<Object> list = new ArrayList<Object>();
		if(!"".equals(searchContext)&&"1".equals(searchType)){
			qh.addCondiction("staffId=?");
			int parseInt = Integer.parseInt(searchContext);
			list.add(parseInt);
		}else if(!"".equals(searchContext)&&"2".equals(searchType)){
			qh.addCondiction("staName like ?");
			list.add("%"+searchContext+"%");
		}
		qh.setParameters(list);
		PageResult pageResult = staffService.findObject(getPageNo(), getPageSize(), qh);
		getActionContext().put("pageResult", pageResult);
		return "index";
	}
	
	public String staffListPage(){
		QueryHelper qh = new QueryHelper(Staff.class, "s");
		qh.addCondiction("staName like ?");
		List<Object> list = new ArrayList<Object>();
		qh.setParameters(list);
		PageResult findObject = staffService.findObject(0, 10, qh);
		List items = findObject.getItems();
		return "staffList";
	}
	
	public String editStaffPage(){
		staff = staffService.get(staff.getStaffId());
		List<Depart> departList = departService.findAll();
		getActionContext().put("departList", departList);
		return "edit";
	}
	
	public String editStaff(){
		staffService.update(staff);
		return "redirectIndex";
	}
	
	public String deleteStaff(){
		Map<String, Object> parameters = getActionContext().getParameters();
		String[] arr =(String[])parameters.get("id");
		Integer id = Integer.parseInt(arr[0]);
		Staff sta = new Staff();
		sta.setStaffId(id);
		staffService.delete(sta);
		return "redirectIndex";
	}

	@Override
	public Staff getModel() {
		// TODO Auto-generated method stub
		return null;
	}
	
	private String searchContext;
	private String searchType;
	private Staff staff;
	
	public Staff getStaff() {
		return staff;
	}

	public void setStaff(Staff staff) {
		this.staff = staff;
	}

	public String getSearchContext() {
		return searchContext;
	}
	public void setSearchContext(String searchContext) {
		this.searchContext = searchContext;
	}
	public String getSearchType() {
		return searchType;
	}
	public void setSearchType(String searchType) {
		this.searchType = searchType;
	}
}
