package PracticeString;

import java.util.StringTokenizer;

public class StringTokenClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "We,love,Java,Programming";
		//StringTokenizer st1 = new StringTokenizer("We love Java Programming");
		StringTokenizer st = new StringTokenizer(str, ",");
		
		System.out.println(st.countTokens());
		
		while(st.hasMoreElements()) {
			System.out.println(st.nextToken().trim());
		}
		
//		System.out.println(st.nextToken());
//		System.out.println(st.nextToken());
		
	}

}
