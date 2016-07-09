package cn.com.xbgy.pm.service;

import java.io.Serializable;
import java.util.List;

import cn.com.xbgy.core.service.BaseService;
import cn.com.xbgy.core.util.PageResult;
import cn.com.xbgy.core.util.QueryHelper;
import cn.com.xbgy.pm.bean.Depart;
import cn.com.xbgy.pm.bean.Staff;

public interface StaffService extends BaseService<Staff>{
	

	public PageResult findObject(int pageNo,int pageSize,QueryHelper qh);
	
	public PageResult findByDepartId(int pageNo,int pageSize,Integer id);
}
