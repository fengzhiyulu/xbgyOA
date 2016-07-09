package cn.com.xbgy.sale.service.impl;

import java.util.List;
import java.util.Set;

import org.springframework.stereotype.Service;

import cn.com.xbgy.core.service.impl.BaseServiceImpl;
import cn.com.xbgy.pm.bean.Staff;
import cn.com.xbgy.sale.bean.Goods;
import cn.com.xbgy.sale.bean.MarketOrder;
import cn.com.xbgy.sale.bean.MarketOrderItem;
import cn.com.xbgy.sale.service.MarketOrderService;
import cn.com.xbgy.sale.vo.Item;

@Service("marketOrderService")
public class MarketOrderServiceImpl extends BaseServiceImpl<MarketOrder> implements MarketOrderService{

	public void addMarketOrder(List<Item> items , Staff staff){
		MarketOrder order = new MarketOrder();
		Set<MarketOrderItem> orderItems = order.getOrderItems();
		for (Item item : items) {
			Goods goods = goodsDao.get(item.getGoodsId());
			MarketOrderItem orderItem= new MarketOrderItem();
			orderItem.setGoods(goods);
			orderItem.setNumber(item.getNumber());
			orderItem.setPrice(goods.getPrice());
			orderItems.add(orderItem);
		}
		order.setStaff(staff);
		marketOrderDao.save(order);
	}
}
