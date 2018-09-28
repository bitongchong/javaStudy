package com.bitongchong.springmvc.entities;

public class Employee {


	private Integer id;
	private String lastName;
	private String email;
	
	private Integer dpetId;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Integer getDpetId() {
		return dpetId;
	}

	public void setDpetId(Integer dpetId) {
		this.dpetId = dpetId;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", lastName=" + lastName + ", email="
				+ email + ", dpetId=" + dpetId + "]";
	}

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Employee(Integer id, String lastName, String email, Integer dpetId) {
		super();
		this.id = id;
		this.lastName = lastName;
		this.email = email;
		this.dpetId = dpetId;
	}

	
}
