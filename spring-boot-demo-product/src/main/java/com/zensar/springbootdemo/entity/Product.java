package com.zensar.springbootdemo.entity;

import javax.persistence.Entity;

import javax.persistence.Id;
import javax.persistence.NamedNativeQuery;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;

import com.zensar.springbootdemo.entity.*;

@NamedQueries(value = { @NamedQuery(name = "Product.test", query = "from Product c where c.productCode=?1"),
		@NamedQuery(name = "Product.test1", query = "from Product c where c.productCode=?1 and c.productId=?2") })
//@NamedQuery(name="Product.com" ,query="from Product c where c.productCode=?1")
//@NamedQuery(name="Product.com1",query="from Product c where c.productCode=?1 and c.productId=?2")
@NamedNativeQuery(name = "Product.test2", query = "select * from Product c where c.product_code=?1 and c.product_id=?2 ", resultClass = Product.class)

@Entity
public class Product {
	@Id

	private int productId;
	private String productCode;
	private String expDate;
	private String productName;

	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Product(int productId, String productCode, String expDate, String productName) {
		super();
		this.productId = productId;
		this.productCode = productCode;
		this.expDate = expDate;
		this.productName = productName;
	}

	public int getProductId() {
		return productId;
	}

	public void setProductId(int productId) {
		this.productId = productId;
	}

	public String getProductCode() {
		return productCode;
	}

	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}

	public String getExpDate() {
		return expDate;
	}

	public void setExpDate(String expDate) {
		this.expDate = expDate;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	@Override
	public String toString() {
		return "Product [productId=" + productId + ", productCode=" + productCode + ", expDate=" + expDate
				+ ", productName=" + productName + "]";
	}

}