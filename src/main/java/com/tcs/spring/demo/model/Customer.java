package com.tcs.spring.demo.model;

public class Customer {
	
	   private String id;
	   private String name;
	   private int age;
	   private String telnum;
	   private String email;
	   
	   public Customer() {
		// TODO Auto-generated constructor stub
	}
	   
	   
	public Customer(String id, String name, int age, String telnum, String email) {
		//super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.telnum = telnum;
		this.email = email;
	}


	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getTelnum() {
		return telnum;
	}
	public void setTelnum(String telnum) {
		this.telnum = telnum;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	   
	   
	   

}
