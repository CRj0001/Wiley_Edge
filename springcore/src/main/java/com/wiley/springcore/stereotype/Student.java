package com.wiley.springcore.stereotype;

import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("std")
public class Student {
	@Value("JBP")
	private String city;
	@Value("Raj")
	private String name;
	@Value("#{mysubjects}")
	private List<String> subjects;

	public String getCity() {
		return city;
	}

	public List<String> getSubjects() {
		return subjects;
	}

	public void setSubjects(List<String> subjects) {
		this.subjects = subjects;
	}

	public void setCity(String city) {
		this.city = city;
	}

	@Override
	public String toString() {
		return "Student [city=" + city + ", name=" + name + ", subjects=" + subjects + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
