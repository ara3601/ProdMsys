package com.wipro.demo.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Product {
	@Id
	private int prodId;
	private String prodName;
	private int prodQty;
	private double prodPrice;
	
	public Product(int prodId, String prodName, int prodQty, double prodPrice) {
		super();
		this.prodId = prodId;
		this.prodName = prodName;
		this.prodQty = prodQty;
		this.prodPrice = prodPrice;
	}
	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getProdId() {
		return prodId;
	}
	public void setProdId(int prodId) {
		this.prodId = prodId;
	}
	public String getProdName() {
		return prodName;
	}
	public void setProdName(String prodName) {
		this.prodName = prodName;
	}
	public int getProdQty() {
		return prodQty;
	}
	public void setProdQty(int prodQty) {
		this.prodQty = prodQty;
	}
	public double getProdPrice() {
		return prodPrice;
	}
	public void setProdPrice(double prodPrice) {
		this.prodPrice = prodPrice;
	}
	
}
