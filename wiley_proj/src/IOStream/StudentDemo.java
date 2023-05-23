package IOStream;

public class StudentDemo {
	
	private String name;
	private boolean gender; // true: male, false: female
	private int age;
	private int salary;
	private float grade;

	public StudentDemo(String name, boolean gender, int age, int sal, float grade) {
		super();
		this.name = name;
		this.gender = gender;
		this.salary = sal;
		this.age = age;
		this.grade = grade;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public boolean getGender() {
		return gender;
	}

	public void setGender(boolean gender) {
		this.gender = gender;
	}

	public int getAge() {
		return age;
	}


	public int getSalary() {
		return salary;
	}

	
	public void setAge(int age) {
		this.age = age;
	}

	public float getGrade() {
		return grade;
	}

	public void setGrade(float grade) {
		this.grade = grade;
	}

}
