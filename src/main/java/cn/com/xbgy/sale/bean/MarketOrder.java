package cn.com.xbgy.sale.bean;

import java.util.LinkedHashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="xb_marketOrder")
public class MarketOrder extends Order{
	
	private String payStatus;// 付款状态
	private String remark;
	private String sendStatus;// 发货状态
	private String expressInfo;// 物流信息
	@OneToMany(targetEntity=MarketOrderItem.class,mappedBy="marketOrder")
	private Set<MarketOrderItem> orderItems=new LinkedHashSet<MarketOrderItem>();
	public MarketOrder(){};
	public String getPayStatus() {
		return payStatus;
	}
	public void setPayStatus(String payStatus) {
		this.payStatus = payStatus;
	}
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
	public String getSendStatus() {
		return sendStatus;
	}
	public void setSendStatus(String sendStatus) {
		this.sendStatus = sendStatus;
	}
	public String getExpressInfo() {
		return expressInfo;
	}
	public void setExpressInfo(String expressInfo) {
		this.expressInfo = expressInfo;
	}
	public Set<MarketOrderItem> getOrderItems() {
		return orderItems;
	}
	public void setOrderItems(Set<MarketOrderItem> orderItems) {
		this.orderItems = orderItems;
	}
}
