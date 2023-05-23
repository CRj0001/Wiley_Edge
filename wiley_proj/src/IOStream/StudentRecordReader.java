package IOStream;

import java.io.*;
import java.util.*;

public class StudentRecordReader {

	DataInputStream dis;
	
	StudentRecordReader(String fileName) throws FileNotFoundException {
		dis = new DataInputStream(new FileInputStream(fileName));
	}
	
	public ArrayList<StudentDemo> readRecord(){
		
		ArrayList<StudentDemo> stdList = new ArrayList<>();
		
		
		try {
			while(true) {
			String name = dis.readUTF();
			boolean b = dis.readBoolean();
			int a = dis.readInt();
			int s = dis.readInt();
			float g = dis.readFloat();
			
			stdList.add(new StudentDemo(name, b, a, s, g));
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
		}
	
		try {
			
			dis.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return stdList;
	}
	

	
	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		String fileName = "D:\\Wiley_Training\\file_data\\Studentdemo\\Studentrec.dat";
		
		StudentRecordReader srr = new StudentRecordReader(fileName);
		
		ArrayList<StudentDemo> stdList = srr.readRecord();
		
		for(StudentDemo std : stdList) {
			System.out.print("name : "+std.getName());
			System.out.print("	Gender : "+std.getGender());
			System.out.print("	Age : "+std.getAge());
			System.out.print("	Salary : "+std.getSalary());
			System.out.println("	Grade : "+std.getGrade());
		}
 		
	}

}
