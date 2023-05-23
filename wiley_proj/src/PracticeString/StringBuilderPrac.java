package PracticeString;

public class StringBuilderPrac {
	public static void main(String[] args) {
		
		//[timestamp] user userId: message
		
		StringBuilder sb = new StringBuilder();
		
		long timestamp = System.currentTimeMillis();
		sb.append('[').append(timestamp).append("] ");
		
		String user = "Raj123";
		String message = "Login Successfully!!";
		
		sb.append("user").append(" ").append(user).append(": ").append(message);
		
		System.out.println(sb);
		System.out.println(sb.toString());
	}
}
