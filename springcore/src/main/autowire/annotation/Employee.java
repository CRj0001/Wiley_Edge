package com.wiley.springcore.autowire.annotation;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Employee {

	//@Qualifier("addr2")
	//@Autowired
	private Address add;
	private List<String> phones;
	private Map<Integer, String> courses;

	public Employee(Address add, List<String> phones, Map<Integer, String> courses) {
		super();
		this.add = add;
		this.phones = phones;
		this.courses = courses;
	}

	public List<String> getPhones() {
		return phones;
	}

	public void setPhones(List<String> phones) {
		this.phones = phones;
	}

	public Map<Integer, String> getCourses() {
		return courses;
	}

	public void setCourses(Map<Integer, String> courses) {
		this.courses = courses;
	}

	public Address getAdd() {
		return add;
	}

	// @Autowired
	public void setAdd(Address add) {
		this.add = add;
	}

	// @Autowired
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Employee [add=" + add + ", phones=" + phones + ", courses=" + courses + "]";
	}

}
