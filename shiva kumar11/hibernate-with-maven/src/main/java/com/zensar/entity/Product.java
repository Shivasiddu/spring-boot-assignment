package com.zensar.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Product {
	@Id
	
	private int productid;
	private String productName;
	private int productcost;
	
	
	
	
	public Product() {
		super();
	}
	
	
	public Product(int productid, String productName, int productcost) {
		super();
		this.productid = productid;
		this.productName = productName;
		this.productcost = productcost;
	}


	public int getProductid() {
		return productid;
	}
	public void setProductid(int productid) {
		this.productid = productid;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public int getProductcost() {
		return productcost;
	}
	public void setProductcost(int productcost) {
		this.productcost = productcost;
	}


	@Override
	public String toString() {
		return "product [productid=" + productid + ", productName=" + productName + ", productcost=" + productcost
				+ "]";
	}
	
	

}
