package com.wiley.springcore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
//		System.out.println("Hello World!");
//		ApplicationContext cont = new ClassPathXmlApplicationContext("config.xml");
//		System.out.println("Hello World!");
//		Student wts1 = (Student) cont.getBean("WileyStudent1");
//		Student wts2 = (Student) cont.getBean("WileyStudent2");
//
//		System.out.println("Hello World!");
//		System.out.println(wts1.toString());
//		System.out.println(wts2.toString());
	
		
		
		
		
		
		
		
	//Map and SET
		ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
		Student1 xstd1 = (Student1) context.getBean("stdMS1");
		System.out.println(xstd1.toString());
	}
}
