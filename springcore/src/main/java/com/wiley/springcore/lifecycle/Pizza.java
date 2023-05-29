package com.wiley.springcore.lifecycle;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Pizza {
	private String flavour;

	public String getFlavour() {
		return flavour;
	}

	public void setFlavour(String flavour) {
		this.flavour = flavour;
	}

	public Pizza() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Pizza(String flavour) {
		super();
		this.flavour = flavour;
	}

	@Override
	public String toString() {
		return "Pizza [flavour=" + flavour + "]";
	}

	@PostConstruct
	public void start() {
		System.out.println("Initialize object");
	}
	
	@PreDestroy
	public void destroy() {
		System.out.println("Object DESTROYED!!!!");
	}
}
