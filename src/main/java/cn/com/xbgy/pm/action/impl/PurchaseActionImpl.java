package cn.com.xbgy.pm.action.impl;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import cn.com.xbgy.core.action.impl.BaseActionImpl;
import cn.com.xbgy.pm.action.PurchaseAction;
import cn.com.xbgy.pm.bean.Purchase;

@Controller("purchaseAction")
@Scope("prototype")
// 完成注册 修改密码 登陆
public class PurchaseActionImpl extends BaseActionImpl<Purchase> implements PurchaseAction {
	
	public String addPurchasePage(){
		
		return "add";
	}
	
	public String addPurchase(){
		
		return "list";
	}

	@Override
	public Purchase getModel() {
		// TODO Auto-generated method stub
		return null;
	}
	

}
