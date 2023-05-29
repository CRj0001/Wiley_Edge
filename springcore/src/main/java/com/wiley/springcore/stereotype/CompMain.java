package com.wiley.springcore.stereotype;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CompMain {
	public static void main(String[] args) {
		ApplicationContext cont = new ClassPathXmlApplicationContext("com/wiley/springcore/stereotype/configAw.xml");
		Student emp =  cont.getBean("std",Student.class);
		System.out.println(emp.getSubjects());
	}
}
