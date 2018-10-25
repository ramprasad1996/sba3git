package com.example.crud.model;

public class User {

	private int custid;
	private String name;
	private String DOJ;
	private String city;
	private String phone;
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	public User(int custid, String name, String DOJ, String city, String phone) {
		super();
		this.custid = custid;
		this.name = name;
		this.DOJ = DOJ;
		this.city = city;
		this.phone = phone;
	}
	public int getCustid() {
		return custid;
	}
	public void setCustid(int custid) {
		this.custid = custid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDOJ() {
		return DOJ;
	}
	public void setDOJ(String dOJ) {
		DOJ = dOJ;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
}
	