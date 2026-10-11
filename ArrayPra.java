package ArrayPractice;

public class ArrayPra {

	public static void main(String[] args) {
		//Declare an array
		//Approach
		int a[] = new int[5];
		
		//adding value in an array 1
		a[0] = 100;
		a[1] = 200;
		a[2] = 300;
		a[3] = 400;
		a[4] = 500;
		
		//adding value in an array 2(dynamic)
		int b[] = {10,20,30,40,50};
		
		
		//find length of an array
//		System.out.println("length of an array a is "+a.length);
//		System.out.println(b[4]);
		
		//reading all the values from an array
		//classic/normal for loop
		for(int i=0; i<b.length; i++) // i<=4 i<5 i<a.length i<=a.length-1
		{
			System.out.println(b[i]);
		}
		
		//enhanced/ for ...each loop
		for(int x:a) {
			System.out.println(x);
		}
		
	}

}
