package AssignmentShoppingApp;

import java.io.*;

public class Customer {
	
	private String userName;
	private String password;
	FileReader fileR;
	
	public Customer() {
		try {
			this.fileR =new FileReader("D:\\Wiley_Training\\ShopppingAppTextFiles\\CustomerInfo.csv");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	
	
	public void deleteCustomer() {
		
	};
	
	public void viewCustomer() throws IOException {
		System.out.println("\n********************************************\n\n\n");
		String line = "";
		String splitBy = ",";
		
		BufferedReader br = new BufferedReader(fileR);
		while((line = br.readLine())!=null) {
			String[] customers = line.split(splitBy);
			System.out.println("Customer UserName: "+ customers[0] + "Customer Password: "+customers[1]);
		}
		
		System.out.println("\n********************************************\n\n\n");

	};

}
