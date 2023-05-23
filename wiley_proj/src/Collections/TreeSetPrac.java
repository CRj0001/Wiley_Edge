package Collections;

import java.util.NavigableSet;
import java.util.TreeSet;

public class TreeSetPrac {

	public static void main(String[] args) {
		NavigableSet<Integer> ns = new TreeSet<Integer>();
		
		ns.add(0);
		ns.add(1);
		ns.add(2);
		ns.add(3);
		ns.add(4);
		ns.add(5);
		
		NavigableSet<Integer> rev = ns.descendingSet();
		
		System.out.println("ns: " + ns);
		System.out.println("Reverse: "+rev);
		
		System.out.println("TailSet after 3: "+ ns.tailSet(3));
		System.out.println("Lower than 3: " + ns.lower(3));
		System.out.println("higher than 3: " + ns.higher(3));
		System.out.println("Floor 3: " + ns.floor(3));
		System.out.println("Lower than 3: " + ns.ceiling(3) );
		System.out.println("Poll Last: " + ns.pollFirst());
		System.out.println("Poll First " + ns.pollLast());
		System.out.println("ns: " + ns);
	}
	
}
