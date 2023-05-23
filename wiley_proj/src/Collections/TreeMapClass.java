package Collections;

import java.util.Set;
import java.util.TreeMap;

public class TreeMapClass {

	public static void main(String[] args) {
//		TreeMap<Integer, String> tmap = new TreeMap<>();
//	
//		tmap.put(232, "RAj");
//		tmap.put(35, "Sahu");
//		tmap.put(34, "Cant");
//		tmap.put(45, "get" );
//		
//		System.out.println(tmap);
//		tmap.forEach( (k,v) -> System.out.println("Key: "+ k + "Val: "+v) );
//		
//		System.out.println(tmap.lastKey() );
//		System.err.println(tmap.firstKey());
//		
//		Set<Integer> keyLess40 = tmap.headMap(40).keySet();
//		System.out.println(keyLess40);
//	
//		Set<Integer> keyMore40 = tmap.tailMap(40).keySet();
//		System.out.println(keyMore40);
		
		TreeMap<String, Integer> trmap = new TreeMap<>();
		trmap.put("Raj", 123);
		trmap.put("Rahul", 123);
		trmap.put("ARpita", 123);
		trmap.put("Ram", 123);
		
		System.out.println(trmap);
	}
}
