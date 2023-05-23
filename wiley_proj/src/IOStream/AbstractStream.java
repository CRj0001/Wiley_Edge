package IOStream;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class AbstractStream {

	public static void main(String[] args) throws IOException {
		
		OutputStream fos = new FileOutputStream("D:\\Wiley_Training\\file_data\\Studentdemo\\data1.txt");
		String str = "Learning Streams in Java";
		
		byte[] b = str.getBytes();
		
		fos.write(b);
		fos.flush();
		fos.close();
		
		InputStream fis = new FileInputStream("D:\\Wiley_Training\\file_data\\Studentdemo\\inpFile.txt");
	int i = 0;
		while((i=fis.read())!=-1) {
			System.out.print((char)i+" ");
		}
		fis.close();
		
	}
}
