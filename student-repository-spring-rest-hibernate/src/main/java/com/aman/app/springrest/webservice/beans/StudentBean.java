package com.aman.app.springrest.webservice.beans;

public class StudentBean implements java.io.Serializable {

	private static final long serialVersionUID = 1L;
	private int id;
	private String name;
	private Integer age;
	private String course;
	private String address;
	private String contact;

	public StudentBean() {
		//Default constructor
	}

	public StudentBean(int id) {
		this.id = id;
	}

	public StudentBean(int id, String name, Integer age, String course, String address, String contact) {
		this.id = id;
		this.name = name;
		this.age = age;
		this.course = course;
		this.address = address;
		this.contact = contact;
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getAge() {
		return this.age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public String getCourse() {
		return this.course;
	}

	public void setCourse(String course) {
		this.course = course;
	}

	public String getAddress() {
		return this.address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getContact() {
		return this.contact;
	}

	public void setContact(String contact) {
		this.contact = contact;
	}

}
