package com.model;

public class Person {
    public String name;
    
    private String hobby;
    
    private Integer sex;

	public String getHobby() {
		return hobby;
	}

	public void setHobby(String hobby) {
		this.hobby = hobby;
	}

	public Integer getSex() {
		return sex;
	}

	public void setSex(Integer sex) {
		this.sex = sex;
	}

	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Person(String name, String hobby, Integer sex) {
		super();
		this.name = name;
		this.hobby = hobby;
		this.sex = sex;
	}
    
    
}
