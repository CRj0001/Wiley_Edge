package com.wiley.springcore.lifecycle;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class LCMain {
	
	public static void main(String[] args) {
		
		AbstractApplicationContext cont = new ClassPathXmlApplicationContext("com/wiley/springcore/lifecycle/lcconfig.xml");
		Pizza p = (Pizza) cont.getBean("pza");
		System.out.println( p);
		cont.registerShutdownHook();
	}

}
