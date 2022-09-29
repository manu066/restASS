package com.pojo;

public class ArraydecarationPojo {

	String eName;
	String eID;
	int[] phoneNo;
	String email;
	String address;
	//create constructor
	public ArraydecarationPojo(String eName, String eID, int[] phoneNo, String email, String address) {
		super();
		this.eName = eName;
		this.eID = eID;
		this.phoneNo = phoneNo;
		this.email = email;
		this.address = address;
		
		
		
		
		
	}
	//constructor
	public ArraydecarationPojo()
	{
		
	}
	public String geteName() {
		return eName;
	}
	public void seteName(String eName) {
		this.eName = eName;
	}
	public String geteID() {
		return eID;
	}
	public void seteID(String eID) {
		this.eID = eID;
	}
	public int[] getPhoneNo() {
		return phoneNo;
	}
	public void setPhoneNo(int[] phoneNo) {
		this.phoneNo = phoneNo;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	
}
