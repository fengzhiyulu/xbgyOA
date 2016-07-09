package cn.com.xbgy.sale.service;

import java.util.List;

import cn.com.xbgy.core.service.BaseService;
import cn.com.xbgy.pm.bean.Staff;
import cn.com.xbgy.sale.bean.MarketOrder;
import cn.com.xbgy.sale.vo.Item;

public interface MarketOrderService extends BaseService<MarketOrder>{

	public void addMarketOrder(List<Item> items,Staff staff);
}
