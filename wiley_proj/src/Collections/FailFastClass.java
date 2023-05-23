package Collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

public class FailFastClass {
	
	public static void main(String[] args) {
		
		List<String> lst = new ArrayList<>();
		
		lst.add("Raj");
		lst.add("Sahil");
		lst.add("Ritik");
		
		Iterator<String> itr = lst.iterator();
		
		while(itr.hasNext()) {
			String str = itr.next();
			System.out.println(str);
		//lst.add("abv");
		}
		System.out.println("------");
		
		HashMap<String, Integer> map = new HashMap<>();
	}

}
