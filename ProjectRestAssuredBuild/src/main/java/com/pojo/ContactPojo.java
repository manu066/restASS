package com.pojo;



public class ContactPojo {
String FirstName;
String LastName;
String Company;
int Phoneno;
String url;
String Address;
String Birthday;
String[] RelatedName;
Family family;
public ContactPojo(String firstName, String lastName, String company, int phoneno, String url, String address,
		String birthday, String[] relatedName, Family family) {
	super();
	FirstName = firstName;
	LastName = lastName;
	Company = company;
	Phoneno = phoneno;
	this.url = url;
	Address = address;
	Birthday = birthday;
	RelatedName = relatedName;
	this.family = family;
}
public ContactPojo()
{
	
}
public String getFirstName() {
	return FirstName;
}
public void setFirstName(String firstName) {
	FirstName = firstName;
}
public String getLastName() {
	return LastName;
}
public void setLastName(String lastName) {
	LastName = lastName;
}
public String getCompany() {
	return Company;
}
public void setCompany(String company) {
	Company = company;
}
public int getPhoneno() {
	return Phoneno;
}
public void setPhoneno(int phoneno) {
	Phoneno = phoneno;
}
public String getUrl() {
	return url;
}
public void setUrl(String url) {
	this.url = url;
}
public String getAddress() {
	return Address;
}
public void setAddress(String address) {
	Address = address;
}
public String getBirthday() {
	return Birthday;
}
public void setBirthday(String birthday) {
	Birthday = birthday;
}
public String[] getRelatedName() {
	return RelatedName;
}
public void setRelatedName(String[] relatedName) {
	RelatedName = relatedName;
}
public Family getFamily() {
	return family;
}
public void setFamily(Family family) {
	this.family = family;
}

}

