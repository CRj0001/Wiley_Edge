package com.wiley.springcore.autowire;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class AWMain {
	public static void main(String[] args) {
		ApplicationContext cont = new ClassPathXmlApplicationContext("com/wiley/springcore/autowire/configAw.xml");
		Employee emp = (Employee) cont.getBean("emp1");
		System.out.println(emp);
	}
}
