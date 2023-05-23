package Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CustomArrayList extends ArrayList{
	
	@Override
	public boolean add(Object o) {
		// TODO Auto-generated method stub
		if(this.contains(o)) {
			return true;
		}
		return super.add(o);
	}
	
	public static void main(String[] args) {
		
		CustomArrayList cal = new CustomArrayList();
		cal.add(1);
		cal.add(2);
		cal.add(3);
		cal.add(1);
		cal.add(2);
		cal.add("Raj");
		cal.add("Raj");
		
		System.out.println(cal);
		
		
	//	HashSet<CustomStudent> cst = new HashSet<>();
		
		List<CustomStudent> cst = new ArrayList<>();

		CustomStudent std1 = new CustomStudent(101, "Raj",23);
		CustomStudent std2 = new CustomStudent(109, "Arpita",21);
		CustomStudent std3 = new CustomStudent(107, "Atul",43);
		CustomStudent std4 = new CustomStudent(105, "Venkat",20);
		CustomStudent std5 = new CustomStudent(108, "Ajay",18);
		CustomStudent std6 = new CustomStudent(103, "Sahil",17);
		
		cst.add(std1);
		cst.add(std2);
		cst.add(std3);
		cst.add(std4);
		cst.add(std5);
		cst.add(std6);

		
		System.out.println(cst);
		
		Collections.sort(cst);

		System.out.println(cst);
		
	}

}
