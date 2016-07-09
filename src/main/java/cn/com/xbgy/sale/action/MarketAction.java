package cn.com.xbgy.sale.action;

import cn.com.xbgy.sale.bean.MarketOrder;
import cn.com.xbgy.sale.vo.MarketVO;

import com.opensymphony.xwork2.ModelDriven;

public interface MarketAction extends BaseAcion<MarketOrder>,ModelDriven<MarketVO>{

	public String addMarketPage();
}
