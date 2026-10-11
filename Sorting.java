package ArrayPractice;

import java.util.Arrays;

public class Sorting {

	public static void main(String[] args) {
		int a[] = {100,300,400,600,400,500,200};
		
		System.out.println("Before sorting");
		System.out.println(Arrays.toString(a));
		
		Arrays.sort(a); //pre-defined method that is sorting the array
		
		System.out.println("After sorting");
		System.out.println(Arrays.toString(a));

	}

}
