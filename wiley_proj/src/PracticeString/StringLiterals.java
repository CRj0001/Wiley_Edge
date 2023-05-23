package PracticeString;

public class StringLiterals {
	public static void main(String[] args) {
		String s1 = "Java";
		String s2 = "Java";
		
		String s3 = new String("Java");
		String s4 = new String("Java");
		
//		System.out.println(s1 == s2);
//		System.out.println(s1 == s3);
//		System.out.println(s3 == s4);
//
//		s1 = s1+'b';
//		System.out.println(s1 == s2);
	
		String str1 = "My name is Raj";
		String str2 = "Chourasia";
		
		System.out.println(str2.length());
		
		String str3 = str1.concat(" " + str2);
		
		System.out.println(str3);
		System.out.println(str3.length());
		
		str3 = str3.replace('n', 'b');
		System.out.println(s3);
		
		str3 = str3.replace('b', 'n');
		
		String arr[] = str3.split(" ");
		for(String i : arr) {
			System.out.println(i);
		}
		
		String f = "A";
		String m = "B";
		String l = "C";
		
		String fullName = f.concat(" ").concat(m).concat(" ").concat(l);
		System.out.println(fullName);
		
		String trimex = " Wiley Edge   ";
		System.out.println(trimex);
		
		trimex = trimex.trim();
		System.out.println(trimex);
		
		System.out.println(str3.substring(0,6));
		
		System.out.println(str3.toUpperCase());
		
		System.out.println(str3.toLowerCase());
	}
}
