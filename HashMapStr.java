package JavaPrograms;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class HashMapStr {

	public static void main(String[] args) {
		String s = "Hello";
		char[] charArray = s.toCharArray();
		
		Map<Character, Integer> map = new LinkedHashMap<>();
		
		for(char c: charArray) {
			if(map.containsKey(c))
			{
				map.put(c, map.get(c)+1);
			}else {
				map.put(c, 1);
			}
		}
		
		Set<Character> setfinal = map.keySet();
		for(char ch : setfinal) {
			System.out.println(ch+ ": "+ map.get(ch));
		}

}
}
