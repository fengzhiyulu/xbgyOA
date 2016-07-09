package cn.com.xbgy.pm.service.impl;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import cn.com.xbgy.core.service.impl.BaseServiceImpl;
import cn.com.xbgy.core.util.PageResult;
import cn.com.xbgy.core.util.QueryHelper;
import cn.com.xbgy.pm.bean.Depart;
import cn.com.xbgy.pm.bean.Staff;
import cn.com.xbgy.pm.service.StaffService;

@Service("staffService")
public class StaffServiceImpl extends BaseServiceImpl<Staff> implements StaffService{

	
	public PageResult findObject(int pageNo,int pageSize,QueryHelper qh){
		return staffDao.findObject(pageNo, pageSize, qh);
	}
	
	public List<Depart> getDepartList(QueryHelper qh){
		return departDao.findObjects(qh);
	}
	
	public PageResult findByDepartId(int pageNo,int pageSize,Integer id){
		QueryHelper qh = new QueryHelper(Staff.class,"s");
		qh.addCondiction("s.depart.id=?");
		List<Object> params=new ArrayList<Object>();
		params.add(id);
		qh.setParameters(params);
		PageResult findObject = staffDao.findObject(pageNo, pageSize, qh);
		return findObject;
	}
}
