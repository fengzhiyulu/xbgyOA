package cn.com.xbgy.sale.bean;

import cn.com.xbgy.pm.bean.Custmer;
import cn.com.xbgy.pm.bean.Staff;

public class SignOrder {
	private Integer SignId;
	private Staff staff;
	private Custmer custmer;
	private String payStatus;
	private String remark;
	private String orderTime;
	
	public SignOrder(){}
	public Integer getSignId() {
		return SignId;
	}
	public void setSignId(Integer signId) {
		SignId = signId;
	}
	public Staff getStaff() {
		return staff;
	}
	public void setStaff(Staff staff) {
		this.staff = staff;
	}
	public Custmer getCustmer() {
		return custmer;
	}
	public void setCustmer(Custmer custmer) {
		this.custmer = custmer;
	}
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
	public String getOrderTime() {
		return orderTime;
	}
	public void setOrderTime(String orderTime) {
		this.orderTime = orderTime;
	}
}
