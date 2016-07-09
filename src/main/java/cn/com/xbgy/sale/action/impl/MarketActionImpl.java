package cn.com.xbgy.sale.action.impl;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Set;

import javax.persistence.UniqueConstraint;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import cn.com.xbgy.pm.bean.Staff;
import cn.com.xbgy.sale.action.MarketAction;
import cn.com.xbgy.sale.bean.Goods;
import cn.com.xbgy.sale.bean.MarketOrder;
import cn.com.xbgy.sale.bean.MarketOrderItem;
import cn.com.xbgy.sale.bean.OrderItem;
import cn.com.xbgy.sale.vo.Item;
import cn.com.xbgy.sale.vo.MarketVO;

@Controller("marketAction")
@Scope("prototype")
// 完成注册 修改密码 登陆
public class MarketActionImpl extends BaseActionImpl<MarketOrder> implements MarketAction {

	public String addMarketPage(){
		if(marketVO.getItemsNumber()==null){
			marketVO.setItemsNumber(1);
		}else{
			marketVO.setItemsNumber(marketVO.getItemsNumber()+1);
		}
		List<Goods> goodsList = goodsService.findAll();
		getActionContext().put("goodsList", goodsList);
		String date = new SimpleDateFormat("yyyy-MM-dd").format(new Date());
		getActionContext().put("date", date);
		return "add";
	}
	
	public String addMarket(){
		List<Item> items = marketVO.getItems();
		Staff staff = (Staff) getActionContext().getSession().get("staff");
		if(staff==null){
			staff = new Staff();
			staff.setStaffId(1);
		}
		marketOrderService.addMarketOrder(items, staff);
		return "list";
	}
	
	@Override
	public MarketVO getModel() {
		// TODO Auto-generated method stub
		if(marketVO==null)
			marketVO= new MarketVO();
		return marketVO;
	}
	
	private MarketVO marketVO;

	public MarketVO getMarketVO() {
		return marketVO;
	}

	public void setMarketVO(MarketVO marketVO) {
		this.marketVO = marketVO;
	}
	
}
