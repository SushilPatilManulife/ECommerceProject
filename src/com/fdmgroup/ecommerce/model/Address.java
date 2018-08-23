package com.fdmgroup.ecommerce.model;

public class Address {
	private int addressId;
	private int userId;
	private int telephoneNumber;
	private String streetAddress;
	private String zipCode;
	private String city;
	private String province;
	private String country;
	private String addressType;
	private String dateOfAddressCreation;
	public Address() {
		super();
	}
	public Address(int addressId, int userId, int telephoneNumber, String streetAddress, String zipCode, String city,
			String province, String country, String addressType, String dateOfAddressCreation) {
		super();
		this.addressId = addressId;
		this.userId = userId;
		this.telephoneNumber = telephoneNumber;
		this.streetAddress = streetAddress;
		this.zipCode = zipCode;
		this.city = city;
		this.province = province;
		this.country = country;
		this.addressType = addressType;
		this.dateOfAddressCreation = dateOfAddressCreation;
	}
	public int getAddressId() {
		return addressId;
	}
	public void setAddressId(int addressId) {
		this.addressId = addressId;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public int getTelephoneNumber() {
		return telephoneNumber;
	}
	public void setTelephoneNumber(int telephoneNumber) {
		this.telephoneNumber = telephoneNumber;
	}
	public String getStreetAddress() {
		return streetAddress;
	}
	public void setStreetAddress(String streetAddress) {
		this.streetAddress = streetAddress;
	}
	public String getZipCode() {
		return zipCode;
	}
	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getProvince() {
		return province;
	}
	public void setProvince(String province) {
		this.province = province;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getAddressType() {
		return addressType;
	}
	public void setAddressType(String addressType) {
		this.addressType = addressType;
	}
	public String getDateOfAddressCreation() {
		return dateOfAddressCreation;
	}
	public void setDateOfAddressCreation(String dateOfAddressCreation) {
		this.dateOfAddressCreation = dateOfAddressCreation;
	}
	@Override
	public String toString() {
		return "Address [addressId=" + addressId + ", userId=" + userId + ", telephoneNumber=" + telephoneNumber
				+ ", streetAddress=" + streetAddress + ", zipCode=" + zipCode + ", city=" + city + ", province="
				+ province + ", country=" + country + ", addressType=" + addressType + ", dateOfAddressCreation="
				+ dateOfAddressCreation + "]";
	}
}
