package com.wiley.springcore.autowire.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class AWAnnoMain {
	public static void main(String[] args) {
//		ApplicationContext cont = new ClassPathXmlApplicationContext("com/wiley/springcore/autowire/annotation/configAw.xml");
//		Employee emp = (Employee) cont.getBean("emp1");
//		System.out.println(emp);
	
		ApplicationContext cont = new ClassPathXmlApplicationContext("com/wiley/springcore/autowire/annotation/configAw.xml");
		Person emp = (Person) cont.getBean("person1");
		System.out.println(emp);
	}
}
