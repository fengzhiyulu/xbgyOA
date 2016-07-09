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
@Table(name="xb_depart")
public class Depart {
	@Id @GeneratedValue(strategy=GenerationType.AUTO)
	private int departId;
	private String depName;
	@OneToMany(targetEntity=Staff.class,mappedBy="depart")
	private Set<Staff> staffSet=new LinkedHashSet<Staff>();
	
	public Depart(){}

	public int getDepartId() {
		return departId;
	}

	public void setDepartId(int departId) {
		this.departId = departId;
	}

	public String getDepName() {
		return depName;
	}
	public void setDepName(String depName) {
		this.depName = depName;
	}

	public Set<Staff> getStaffSet() {
		return staffSet;
	}

	public void setStaffSet(Set<Staff> staffSet) {
		this.staffSet = staffSet;
	}

	
	
}
