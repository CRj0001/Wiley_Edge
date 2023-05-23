package WeeklyAssignments;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StudenntStream {

	
	public static void main(String[] args) {
		ArrayList<Student> lst = new ArrayList<>();
	
		lst.add(new Student(101, "Sahil", 70, 18));
		lst.add(new Student(102, "Shobhit", 50, 20));
		lst.add(new Student(103, "Aman", 80, 19));
		lst.add(new Student(104, "Srijal", 90, 17));
		lst.add(new Student(105, "Shashwat", 30, 18));
		lst.add(new Student(106, "Raj", 40, 19));
		lst.add(new Student(107, "Arpita", 70, 21));
		lst.add(new Student(108, "Nikhil", 95, 21));
		lst.add(new Student(109, "Sagar", 75, 16));
		lst.add(new Student(110, "Ritik", 77, 20));
		
		List<Student> filteredStd = lst.stream().
		filter(std -> std.getNoOfProblemsSolved()>50)
		.map(std -> {
			if(std.getNoOfProblemsSolved()<65) {
				std.setGrade('C');
			} else if(std.getNoOfProblemsSolved()<80) {
				std.setGrade('B');
			} 
			else
				std.setGrade('A');
			return std;
		})
//		.sorted(Comparator.comparingInt(Student :: getNoOfProblemsSolved).reversed())
//OR
		.sorted((std1,std2) -> {
			if(std1.getNoOfProblemsSolved()>std2.getNoOfProblemsSolved())
				return -1;
			return 1;
		})
		.limit(5)
		.collect(Collectors.toList())
		;
		System.out.println("The top 5 students are: ");
		filteredStd.forEach(std-> {
			System.out.printf("Id    : %-10dName  : %-10sGrade : %-10sProblems Solved: %d\n",std.getId(),std.getName(),std.getGrade(),std.getNoOfProblemsSolved());
			});
//		System.out.println(filteredStd);
	}
}
