package com.wiley.springcore.Ci;

public class Person {
	private int id;
	private String name;
	private Certificate cert;

	public Person(int id, String name,Certificate cert) {
		super();
		this.id = id;
		this.name = name;
		this.cert = cert;
	}

	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + ", Certificate="+cert.name+"]";
	}

}
