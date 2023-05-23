package Collections;

import java.util.Comparator;

public class IdComparator implements Comparator<CustomStudent>{

	@Override
	public int compare(CustomStudent o1, CustomStudent o2) {
		// TODO Auto-generated method stub
		if(o1.getId() == o2.getId()) {
			return o1.compareTo(o2);
		}
		return o1.getId()-o2.getId();
	}

}
