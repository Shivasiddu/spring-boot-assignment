package com.zensar.springbootdemo.dto;

public class ProductDto {

	private int productId;
	private String productcode;
	private String expDate;

	public ProductDto(int productId, String productcode, String expDate) {
		super();
		this.productId = productId;
		this.productcode = productcode;
		this.expDate = expDate;
	}

	public int getProductId() {
		return productId;
	}

	public void setProductId(int productId) {
		this.productId = productId;
	}

	public String getProductName() {
		return productcode;
	}

	public void setProductName(String productName) {
		this.productcode = productName;
	}

	public String getExpDate() {
		return expDate;
	}

	public void setExpDate(String expDate) {
		this.expDate = expDate;
	}

	@Override
	public String toString() {
		return "ProductDto [productId=" + productId + ", productName=" + productcode + ", expDate=" + expDate + "]";
	}

}
