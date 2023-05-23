package Collections;

import java.util.ArrayList;
import java.util.List;

public class CheckEqual {
	
	public static void main(String[] args) {
		
		
		String str1 = "Abc";
		String str2 = "Abc";
		
		String str3 = new String("Raj");
		String str4 = new String("Raj");
		
		System.out.println(str1==str2);
		System.out.println(str3==str4);
		System.out.println(str1==str3);
		
		System.out.println(str1.equals(str2));
		System.out.println(str3.equals(str4));
		System.out.println(str3.equals(str1));
		
		final List<Integer> al = new ArrayList<>();
		
		al.add(243);
		al.add(543);
		al.set(0,123);
		System.out.println(al);
		
		System.out.println( al.contains(543));
		
//		al = new ArrayList<>();
	}

}
