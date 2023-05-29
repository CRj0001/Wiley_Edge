package com.wiley.springcore.springconfig;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.wiley.springcore.springconfig")
public class SpringConfig {

	@Bean
	public Game getGame() {
		return new Game();
	}
	
	@Bean
	public Student getStudent() {
		Student st = new Student(getGame());
		return st;
	}
}
