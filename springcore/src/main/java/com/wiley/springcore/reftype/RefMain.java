package com.wiley.springcore.reftype;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class RefMain {

	public static void main(String[] args) {
		
	
	ApplicationContext cont = new ClassPathXmlApplicationContext("com/wiley/springcore/reftype/configref.xml");
	WileyB wb = (WileyB) cont.getBean("wbref");
	WileyA wa = (WileyA) cont.getBean("waref");

	
	System.out.println(wb.toString());
	System.out.println(wa.toString());
	}
}
