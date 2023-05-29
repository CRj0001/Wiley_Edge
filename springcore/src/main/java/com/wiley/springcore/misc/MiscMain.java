package com.wiley.springcore.misc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MiscMain {
	public static void main(String[] args) {
		ApplicationContext cont = new ClassPathXmlApplicationContext("com/wiley/springcore/misc/configCi.xml");
		Employee e = cont.getBean("emp",Employee.class);
		System.out.println(e);
		
		Product p = cont.getBean("prod",Product.class);
		System.out.println(p);
		//p.productName();
	}
}
