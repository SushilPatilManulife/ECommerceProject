package com.fdmgroup.ecommerce.model;

public class User {
	private int userId;
	private String gender;
	private String firstName;
	private String lastName;
	private String dateOfBirth;
	private String email;
	private String username;
	private String password;
	private int addressId;
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	public User(int userId, String gender, String firstName, String lastName, String dateOfBirth, String email,
			String username, String password, int addressId) {
		super();
		this.userId = userId;
		this.gender = gender;
		this.firstName = firstName;
		this.lastName = lastName;
		this.dateOfBirth = dateOfBirth;
		this.email = email;
		this.username = username;
		this.password = password;
		this.addressId = addressId;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public int getAddressId() {
		return addressId;
	}
	public void setAddressId(int addressId) {
		this.addressId = addressId;
	}
	@Override
	public String toString() {
		return "User [userId=" + userId + ", gender=" + gender + ", firstName=" + firstName + ", lastName=" + lastName
				+ ", dateOfBirth=" + dateOfBirth + ", email=" + email + ", username=" + username + ", password="
				+ password + ", addressId=" + addressId + "]";
	}
}
