package IOStream;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class BIStream {
	public static void main(String[] args) {
		
		try {
			FileInputStream fis = new FileInputStream("D:\\Wiley_Training\\file_data\\data1.txt");
			BufferedInputStream bis = new BufferedInputStream(fis);
		
			//Writing data in file
			try {
				int i;
			//	i=bis.read();
				while((i=bis.read()) != -1)
				{
					System.out.println((char)(i));
				}
				
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch(IOException ioe)
		{
			System.out.println(ioe);
		}
	}
}
