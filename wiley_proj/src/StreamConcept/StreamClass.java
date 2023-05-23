package StreamConcept;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamClass {
	
	public static void main(String[] args) {
		//CREATING STREAMS
		
//		List<String> lst = Arrays.asList("India","Russia","China","America");
//		Stream<String> lstStrm = lst.stream();
//		
//		int[] arr = {4,6,7,7,3,45,34};
//		IntStream arrStrm = Arrays.stream(arr);
		
		
		List<Integer> lst = Arrays.asList(4,54,6,53,34,45,34,245253,23523,0);
	//	Stream<Integer> lstStrm = lst.stream();
//		
//		List<Integer> fltrStrm = lstStrm
//		.filter(n->n%2==0)
//		.collect(Collectors.toList());
//		
//		List<Integer> mapStrm = fltrStrm
//				.stream()
//				.map(n->n*2)
//				.collect(Collectors.toList());
//		
		
		
		List<Integer> allStrm = lst
				.stream()
				.filter(n->n%2==0)
				.map(n->n*2)
				.distinct()
				.sorted()
				.limit(3)
				.collect(Collectors.toList());
		
		System.out.println(allStrm);
	}

}
