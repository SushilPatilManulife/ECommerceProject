package com.fdmgroup.ecommerce.model;

public class Cart {
	private Boolean isPromotion;
	private Boolean isEmpty;
	private int productId;
	private int productQuantity;
	private String cartDate;
	public Cart() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Cart(Boolean isPromotion, Boolean isEmpty, int productId, int productQuantity, String cartDate) {
		super();
		this.isPromotion = isPromotion;
		this.isEmpty = isEmpty;
		this.productId = productId;
		this.productQuantity = productQuantity;
		this.cartDate = cartDate;
	}
	public Boolean getIsPromotion() {
		return isPromotion;
	}
	public void setIsPromotion(Boolean isPromotion) {
		this.isPromotion = isPromotion;
	}
	public Boolean getIsEmpty() {
		return isEmpty;
	}
	public void setIsEmpty(Boolean isEmpty) {
		this.isEmpty = isEmpty;
	}
	public int getProductId() {
		return productId;
	}
	public void setProductId(int productId) {
		this.productId = productId;
	}
	public int getProductQuantity() {
		return productQuantity;
	}
	public void setProductQuantity(int productQuantity) {
		this.productQuantity = productQuantity;
	}
	public String getCartDate() {
		return cartDate;
	}
	public void setCartDate(String cartDate) {
		this.cartDate = cartDate;
	}
	@Override
	public String toString() {
		return "Cart [isPromotion=" + isPromotion + ", isEmpty=" + isEmpty + ", productId=" + productId
				+ ", productQuantity=" + productQuantity + ", cartDate=" + cartDate + "]";
	}
}
