package cn.com.xbgy.core.action.impl;

import javax.annotation.Resource;

import cn.com.xbgy.core.action.BaseAcion;
import cn.com.xbgy.core.util.PageResult;
import cn.com.xbgy.pm.service.CustmerService;
import cn.com.xbgy.pm.service.DepartService;
import cn.com.xbgy.pm.service.StaffService;
import cn.com.xbgy.pm.service.UserService;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;


public abstract class BaseActionImpl<T> extends ActionSupport implements BaseAcion<T>{
	
	@Resource
	protected UserService userService;
	
	@Resource
	protected StaffService staffService;
	
	@Resource
	protected DepartService departService;
	
	@Resource
	protected CustmerService custmerService;
	
	public ActionContext getActionContext(){
		return ActionContext.getContext();
	}
	
	private int pageNo;
	private int pageSize;
	private PageResult pageResult;

	public UserService getUserService() {
		return userService;
	}
	public void setUserService(UserService userService) {
		this.userService = userService;
	}
	public StaffService getStaffService() {
		return staffService;
	}
	public void setStaffService(StaffService staffService) {
		this.staffService = staffService;
	}
	public DepartService getDepartService() {
		return departService;
	}
	public void setDepartService(DepartService departService) {
		this.departService = departService;
	}
	public int getPageNo() {
		if(pageNo<1) pageNo=1;
		return pageNo;
	}
	public void setPageNo(int pageNo) {
		this.pageNo = pageNo;
	}
	public int getPageSize() {
		if(pageSize==0) pageSize=10;
		return pageSize;
	}
	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}
	public PageResult getPageResult() {
		return pageResult;
	}
	public void setPageResult(PageResult pageResult) {
		this.pageResult = pageResult;
	}
	
	
}
