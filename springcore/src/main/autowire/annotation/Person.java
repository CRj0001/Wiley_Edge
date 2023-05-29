package com.wiley.springcore.autowire.annotation;

import java.util.List;

public class Person {
	List<String> list;
	

	public Person(List<String> list) {
		super();
		this.list = list;
	}

	public List<String> getList() {
		return list;
	}

	public void setList(List<String> list) {
		this.list = list;
	}

	@Override
	public String toString() {
		return "Person [list=" + list + "]";
	}

	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}

}
