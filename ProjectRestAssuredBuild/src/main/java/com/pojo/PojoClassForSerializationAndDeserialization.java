package com.pojo;

public class PojoClassForSerializationAndDeserialization {
	
	String eName;
	String eID;
	int phoneNo;
	String email;
	String address;
	// Create the constructor for initialization
	public PojoClassForSerializationAndDeserialization(String eName, String eID, int phoneNo, String email,
			String address) {
		
		this.eName = eName;
		this.eID = eID;
		this.phoneNo = phoneNo;
		this.email = email;
		this.address = address;
	}
	
	// triggering execution during serialization or deserialization

	public PojoClassForSerializationAndDeserialization()
	{
		
	}
	//getter and setter for access

	public void seteName(String eName) {
		this.eName = eName;
	}

	public void seteID(String eID) {
		this.eID = eID;
	}

	public void setPhoneNo(int phoneNo) {
		this.phoneNo = phoneNo;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String geteName() {
		return eName;
	}

	public String geteID() {
		return eID;
	}

	public int getPhoneNo() {
		return phoneNo;
	}

	public String getEmail() {
		return email;
	}

	public String getAddress() {
		return address;
	}
	
	
	

}
