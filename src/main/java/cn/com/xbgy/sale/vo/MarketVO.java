package cn.com.xbgy.sale.vo;

import java.util.ArrayList;
import java.util.List;

import cn.com.xbgy.sale.bean.Goods;
import cn.com.xbgy.sale.bean.MarketOrder;
import cn.com.xbgy.sale.bean.MarketOrderItem;
import cn.com.xbgy.sale.bean.OrderItem;

public class MarketVO {
	
	private List<Item> items = new ArrayList<Item>();
	private Integer itemsNumber;
	public Integer getItemsNumber() {
		return itemsNumber;
	}
	public void setItemsNumber(Integer itemsNumber) {
		this.itemsNumber = itemsNumber;
	}
	public List<Item> getItems() {
		return items;
	}
	public void setItems(List<Item> items) {
		this.items = items;
	}
}
