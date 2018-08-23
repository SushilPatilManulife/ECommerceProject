package com.fdmgroup.ecommerce.model;
enum OrderStatus{
	 NEW,
	 PENDING,
	 ONHOLD,
	 SHIPPED,
	 DELIVERED,
	 CLOSED;
}
public class Order {
	private int orderid;
	private int customerId;
	private Boolean isConfirmed;
	private String OrderDate;
	private String ShippingDate;
	private String ShippingAddress;
	private OrderStatus orderStatus;
	public Order() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Order(int orderid, int customerId, Boolean isConfirmed, String orderDate, String shippingDate,
			String shippingAddress, OrderStatus orderStatus) {
		super();
		this.orderid = orderid;
		this.customerId = customerId;
		this.isConfirmed = isConfirmed;
		OrderDate = orderDate;
		ShippingDate = shippingDate;
		ShippingAddress = shippingAddress;
		this.orderStatus = orderStatus;
	}
	public int getOrderid() {
		return orderid;
	}
	public void setOrderid(int orderid) {
		this.orderid = orderid;
	}
	public int getCustomerId() {
		return customerId;
	}
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
	public Boolean getIsConfirmed() {
		return isConfirmed;
	}
	public void setIsConfirmed(Boolean isConfirmed) {
		this.isConfirmed = isConfirmed;
	}
	public String getOrderDate() {
		return OrderDate;
	}
	public void setOrderDate(String orderDate) {
		OrderDate = orderDate;
	}
	public String getShippingDate() {
		return ShippingDate;
	}
	public void setShippingDate(String shippingDate) {
		ShippingDate = shippingDate;
	}
	public String getShippingAddress() {
		return ShippingAddress;
	}
	public void setShippingAddress(String shippingAddress) {
		ShippingAddress = shippingAddress;
	}
	public OrderStatus getOrderStatus() {
		return orderStatus;
	}
	public void setOrderStatus(OrderStatus orderStatus) {
		this.orderStatus = orderStatus;
	}
	@Override
	public String toString() {
		return "Order [orderid=" + orderid + ", customerId=" + customerId + ", isConfirmed=" + isConfirmed
				+ ", OrderDate=" + OrderDate + ", ShippingDate=" + ShippingDate + ", ShippingAddress=" + ShippingAddress
				+ ", orderStatus=" + orderStatus + "]";
	}
}
