package com.fdmgroup.ecommerce.model;

import java.sql.Blob;
import java.util.List;

public class Inventory {
	private int productId;
	private String productName;
	private String generalDescription;
	private String setOfCharacteristics;
	private String provider;
	private int stockQuantity;
	private float unitCost;
	private float unitPrice;
	private Blob image;
	private List<Category> Observer;
	private int state;
	public Inventory() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Inventory(int productId, String productName, String generalDescription, String setOfCharacteristics,
			String provider, int stockQuantity, float unitCost, float unitPrice, Blob image, List<Category> observer,
			int state) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.generalDescription = generalDescription;
		this.setOfCharacteristics = setOfCharacteristics;
		this.provider = provider;
		this.stockQuantity = stockQuantity;
		this.unitCost = unitCost;
		this.unitPrice = unitPrice;
		this.image = image;
		Observer = observer;
		this.state = state;
	}
	public int getProductId() {
		return productId;
	}
	public void setProductId(int productId) {
		this.productId = productId;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public String getGeneralDescription() {
		return generalDescription;
	}
	public void setGeneralDescription(String generalDescription) {
		this.generalDescription = generalDescription;
	}
	public String getSetOfCharacteristics() {
		return setOfCharacteristics;
	}
	public void setSetOfCharacteristics(String setOfCharacteristics) {
		this.setOfCharacteristics = setOfCharacteristics;
	}
	public String getProvider() {
		return provider;
	}
	public void setProvider(String provider) {
		this.provider = provider;
	}
	public int getStockQuantity() {
		return stockQuantity;
	}
	public void setStockQuantity(int stockQuantity) {
		this.stockQuantity = stockQuantity;
	}
	public float getUnitCost() {
		return unitCost;
	}
	public void setUnitCost(float unitCost) {
		this.unitCost = unitCost;
	}
	public float getUnitPrice() {
		return unitPrice;
	}
	public void setUnitPrice(float unitPrice) {
		this.unitPrice = unitPrice;
	}
	public Blob getImage() {
		return image;
	}
	public void setImage(Blob image) {
		this.image = image;
	}
	public List<Category> getObserver() {
		return Observer;
	}
	public void setObserver(List<Category> observer) {
		Observer = observer;
	}
	public int getState() {
		return state;
	}
	public void setState(int state) {
		this.state = state;
	}
	@Override
	public String toString() {
		return "Inventory [productId=" + productId + ", productName=" + productName + ", generalDescription="
				+ generalDescription + ", setOfCharacteristics=" + setOfCharacteristics + ", provider=" + provider
				+ ", stockQuantity=" + stockQuantity + ", unitCost=" + unitCost + ", unitPrice=" + unitPrice
				+ ", image=" + image + ", Observer=" + Observer + ", state=" + state + "]";
	}
}
