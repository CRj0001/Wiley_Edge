package ExceptionHandling;

import java.util.ArrayList;

class StringNotFoundExcwption extends RuntimeException {
	
	public StringNotFoundExcwption(String str) {
		super(str);
	}
	
	@Override
	public String getMessage() {
		// TODO Auto-generated method stub
		return "inside message";
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "inside toString";
	}


	
}
public class UncheckedException {

	public static void main(String[] args) {
		
		ArrayList<Integer> list = new ArrayList<>();
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		
		if(!list.contains(50)) {
			
			try {
				throw new StringNotFoundExcwption("Given String is not found");
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
		
		System.out.println("End statement");
		
	}	
	
}
