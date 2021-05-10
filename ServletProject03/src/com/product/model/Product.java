package com.product.model;

public class Product {
	private long productId; //��ǰ���̵�
	private String pname; //��ǰ��
	private Integer unitPrice; //��ǰ����
	private String description; //��ǰ����
	private String manufacturer; //������
	private String category; //�з�
	private long unitsInStock; //����
	private String condition; //�Ż�ǰ, �߰�ǰ, ���ǰ
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
