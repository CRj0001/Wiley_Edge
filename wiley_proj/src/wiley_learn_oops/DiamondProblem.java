package wiley_learn_oops;

interface Person1{
	void getRole();
}

class Student1 implements Person1{
	public void getRole() {
		System.out.println("Student");
	}
}

interface Teacher1 extends Person1{
	
}

class ClassRoom1 extends Student1 implements Teacher1{
	public void getRole() {
		System.out.println("In class");
	}
}

public class DiamondProblem {

	public static void main(String[] args) {
		Student1 cr = new Student1();
		cr.getRole();
		
		ClassRoom1 c = new ClassRoom1();
		c.getRole();
	}
}
