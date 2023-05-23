package Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

public class CustomStudent implements Comparable<CustomStudent>{

	private int id;
	private String name;
	private int age;
	
	public CustomStudent(int id, String name, int age) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(id, name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		CustomStudent other = (CustomStudent) obj;
		return id == other.id && Objects.equals(name, other.name);
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "CustomStudent [id=" + id + ", name=" + name + ", Age = "+ age +"]";
	}

	@Override
	public int compareTo(CustomStudent o) {
		// TODO Auto-generated method s
		if(id == o.id) {
			return 0;
		} else if(id > o.id) {
			return 1;
		}
		return -1;
	}
	
	public static void main(String[] args) {
		List<CustomStudent> cst = new ArrayList<>();
		
		CustomStudent std1 = new CustomStudent(101, "Raj",23);
		CustomStudent std7 = new CustomStudent(101, "Raja",25);
		CustomStudent std2 = new CustomStudent(109, "Arpita",21);
		CustomStudent std3 = new CustomStudent(107, "Atul",43);
		CustomStudent std4 = new CustomStudent(105, "Venkat",20);
		CustomStudent std5 = new CustomStudent(108, "Ajay",18);
		CustomStudent std6 = new CustomStudent(103, "Sahil",17);
		
		cst.add(std1);
		cst.add(std2);
		cst.add(std3);
		cst.add(std4);
		cst.add(std5);
		cst.add(std6);
		
		cst.add(std7);
		Collections.sort(cst, new IdComparator());
		
		for(CustomStudent std : cst) {
			System.out.println(std);
		}
		
//		System.out.println("ID sort: " + cst);
//		System.out.println("Name sort: " + cst);
		//System.out.println("Age sort:\n" + cst);
	}
	
}
