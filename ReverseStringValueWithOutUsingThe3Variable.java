package StringProgram;

import java.util.Scanner;

public class ReverseStringValueWithOutUsingThe3Variable {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String");
		String Str1 = sc.next();
		System.out.println("Enter 2nd String");
		String Str2 = sc.next();
		
		Str1 = Str1+Str2;
		
		Str2 = Str1.substring(0, Str1.length()-Str2.length());
		
		Str1 = Str1.substring(Str2.length());
		
		System.out.println(Str1);
		System.out.println(Str2);
		
	}

}
