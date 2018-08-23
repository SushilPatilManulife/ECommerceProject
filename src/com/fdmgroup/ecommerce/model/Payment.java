package com.fdmgroup.ecommerce.model;
enum PaymentStatus{
	PAID, UNPAID, CANCELED, CLOSED;
}
public class Payment {
	private int paymentId; 
	private int checkoutId;
	private int cusotmerId;
	protected int cardId;
	protected int cardNumbmer;
	private int cardPassword;
	private String cardType;
	private PaymentStatus status;
	private String PaymentDate;
	public Payment() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Payment(int paymentId, int checkoutId, int cusotmerId, int cardId, int cardNumbmer, int cardPassword,
			String cardType, PaymentStatus status, String paymentDate) {
		super();
		this.paymentId = paymentId;
		this.checkoutId = checkoutId;
		this.cusotmerId = cusotmerId;
		this.cardId = cardId;
		this.cardNumbmer = cardNumbmer;
		this.cardPassword = cardPassword;
		this.cardType = cardType;
		this.status = status;
		PaymentDate = paymentDate;
	}
	public int getPaymentId() {
		return paymentId;
	}
	public void setPaymentId(int paymentId) {
		this.paymentId = paymentId;
	}
	public int getCheckoutId() {
		return checkoutId;
	}
	public void setCheckoutId(int checkoutId) {
		this.checkoutId = checkoutId;
	}
	public int getCusotmerId() {
		return cusotmerId;
	}
	public void setCusotmerId(int cusotmerId) {
		this.cusotmerId = cusotmerId;
	}
	public int getCardId() {
		return cardId;
	}
	public void setCardId(int cardId) {
		this.cardId = cardId;
	}
	public int getCardNumbmer() {
		return cardNumbmer;
	}
	public void setCardNumbmer(int cardNumbmer) {
		this.cardNumbmer = cardNumbmer;
	}
	public int getCardPassword() {
		return cardPassword;
	}
	public void setCardPassword(int cardPassword) {
		this.cardPassword = cardPassword;
	}
	public String getCardType() {
		return cardType;
	}
	public void setCardType(String cardType) {
		this.cardType = cardType;
	}
	public PaymentStatus getStatus() {
		return status;
	}
	public void setStatus(PaymentStatus status) {
		this.status = status;
	}
	public String getPaymentDate() {
		return PaymentDate;
	}
	public void setPaymentDate(String paymentDate) {
		PaymentDate = paymentDate;
	}
	@Override
	public String toString() {
		return "Payment [paymentId=" + paymentId + ", checkoutId=" + checkoutId + ", cusotmerId=" + cusotmerId
				+ ", cardId=" + cardId + ", cardNumbmer=" + cardNumbmer + ", cardPassword=" + cardPassword
				+ ", cardType=" + cardType + ", status=" + status + ", PaymentDate=" + PaymentDate + "]";
	} 
}
