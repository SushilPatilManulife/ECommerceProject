package com.fdmgroup.ecommerce.model;

public class Checkout {
	private int Checkout_ID;
	private int Customer_ID;
	private int Card_ID;
	private int Product_ID;
	private float TotalPrice;
	private String ShippingAddress;
	private String PaymentMethod;
	public Checkout() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Checkout(int checkout_ID, int customer_ID, int card_ID, int product_ID, float totalPrice,
			String shippingAddress, String paymentMethod) {
		super();
		Checkout_ID = checkout_ID;
		Customer_ID = customer_ID;
		Card_ID = card_ID;
		Product_ID = product_ID;
		TotalPrice = totalPrice;
		ShippingAddress = shippingAddress;
		PaymentMethod = paymentMethod;
	}
	public int getCheckout_ID() {
		return Checkout_ID;
	}
	public void setCheckout_ID(int checkout_ID) {
		Checkout_ID = checkout_ID;
	}
	public int getCustomer_ID() {
		return Customer_ID;
	}
	public void setCustomer_ID(int customer_ID) {
		Customer_ID = customer_ID;
	}
	public int getCard_ID() {
		return Card_ID;
	}
	public void setCard_ID(int card_ID) {
		Card_ID = card_ID;
	}
	public int getProduct_ID() {
		return Product_ID;
	}
	public void setProduct_ID(int product_ID) {
		Product_ID = product_ID;
	}
	public float getTotalPrice() {
		return TotalPrice;
	}
	public void setTotalPrice(float totalPrice) {
		TotalPrice = totalPrice;
	}
	public String getShippingAddress() {
		return ShippingAddress;
	}
	public void setShippingAddress(String shippingAddress) {
		ShippingAddress = shippingAddress;
	}
	public String getPaymentMethod() {
		return PaymentMethod;
	}
	public void setPaymentMethod(String paymentMethod) {
		PaymentMethod = paymentMethod;
	}
	@Override
	public String toString() {
		return "Checkout [Checkout_ID=" + Checkout_ID + ", Customer_ID=" + Customer_ID + ", Card_ID=" + Card_ID
				+ ", Product_ID=" + Product_ID + ", TotalPrice=" + TotalPrice + ", ShippingAddress=" + ShippingAddress
				+ ", PaymentMethod=" + PaymentMethod + "]";
	}
}
