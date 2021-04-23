package com.user.entity;

public class Contact {
	private Long cId;
	private String email;
	private String conatctName;
	
	private Long userId;

	public Contact(Long cId, String email, String conatctName, Long userId) {
		super();
		this.cId = cId;
		this.email = email;
		this.conatctName = conatctName;
		this.userId = userId;
	}

	public Contact() {

	}

	public Long getcId() {
		return cId;
	}

	public void setcId(Long cId) {
		this.cId = cId;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getConatctName() {
		return conatctName;
	}

	public void setConatctName(String conatctName) {
		this.conatctName = conatctName;
	}

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}
	
	
	
	
}
