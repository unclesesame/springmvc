package com.abner.springmvc.model;

public class UserImpl implements User{
	String userName;
	int age;
	String homeAddr;
	String companyAddr;
	
	public UserImpl(){
		
	}
	
	public UserImpl(String username, int age){
		this.userName = username;
		this.age = age;
	}
	
	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getHomeAddr() {
		return homeAddr;
	}

	public void setHomeAddr(String homeAddr) {
		this.homeAddr = homeAddr;
	}

	public String getCompanyAddr() {
		return companyAddr;
	}

	public void setCompanyAddr(String companyAddr) {
		this.companyAddr = companyAddr;
	}

}
