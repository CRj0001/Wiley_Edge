package IOStream;

import java.io.*;

public class FileStream {
	public static void main(String[] args) throws IOException {
		
		FileOutputStream fos = new FileOutputStream("D:\\Wiley_Training\\file_data\\Studentdemo\\data1.txt");
		String str = "Learning Streams in Java";
		
		byte[] b = str.getBytes();
		
		fos.write(b);
		fos.close();
		
		FileInputStream fis = new FileInputStream("D:\\Wiley_Training\\file_data\\Studentdemo\\inpFile.txt");
	int i = 0;
		while((i=fis.read())!=-1) {
			System.out.print((char)i+" ");
		}
		fis.close();
	}
}
