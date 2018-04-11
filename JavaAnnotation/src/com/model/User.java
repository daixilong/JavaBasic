package com.model;

import com.annotation.ContactAnnotation;
import com.util.ContactType;

public class User {

	private Integer id;
	
	private String name;
	
	@ContactAnnotation(type=ContactType.PHONE)
	private String phone;
	
	@ContactAnnotation(type=ContactType.MOBILE)
	private String mobile;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	
	
}
