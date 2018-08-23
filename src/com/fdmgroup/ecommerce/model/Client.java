package com.fdmgroup.ecommerce.model;

public class Client {
	private int clientId;
	public Client() {
		super();
	}
	public Client(int clientId) {
		super();
		this.clientId = clientId;
	}
	public int getClientId() {
		return clientId;
	}
	public void setClientId(int clientId) {
		this.clientId = clientId;
	}
	@Override
	public String toString() {
		return "Client [clientId=" + clientId + "]";
	}
}
