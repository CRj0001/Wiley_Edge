package com.wiley.springcore.factoryprac;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.wiley.springcore.misc.Employee;
import com.wiley.springcore.misc.Product;

public class FactMain {
	public static void main(String[] args) {
		ApplicationContext cont = new ClassPathXmlApplicationContext("com/wiley/springcore/factoryprac/configCi.xml");
		Foo f = cont.getBean("foo",Foo.class);
		System.out.println(f);
	
		Bar b = cont.getBean("bar",Bar.class);
		System.out.println(b);
		}
}
