package cn.com.xbgy.sale.dao.impl;

import org.springframework.stereotype.Repository;

import cn.com.xbgy.core.dao.impl.BaseDaoImpl;
import cn.com.xbgy.sale.bean.Goods;
import cn.com.xbgy.sale.bean.MarketOrder;
import cn.com.xbgy.sale.dao.GoodsDao;
import cn.com.xbgy.sale.dao.MarketOrderDao;


@Repository("marketOrderDao")
public class MarketOrderDaoImpl extends BaseDaoImpl<MarketOrder> implements MarketOrderDao {
	
}
