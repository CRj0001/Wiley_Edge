package com.wiley.springcore.Ci;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CiMain {
	public static void main(String[] args) {
		ApplicationContext cont = new ClassPathXmlApplicationContext("com/wiley/springcore/Ci/configCi.xml");
		Person p = (Person) cont.getBean("p1");
		System.out.println(p.toString());
	}
}
