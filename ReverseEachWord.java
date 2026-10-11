package StringProgram;

import java.util.Arrays;

public class ReverseEachWord {

	public static void main(String[] args) {
		reverseEachWordofString("Java is good programming Language");

	}
	
	static void reverseEachWordofString (String inputString) {
		String[] words = inputString.split(" ");
		System.out.println(Arrays.toString(words));
		
		String reverseString = "";
		for(int i =0; i<words.length; i++) {
			String word = words[i];
			String nstr = "";
			char ch;
			for(int j =0; j<word.length();j++) {
				ch = word.charAt(j);
				nstr = ch + nstr;
			}
			reverseString = reverseString + nstr + " ";
		}
		System.out.println(inputString);
		System.out.println(reverseString);
	}

}

