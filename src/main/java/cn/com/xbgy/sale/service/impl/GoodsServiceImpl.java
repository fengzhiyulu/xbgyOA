package cn.com.xbgy.sale.service.impl;

import org.springframework.stereotype.Service;

import cn.com.xbgy.core.service.impl.BaseServiceImpl;
import cn.com.xbgy.sale.bean.Goods;
import cn.com.xbgy.sale.service.GoodsService;

@Service("goodsService")
public class GoodsServiceImpl extends BaseServiceImpl<Goods> implements GoodsService{

}
