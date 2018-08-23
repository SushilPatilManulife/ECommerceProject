package com.fdmgroup.ecommerce.model;

public class Card {
	private int cardId;
	private int CardNumber;
	public Card() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Card(int cardId, int cardNumber) {
		super();
		this.cardId = cardId;
		CardNumber = cardNumber;
	}
	public int getCardId() {
		return cardId;
	}
	public void setCardId(int cardId) {
		this.cardId = cardId;
	}
	public int getCardNumber() {
		return CardNumber;
	}
	public void setCardNumber(int cardNumber) {
		CardNumber = cardNumber;
	}
	@Override
	public String toString() {
		return "Card [cardId=" + cardId + ", CardNumber=" + CardNumber + "]";
	}
	
}
