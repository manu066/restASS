package com.pojo;

public class Family
{
	String FirstName;
	String Address;
	int Phoneno;
	public Family(String firstName, String address, int phoneno) {
		
		FirstName = firstName;
		Address = address;
		Phoneno = phoneno;
	}
	public Family()
	{
		
	}
	public String getFirstName() {
		return FirstName;
	}
	public void setFirstName(String firstName) {
		FirstName = firstName;
	}
	public String getAddress() {
		return Address;
	}
	public void setAddress(String address) {
		Address = address;
	}
	public int getPhoneno() {
		return Phoneno;
	}
	public void setPhoneno(int phoneno) {
		Phoneno = phoneno;
	}
	
}
