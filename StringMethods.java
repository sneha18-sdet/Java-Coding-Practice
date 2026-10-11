package StringProgram;

import java.util.Arrays;

public class StringMethods {
	public static void main(String[] args) {           //all methods are build in methods
		String s = "welcome";
//		String s = new String("Welcome");         //true
		System.out.println(s.length());
		System.out.println("welcome".length());
		
		
		
		
		//concat()        joining Strings
		String s1 ="welcome";
		String s2 = " to java";
		String s3 =" Automation ";
		System.out.println(s1+s2);
		System.out.println(s1+s2+s3);
		

		//using method
		System.out.println(s1.concat(s2));
		System.out.println(s1.concat(s3).concat(s3));
		
		System.out.println(s1.concat(s2+s3));
		System.out.println("Hi".concat(" Snehashree"));
		
		//trim() -- remove the spaces right and left side
		String s4 = "   Welcome   ";
		System.out.println(s4);
		System.out.println(s4.trim());
		System.out.println(s4.trim().length());
		
		
		//charAt() -- Character from a string based on index
		String s5= "Snehashree";
		System.out.println(s5.charAt(4));
		
		//contains() -- particular String is A part of main String or not-----boolean o/p
		String s6 ="Chiku";
		System.out.println(s6.contains("h"));
		System.out.println(s6.contains("a"));
		
		
		//equals() , equalsIgnoreCase() - compare strings
		s1 = "welcome";
		s2 = "welcome";
		s3 = "Welcome";
		System.out.println(s1.equals(s2)); //true
		System.out.println("after the value is changed "+ (s1==s2));
		System.out.println(s1.equals(s3)); //false
		
		
		//equalsIgnoreCase()
		System.out.println(s1.equalsIgnoreCase(s3)); //true
		
		//replace() ---replace single/multiple(sequense) of character in a string
		
		s = "Welcome to selenium java";
		System.out.println(s);
		System.out.println(s.replace('e', 'i'));
		
		//replace entire string
		System.out.println(s.replace("selenium", "Tosca"));
		
		//substring - extract substring from main String
		String s7 = "Snehashree";
		System.out.println(s7.substring(6)); //ending index+1 for desired output
		
		
		//ToUpperCase()
		System.out.println(s7.toUpperCase());
		System.out.println(s7.toLowerCase());
		
		//split() --- split the string into multiple parts based on delimeter(@, ., space)
		
		s ="abc123@gmail.com";
		String a[] = s.split("@");     //single dimensional Array
		System.out.println(a[0]);
		System.out.println(a[1]);
		System.out.println(Arrays.toString(a));
		
		//replace()
		String amount ="$15,20,55";
		System.out.println(amount.replace("$15,20,55","152055"));     //152055
		
		
		s="abc,123@xyz";
		String a1[] = s.split(",");
		System.out.println(Arrays.toString(a1));
		
		String a2[] = a1[1].split("@");
		System.out.println(Arrays.toString(a2));
		
		String s8 = "ab c";
		String arr[] = s8.split(" ");
		System.out.println(Arrays.toString(arr)); // * % ^ &() - you can't use as a delimeter
		
		String name1 = "John kenedy";
		//john
		System.out.println(name1.contains("John"));    //true
		System.out.println(name1.equalsIgnoreCase("john Kenedy")); //true
		
		
		
	}
	
	
}
	
