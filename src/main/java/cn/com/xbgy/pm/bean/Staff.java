package cn.com.xbgy.pm.bean;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="xb_staff")
public class Staff {
	
	@Id @GeneratedValue(strategy=GenerationType.AUTO)
	private int staffId;
	private String staName;
	private String telePhone;
	private String address;
	private String cardId;
	private String picUrl;
	private String bankCount;
	
	@ManyToOne(targetEntity=Depart.class)
	@JoinColumn(name="depart_id",referencedColumnName="departId")
	private Depart depart;
	public Staff(){}
	
	public int getStaffId() {
		return staffId;
	}
	public void setStaffId(int staffId) {
		this.staffId = staffId;
	}
	public String getStaName() {
		return staName;
	}
	public void setStaName(String staName) {
		this.staName = staName;
	}
	public String getTelePhone() {
		return telePhone;
	}

	public void setTelePhone(String telePhone) {
		this.telePhone = telePhone;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getCardId() {
		return cardId;
	}

	public void setCardId(String cardId) {
		this.cardId = cardId;
	}

	public String getPicUrl() {
		return picUrl;
	}

	public void setPicUrl(String picUrl) {
		this.picUrl = picUrl;
	}

	public String getBankCount() {
		return bankCount;
	}

	public void setBankCount(String bankCount) {
		this.bankCount = bankCount;
	}

	public Depart getDepart() {
		return depart;
	}
	public void setDepart(Depart depart) {
		this.depart = depart;
	}

	@Override
	public String toString() {
		return "Staff [staffId=" + staffId + ", staName=" + staName
				+ ", telePhone=" + telePhone + ", address=" + address
				+ ", cardId=" + cardId + ", picUrl=" + picUrl + ", bankCount="
				+ bankCount + ", depart=" + depart + "]";
	}


	
}
