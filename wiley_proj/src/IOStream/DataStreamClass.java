package IOStream;

import java.io.*;

public class DataStreamClass {

	public static void main(String[] args) throws IOException {
		
//		FileOutputStream fos = new FileOutputStream("D:\\Wiley_Training\\file_data\\data2.txt");
//
//		DataOutputStream dos = new DataOutputStream(fos);
//		
//		dos.writeBytes("I am learning java DOS");
//		dos.flush();
//		dos.close();
		
		FileInputStream fis = new FileInputStream("D:\\Wiley_Training\\file_data\\data2.txt");
		DataInputStream dos = new DataInputStream(fis);
		
		int length = fis.available();
		
		byte[] ba = new byte[length];
		fis.read(ba);
		
		for(byte b : ba) {
			System.out.print((char)b+" ");
		}
		dos.close();
		fis.close();

	}

}
