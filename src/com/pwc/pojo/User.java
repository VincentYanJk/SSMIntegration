package com.pwc.pojo;

import java.io.Serializable;

public class User implements Serializable{
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int id;
    private String userName;
   
	private String password;
    private int age;
    
  

	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}

	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	public String toString(){
		return "User[id="+id+" , age="+age+" , username="+userName+" , password="+password+"]";
	}
}
