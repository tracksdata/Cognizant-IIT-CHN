package com.cts.product.entities;

import java.util.List;

public class Product {

	private String prodId;
	private String prodName;
	private double price;
	// private String[] branches;
	private String branchName;
	private String itemType;
	private String countryName;
	private String stateName;
	
	
	
	//private List<String> countries
	
	

	public String getCountryName() {
		return countryName;
	}

	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}

	public String getStateName() {
		return stateName;
	}

	public void setStateName(String stateName) {
		this.stateName = stateName;
	}

	public String getBranchName() {
		return branchName;
	}

	public String getItemType() {
		return itemType;
	}

	public void setItemType(String itemType) {
		this.itemType = itemType;
	}

	public void setBranchName(String branchName) {
		this.branchName = branchName;
	}

	public String getProdId() {
		return prodId;
	}

	public void setProdId(String prodId) {
		this.prodId = prodId;
	}

	public String getProdName() {
		return prodName;
	}

	public void setProdName(String prodName) {
		this.prodName = prodName;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

}
