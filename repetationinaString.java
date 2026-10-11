package JavaPrograms;


import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class repetationinaString {

	public static void main(String[] args) {
		String input = "Hello";
		
		
		Map<Character, Integer> map = new LinkedHashMap<>();			//HashMap also can be used
		
		char[] strArray = input.toCharArray();
		
		for(char ch : strArray) {
			if(map.containsKey(ch)) {
				map.put(ch, map.get(ch)+1);
			}else {
				map.put(ch, 1);
			}
		}
		
		
		//printing
		Set<Character> strch = map.keySet();
		System.out.println(strch);
		for(char c : strch) {
				System.out.println(c+ ":"+map.get(c));
		}
		

	}

}
