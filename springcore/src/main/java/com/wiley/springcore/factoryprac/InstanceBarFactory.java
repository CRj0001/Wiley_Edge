package com.wiley.springcore.factoryprac;

public class InstanceBarFactory {
	 public Bar createInstance(String name) {
	        return new Bar(name);
	    }
}
