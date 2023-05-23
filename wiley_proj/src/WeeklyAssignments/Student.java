package WeeklyAssignments;

public class Student {
	private int id;
	private String name;
	private int noOfProblemsSolved;
	private char grade;
	private int age;
	
	
	public Student(int id, String name, int noOfProblemsSolved,  int age) {
		super();
		this.id = id;
		this.name = name;
		this.noOfProblemsSolved = noOfProblemsSolved;
		this.age = age;
	}


	@Override
	public String toString() {
		return "id=" + id + ", name=" + name + ", noOfProblemsSolved=" + noOfProblemsSolved + ", grade="
				+ grade + ", age=" + age + "\n";
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


	public void setName(String name) {
		this.name = name;
	}


	public int getNoOfProblemsSolved() {
		return noOfProblemsSolved;
	}


	public void setNoOfProblemsSolved(int noOfProblemsSolved) {
		this.noOfProblemsSolved = noOfProblemsSolved;
	}


	public char getGrade() {
		return grade;
	}


	public void setGrade(char grade) {
		this.grade = grade;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}

}
