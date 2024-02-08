package com.project.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="userDetails")
public class User{
	@Id
	private String emailid;
	private String firstName;
	private String lastName;
	public User(String emailid, String firstName, String lastName) {
		super();
		this.emailid = emailid;
		this.firstName = firstName;
		this.lastName = lastName;
	}
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getEmailid() {
		return emailid;
	}
	public void setEmailid(String emailid) {
		this.emailid = emailid;
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
	@Override
	public String toString() {
		return "User [emailid=" + emailid + ", firstName=" + firstName + ", lastName=" + lastName + ", getEmailid()="
				+ getEmailid() + ", getFirstName()=" + getFirstName() + ", getLastName()=" + getLastName()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}
	
	
}