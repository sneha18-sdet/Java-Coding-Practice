package JavaPrograms;

import java.util.*;


public class DuplicateFromAList {

	public static void main(String[] args) {
		
		
		List<String> list = new ArrayList<>();
		
		List<String> friuts = Arrays.asList("Apple","Orange", "Apple", "Banana", "Gauva", "Gauva", "Apple");
		
		for(String friute : friuts) {
			if(!list.contains(friute)) {
				list.add(friute);
			}
		}
		
		System.out.println(list);

	}

}
