package com.wiley.springcore.misc;

public class Product {
	
	public static final Product obj = new Product();
	
	public Product() {
		System.out.println("Product obj is called");
		
	}
	
	public static Product getProduct() {
		System.out.println("called");
		return obj;
	}
	
	public void productName() {
		System.out.println("SHOES");
	}

}
