package Collections;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class MapClasses {

	public static void main(String[] args) {
		HashMap<Integer, String>  map = new HashMap<>();
		
		map.put(1, "Raj");
		map.put(null, "Abc");
		map.put(3, null);
		map.put(null, null);
		map.put(2, "Venkat");
		map.put(4, "Sahil");
		map.put(5, "Edward");
		map.put(6, "Nikki");
		map.put(7, "Srijal");
		
		System.out.println(map);
		
		System.out.println( map.get(4));
		System.out.println(map.containsKey(3));
		System.out.println(map.containsValue("ew"));
		
		map.replace(9, "Hello");
		map.put(10, "bye");
		map.putIfAbsent(1, "Sahil");
		
		System.out.println(map);

		//LinkedHashMap
		
		Map lmap = new LinkedHashMap();
		
		lmap.put(1, "abc");
		lmap.put("Raj", 32);
		
	}
}
