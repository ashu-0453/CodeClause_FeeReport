package com.swing;

public class Student {
	
	private Integer rollno,fee,paid,due;
	private String name,department,year,dob;
	private String address,city,email,contact;

	public Student() {
		// TODO Auto-generated constructor stub
	}

	

	public Student(Integer rollno,String name,String email,String department,Integer fee,Integer paid,Integer due,String address,String city,String year,String dob,String contact) {
		super();
		this.rollno = rollno;
		this.name = name;
		this.email = email;
		this.department = department;
		this.fee = fee;
		this.paid = paid;
		this.due = due;
		this.address = address;
		this.city = city;
		this.year = year;
		this.dob = dob;
		this.contact = contact;
	}



	public Integer getRollno() {
		return rollno;
	}
	public void setRollno(Integer rollno) {
		this.rollno = rollno;
	}


	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}


	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	
	
	
	public Integer getFee() {
		return fee;
	}
	public void setFee(Integer fee) {
		this.fee = fee;
	}



	public Integer getPaid() {
		return paid;
	}
	public void setPaid(Integer paid) {
		this.paid = paid;
	}



	public Integer getDue() {
		return due;
	}
	public void setDue(Integer due) {
		this.due = due;
	}

	



	public String getYear() {
		return year;
	}



	public void setYear(String year) {
		this.year = year;
	}



	public String getDob() {
		return dob;
	}



	public void setDob(String dob) {
		this.dob = dob;
	}



	public String getAddress() {
		return address;
	}



	public void setAddress(String address) {
		this.address = address;
	}



	public String getCity() {
		return city;
	}



	public void setCity(String city) {
		this.city = city;
	}



	



	public String getContact() {
		return contact;
	}



	public void setContact(String contact) {
		this.contact = contact;
	}



	
	
	
	
	

}
