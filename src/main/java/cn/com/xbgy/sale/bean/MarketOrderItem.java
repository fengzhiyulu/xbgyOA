package cn.com.xbgy.sale.bean;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@DiscriminatorValue("超市项")
@Table(name="xb_marketOrderItem")
public class MarketOrderItem extends OrderItem{
	
	@ManyToOne(targetEntity=MarketOrder.class)
	@JoinColumn(name="order_Id",nullable=true)
	private MarketOrder marketOrder;

	public MarketOrderItem(){}

	public MarketOrder getMarketOrder() {
		return marketOrder;
	}
	public void setMarketOrder(MarketOrder marketOrder) {
		this.marketOrder = marketOrder;
	}
}