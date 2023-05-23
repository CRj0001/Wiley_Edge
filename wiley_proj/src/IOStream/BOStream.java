package IOStream;

import java.io.*;

public class BOStream {
	public static void main(String[] args) throws FileNotFoundException {
		
		FileOutputStream fos = new FileOutputStream("D:\\Wiley_Training\\file_data\\data1.txt");
		BufferedOutputStream bof = new BufferedOutputStream(fos);
		
		String str = "I am learning java";
		byte[] b = str.getBytes();
		
		
		//Writing data in console
//		try {
//			bof.write(b);
//			bof.flush();
//			bof.close();
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		
		//Writing data in file
		try {
			bof.write(b);
			bof.flush();
			bof.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
}
