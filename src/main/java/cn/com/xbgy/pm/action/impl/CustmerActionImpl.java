package cn.com.xbgy.pm.action.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import cn.com.xbgy.core.action.impl.BaseActionImpl;
import cn.com.xbgy.core.util.PageResult;
import cn.com.xbgy.core.util.QueryHelper;
import cn.com.xbgy.pm.action.CustmerAction;
import cn.com.xbgy.pm.bean.Custmer;

@Controller("custmerAction")
@Scope("prototype")
// 完成注册 修改密码 登陆
public class CustmerActionImpl extends BaseActionImpl<Custmer> implements CustmerAction {

	// ajax 自动模糊查找客户姓名
	public String getCustmers(){
		//TODO  根据简写判断查询客户
		QueryHelper qh = new QueryHelper(Custmer.class, "c");
		qh.addCondiction("custmerName like ?");
		if(searchContext!=null){
			List<Object> list = new ArrayList<Object>();
			list.add("%"+searchContext+"%");
			qh.setParameters(list);
		}
		PageResult findObject = custmerService.findObject(getPageNo(), getPageSize(), qh);
		this.list=findObject.getItems();
		return "custmerList";
	}
	
	@Override
	public Custmer getModel() {
		// TODO Auto-generated method stub
		return null;
	}
	
	private List<Custmer> list;
	private String searchContext;
	
	public List<Custmer> getList() {
		return list;
	}
	public void setList(List<Custmer> list) {
		this.list = list;
	}
	public String getSearchContext() {
		return searchContext;
	}
	public void setSearchContext(String searchContext) {
		this.searchContext = searchContext;
	}
}
