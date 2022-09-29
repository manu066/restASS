package com.pojo;

public class ObjectClass {
//declare variable globale variable
	String eName;
	String eID;
	int[] phoneNo;
	String email;
	String address;
	WifeDetails wife;

	public ObjectClass(String eName, String eID, int[] i, String email, String address, WifeDetails wife) {
		this.eName = eName;
		this.eID = eID;
		this.phoneNo = i;
		this.email = email;
		this.address = address;
		this.wife = wife;
	}

	public ObjectClass() {

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

	public WifeDetails getWife() {
		return wife;
	}

	public void setWife(WifeDetails wife) {
		this.wife = wife;
	}

}
