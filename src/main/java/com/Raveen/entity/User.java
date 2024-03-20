package com.Raveen.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="users")
public class User {
	@Id
	public String userName;
	
	public String firstName;
	public String lastName;

	private String passWord;
	private String confpassWord;
		
	
	public User() {
		super();
	}
	public User(int userId, String firstName, String lastName, String userName, String passWord, String confpassWord) {
		super();
		
		this.firstName = firstName;
		this.lastName = lastName;
		this.userName = userName;
		this.passWord = passWord;
		this.confpassWord = confpassWord;
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
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassWord() {
		return passWord;
	}
	public void setPassWord(String passWord) {
		this.passWord = passWord;
	}
	public String getConfpassWord() {
		return confpassWord;
	}
	public void setConfpassWord(String confpassWord) {
		this.confpassWord = confpassWord;
	}
	

}
