package GenericConcept;

import java.util.*;

public class GenricClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Printer<Integer> pt = new Printer<>(100);
//		Printer<Float> pt1 = new Printer<>(100.32f);
//		Printer<String> pt2 = new Printer<>("Wiley Edge");
//		
//		pt.print();
//		pt1.print();
//		pt2.print();
		
//		Printer<Dog> an = new Printer<>(new Dog());
	//	Printer<Cat> an = new Printer<>(new Cat());
	
//		shout("Come here");
//		shout(true);
//		shout(10000);
//		shout(234.23f);
//		shout(new Cat());
		
//		shout(100000, "Bring Money");
//		shout("Want Water", true);
//		shout("Cake", "Bring it");
	
		List<Integer> lst = new ArrayList<>();
		lst.add(5);
		lst.add(8);
		printList(lst);
		
		List<Cat> catLst = new ArrayList<>();
		catLst.add(new Cat());
		catLst.add(new Cat());
		printList(catLst);
	}
	
	public static void printList(List<?> lst) {
		System.out.println(lst);
	}

	private static<T> void shout(T val) {
		System.out.println(val);
	}
	
	private static<T, V> void shout(T val, V bring) {
		System.out.println(val + " --- ");
		System.out.println(bring + "...........!!! \n");
	}
}
