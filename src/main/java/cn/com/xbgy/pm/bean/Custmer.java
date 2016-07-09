package cn.com.xbgy.pm.bean;

import java.util.LinkedHashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="xb_custmer")
public class Custmer {
	@Id @GeneratedValue(strategy=GenerationType.AUTO)
	private int custmerId;
	private String custmerName;
	private String address;
	private String carNumber;//车牌号
	private String telephone;
	private String alias;
	public Custmer(){}
	public int getCustmerId() {
		return custmerId;
	}
	public void setCustmerId(int custmerId) {
		this.custmerId = custmerId;
	}
	public String getCustmerName() {
		return custmerName;
	}
	public void setCustmerName(String custmerName) {
		this.custmerName = custmerName;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getCarNumber() {
		return carNumber;
	}
	public void setCarNumber(String carNumber) {
		this.carNumber = carNumber;
	}
	public String getTelephone() {
		return telephone;
	}
	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}
	public String getAlias() {
		return alias;
	}
	public void setAlias(String alias) {
		this.alias = alias;
	}
	
}
