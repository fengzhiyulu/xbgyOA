package cn.com.xbgy.sale.bean;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import cn.com.xbgy.pm.bean.Staff;

@Entity
@Inheritance(strategy=InheritanceType.JOINED)
@Table(name="xb_order")
public abstract class Order {
	
	@Id @GeneratedValue(strategy=GenerationType.AUTO)
	private Integer orderID;
	private String orderTime;
	@OneToOne(targetEntity=Staff.class)
	private Staff staff;
	private Double totalPrice;
	public Integer getOrderID() {
		return orderID;
	}
	public void setOrderID(Integer orderID) {
		this.orderID = orderID;
	}
	public String getOrderTime() {
		return orderTime;
	}
	public void setOrderTime(String orderTime) {
		this.orderTime = orderTime;
	}
	public Staff getStaff() {
		return staff;
	}
	public void setStaff(Staff staff) {
		this.staff = staff;
	}
	public Double getTotalPrice() {
		return totalPrice;
	}
	public void setTotalPrice(Double totalPrice) {
		this.totalPrice = totalPrice;
	}
}
