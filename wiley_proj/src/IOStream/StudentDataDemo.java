package IOStream;

import java.io.*;
import java.util.*;
import IOStream.StudentDemo;

public class StudentDataDemo {

	DataOutputStream dos;
	
	public StudentDataDemo(String fileName) throws FileNotFoundException {
		dos = new DataOutputStream(new FileOutputStream(fileName));
	}
	
	public void write(StudentDemo obj) throws IOException {
		
		dos.writeUTF(obj.getName());
		dos.writeBoolean(obj.getGender());
		dos.writeInt(obj.getAge());
		dos.writeInt(obj.getSalary());
		dos.writeFloat(obj.getGrade());
		
	}
	
	public void save() throws IOException {
		dos.close();
	}
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		String fileName = "D:\\Wiley_Training\\file_data\\Studentdemo\\Studentrec.dat";
		
		List<StudentDemo> stdList = new ArrayList<>();
		
		stdList.add(new StudentDemo("Raj", true, 21, 22000, 451.3f));
		stdList.add(new StudentDemo("Sahil", true, 18, 230000, 250.3f));
		stdList.add(new StudentDemo("Arpita", false, 20, 45000, 320.3f));
		stdList.add(new StudentDemo("Aman", true, 22, 72000, 430.4f));
		
		
			try {
				
				StudentDataDemo sdd = new StudentDataDemo(fileName);
				
				for(StudentDemo std : stdList) {
					sdd.write(std);
				}
				
				sdd.save();
				
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
	}

}
