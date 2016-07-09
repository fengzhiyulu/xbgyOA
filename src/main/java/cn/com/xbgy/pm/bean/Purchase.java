package cn.com.xbgy.pm.bean;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="tb_purchase")
public class Purchase {
	
	@Id @GeneratedValue(strategy=GenerationType.AUTO)
	private Integer purId;		
	private String farmer;		//农户
	private String date;		//日期
	private double number;		//数量
	private double price;		//单价
	private String agent;		//采购员
	private String weigher;		//称重员
	public Integer getPurId() {
		return purId;
	}
	public void setPurId(Integer purId) {
		this.purId = purId;
	}
	public String getFarmer() {
		return farmer;
	}
	public void setFarmer(String farmer) {
		this.farmer = farmer;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public double getNumber() {
		return number;
	}
	public void setNumber(double number) {
		this.number = number;
	}
	public String getAgent() {
		return agent;
	}
	public void setAgent(String agent) {
		this.agent = agent;
	}
	public String getWeigher() {
		return weigher;
	}
	public void setWeigher(String weigher) {
		this.weigher = weigher;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
}
