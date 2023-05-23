package ExceptionHandling;

import java.io.PrintWriter;

class AgeValidException extends Exception{
	
	public AgeValidException(String str) {
		super(str);
	}
	
	@Override
	public void printStackTrace(PrintWriter s) {
		// TODO Auto-generated method stub
		super.printStackTrace(s);
	}

	@Override
	public String getMessage() {
		// TODO Auto-generated method stub
		return "The age is not valid getMessage";
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Age not Applicable in toString";
	}

	
}

public class CustomException{
	
	public static void validAge(int age)throws AgeValidException {
		
		if(age<18) {
			try {
				throw new AgeValidException("Not valid age");
			} catch(Exception e) {
				System.out.println(e.getMessage());
				System.out.println(e.toString());
			}
		} else {
			System.out.println("Valid Age");
		}
		
	}
	
	public static void main(String[] args) throws AgeValidException {
		validAge(10);
	}

}
