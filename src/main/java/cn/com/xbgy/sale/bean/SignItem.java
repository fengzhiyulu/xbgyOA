package cn.com.xbgy.sale.bean;


public class SignItem{
	private Integer signItemId;
	private SignOrder signOrder;
	private Goods good;
	private Integer number;
	private String unit;
	private Double price;
	private Double totalPrice;
	
	public SignItem(){};
	public Integer getSignItemId() {
		return signItemId;
	}
	public void setSignItemId(Integer signItemId) {
		this.signItemId = signItemId;
	}
	public SignOrder getSignOrder() {
		return signOrder;
	}
	public void setSignOrder(SignOrder signOrder) {
		this.signOrder = signOrder;
	}
	public Goods getGood() {
		return good;
	}
	public void setGood(Goods good) {
		this.good = good;
	}
	public Integer getNumber() {
		return number;
	}
	public void setNumber(Integer number) {
		this.number = number;
	}
	public String getUnit() {
		return unit;
	}
	public void setUnit(String unit) {
		this.unit = unit;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	public Double getTotalPrice() {
		return totalPrice;
	}
	public void setTotalPrice(Double totalPrice) {
		this.totalPrice = totalPrice;
	}
}
