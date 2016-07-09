package cn.com.xbgy.pm.action.impl;

import java.util.List;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import cn.com.xbgy.core.action.impl.BaseActionImpl;
import cn.com.xbgy.pm.action.DepartAction;
import cn.com.xbgy.pm.bean.Depart;
import cn.com.xbgy.pm.vo.DepartVO;

import com.opensymphony.xwork2.ModelDriven;

@Controller("departAction")
@Scope("prototype")
public class DepartActionImpl extends BaseActionImpl<Depart> implements DepartAction,ModelDriven<DepartVO> {

	@Override
	public String departListPage() {
		List<Depart> departList = departService.findAll();
		departVO.setDepartList(departList);
		return "list";
	}

	@Override
	public String addDepartPage() {
		// TODO Auto-generated method stub
		return "add";
	}
	
	
	@Override
	public DepartVO getModel() {
		// TODO Auto-generated method stub
		if(departVO==null)
			departVO=new DepartVO();
		return departVO;
	}
	
	private DepartVO departVO;

	public DepartVO getDepartVO() {
		return departVO;
	}
	public void setDepartVO(DepartVO departVO) {
		this.departVO = departVO;
	}
}
