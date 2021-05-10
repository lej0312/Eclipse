package com.product.model;

public class Product {
	private long productId; //상품아이디
	private String pname; //상품명
	private Integer unitPrice; //상품가격
	private String description; //상품설명
	private String manufacturer; //제조사
	private String category; //분류
	private long unitsInStock; //재고수
	private String condition; //신상품, 중고품, 재생품
	private String filename;
	
	//getter, setter
	public long getProductId() {
		return productId;
	}
	public String getPname() {
		return pname;
	}
	public Integer getUnitPrice() {
		return unitPrice;
	}
	public String getDescription() {
		return description;
	}
	public String getManufacturer() {
		return manufacturer;
	}
	public String getCategory() {
		return category;
	}
	public long getUnitsInStock() {
		return unitsInStock;
	}
	public String getCondition() {
		return condition;
	}
	public String getFilename() {
		return filename;
	}
	public void setProductId(long productId) {
		this.productId = productId;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public void setUnitPrice(Integer unitPrice) {
		this.unitPrice = unitPrice;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public void setUnitsInStock(long unitsInStock) {
		this.unitsInStock = unitsInStock;
	}
	public void setCondition(String condition) {
		this.condition = condition;
	}
	public void setFilename(String filename) {
		this.filename = filename;
	}
	
	
}
