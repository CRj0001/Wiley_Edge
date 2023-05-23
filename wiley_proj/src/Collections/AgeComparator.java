package Collections;

import java.util.Comparator;

public class AgeComparator implements Comparator<CustomStudent>{

	@Override
	public int compare(CustomStudent o1, CustomStudent o2) {
		// TODO Auto-generated method stub
		return o1.getAge()-o2.getAge();
	}

}
