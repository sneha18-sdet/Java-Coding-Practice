package StringProgram;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class CountEachCharacterInAString {

	public static void main(String[] args) {
		String str = "Java is good programming Language";
	    Map<Character, Integer> charCountMap = new HashMap<>();
	    
	    for(char ch: str.toCharArray()) {
	        if(ch != ' ') {
	            charCountMap.put(ch, charCountMap.getOrDefault(ch, 0) + 1);
	        }
	    }
	    for (Map.Entry<Character, Integer> entry : charCountMap.entrySet()) {
	        System.out.println(entry.getKey() + " = " + entry.getValue());}
	    System.out.println();
	}

}
