package cn.com.xbgy.sale.bean;

import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;


@Entity
@DiscriminatorColumn(name="item_type",discriminatorType=DiscriminatorType.STRING)
@DiscriminatorValue("普通项")
@Table(name="xb_orderItem")
public class OrderItem {
	
	@Id @GeneratedValue(strategy=GenerationType.AUTO)
	private Integer orderItemId;
	@OneToOne(targetEntity=Goods.class)
	@JoinColumn(name="goods_id",referencedColumnName="goodsId")
	private Goods goods;
	private Integer number;
	private Double price;
	private Double totalPrice;
	
	public OrderItem(){}
	public Integer getOrderItemId() {
		return orderItemId;
	}
	public void setOrderItemId(Integer orderItemId) {
		this.orderItemId = orderItemId;
	}
	public Goods getGoods() {
		return goods;
	}
	public void setGoods(Goods goods) {
		this.goods = goods;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	public Integer getNumber() {
		return number;
	}
	public void setNumber(Integer number) {
		this.number = number;
	}
	public Double getTotalPrice() {
		if(totalPrice==null)
			totalPrice = this.number*this.price;
		return totalPrice;
	}
}
