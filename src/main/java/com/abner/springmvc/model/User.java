package com.abner.springmvc.model;

public interface User {
	String getHomeAddr();
	
	void setHomeAddr(String homeAddr);
	
	String getCompanyAddr();
	
	void setCompanyAddr(String companyAddr);
	
	String getUserName();
	
	void setUserName(String userName);
	
	int getAge();
	
	void setAge(int age);
}
