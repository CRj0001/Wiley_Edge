package wiley_learn_oops;

interface Person{
	void getRole();
}

class Student implements Person{
	public void getRole() {
		System.out.println("Student");
	}
}

interface Teacher extends Person{
	
}

class ClassRoom extends Student implements Teacher{
	public void getRole() {
		System.out.println("In class");
	}
}
public class MultipleInheritance {
	public static void main(String[] args) {
		
		Student cr = new Student();
		cr.getRole();
		
		ClassRoom c = new ClassRoom();
		c.getRole();
		
	}
}
