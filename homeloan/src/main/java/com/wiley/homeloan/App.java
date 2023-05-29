package com.wiley.homeloan;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
	 public static void getLoanAttributesFromUser(Loan l) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Enter the loan duration (in years): ");
	        int duration = scanner.nextInt();
	        l.setDuration(duration);
	        

	        System.out.print("Enter the loan amount: ");
	        int loanAmount = scanner.nextInt();
	        l.setLoan_amount(loanAmount);

	        System.out.print("Enter the annual income: ");
	        int annualIncome = scanner.nextInt();
	        l.setAnnual_income(annualIncome);
	    }
	
    public static void main( String[] args )
    {
//        System.out.println( "Hello World!" );
    	
    	  Scanner sc= new Scanner(System.in);
    	  int i;
    	  System.out.println("Select 1 to loan application");
    	  i= sc.nextInt();
    	  if(i==1) {
    		Loan l = new Loan();
    		getLoanAttributesFromUser(l);
    		//  System.out.println(l.toString());
    		 LoanDAOImpl ldi = new LoanDAOImpl();
    		 ldi.setInDb(l, 2);
    		 System.out.println("\nEnter 'Y' to initiate loan process.");
    			char ch = sc.next().charAt(0);
    			if(ch != 'Y') {
    				System.out.println("Thank you!!!");
    				return; 
    			}
    		 LoanProcessDAOImpl lpdi = new LoanProcessDAOImpl();
    		 String file = "D:\\Wiley_Training\\file_data\\document2.txt";
    		 User u = new User();
    		 u.setUser_id(2);
    		 lpdi.getInformation(l , file);
    		 
    	  } else {
    		  System.out.println("Thank you!!");
    	  }
    }
}
