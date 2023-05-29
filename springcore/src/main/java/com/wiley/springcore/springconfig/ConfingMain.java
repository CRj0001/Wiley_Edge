package com.wiley.springcore.springconfig;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ConfingMain {
	public static void main(String[] args) {
		ApplicationContext cont = new AnnotationConfigApplicationContext(SpringConfig.class);
		Student st = cont.getBean("getStudent",Student.class);
		System.out.println(st);
		st.speak();
	}
}
