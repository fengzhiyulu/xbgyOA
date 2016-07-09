package cn.com.xbgy.sale.dao.impl;

import org.springframework.stereotype.Repository;

import cn.com.xbgy.core.dao.impl.BaseDaoImpl;
import cn.com.xbgy.sale.bean.Goods;
import cn.com.xbgy.sale.dao.GoodsDao;


@Repository("goodsDao")
public class GoodsDaoImpl extends BaseDaoImpl<Goods> implements GoodsDao {
	
	public GoodsDaoImpl(){
		
		System.out.println("创建陈宫");
	}
	
}
