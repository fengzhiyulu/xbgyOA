package cn.com.xbgy.sale.action.impl;

import javax.annotation.Resource;

import cn.com.xbgy.core.action.BaseAcion;
import cn.com.xbgy.core.util.PageResult;
import cn.com.xbgy.pm.service.DepartService;
import cn.com.xbgy.pm.service.StaffService;
import cn.com.xbgy.pm.service.UserService;
import cn.com.xbgy.sale.service.GoodsService;
import cn.com.xbgy.sale.service.MarketOrderService;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;


public abstract class BaseActionImpl<T> extends ActionSupport implements BaseAcion<T>{
	
	@Resource
	protected GoodsService goodsService;
	
	@Resource
	protected MarketOrderService marketOrderService;
	
	@Resource 
	protected StaffService staffService;
	
	public ActionContext getActionContext(){
		return ActionContext.getContext();
	}
	
}
