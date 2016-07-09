package cn.com.xbgy.pm.action;

import cn.com.xbgy.core.action.BaseAcion;
import cn.com.xbgy.pm.bean.Depart;
import cn.com.xbgy.pm.bean.Staff;

public interface DepartAction extends BaseAcion<Depart>{

	public String departListPage();
	
	public String addDepartPage();
	
	
	
}
