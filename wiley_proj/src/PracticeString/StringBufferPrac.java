package PracticeString; 

public class StringBufferPrac {
	public static void main(String[] args) {
		StringBuffer sb1 = new StringBuffer("Wiley");
		StringBuffer sb2 = new StringBuffer("Wiley");
		StringBuffer sb3 = new StringBuffer("Wiley");
		
		System.out.println(sb1.equals(sb2));
		
		String s = "Wiley";
		
		System.out.println(s.equals(sb1.toString()));
		
		sb2.append(" Edge");
		System.out.println(sb2);
		
		sb2.insert(10, " program");
		System.out.println(sb2);
		
		sb2.delete(6, 11);
		System.out.println(sb2);
		
		sb2.reverse();
		System.out.println(sb2);
		
	}
}
