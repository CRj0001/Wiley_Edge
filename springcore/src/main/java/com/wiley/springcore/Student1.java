package com.wiley.springcore;

import java.util.Map;
import java.util.Set;

public class Student1 {
	private Set<Integer> rollno;
	private Map<String, String> fullname;

	public Set<Integer> getRollno() {
		return rollno;
	}

	public void setRollno(Set<Integer> rollno) {
		this.rollno = rollno;
	}

	public Map<String, String> getFullname() {
		return fullname;
	}

	public void setFullname(Map<String, String> fullname) {
		this.fullname = fullname;
	}

	public Student1(Set<Integer> rollno, Map<String, String> fullname) {
		super();
		this.rollno = rollno;
		this.fullname = fullname;
	}

	public Student1() {
		super();

	}

	@Override
	public String toString() {
		return "Student1 [rollno=" + rollno + ", fullname=" + fullname + "]";
	}
}
