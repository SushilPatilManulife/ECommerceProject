package com.fdmgroup.ecommerce.model;

public abstract class Category {
	protected String productCategory;
	protected String description;
	public Category() {
		super();
	}
	public Category(String productCategory, String description) {
		super();
		this.productCategory = productCategory;
		this.description = description;
	}
	public String getProductCategory() {
		return productCategory;
	}
	public void setProductCategory(String productCategory) {
		this.productCategory = productCategory;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	@Override
	public String toString() {
		return "Category [productCategory=" + productCategory + ", description=" + description + "]";
	}
}
