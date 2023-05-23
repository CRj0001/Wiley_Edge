package wiley_learn_oops;

class Employee {
	
	private String name;
	private int age;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
}

class EmployeeImpl{
	
	void show(Employee emp) {
		System.out.println("Inside show");
		System.out.println("Name: "+emp.getName()+" :: Age: "+emp.getAge());
		
	}
}

public class EmployeeEncapsulation {
	public static void main(String[] args) {
		
		Employee e = new Employee();
		e.setAge(21);
		e.setName("RaJ Chourasia");
		
		EmployeeImpl ei = new EmployeeImpl();
		ei.show(e);
	}
}
