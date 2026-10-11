package ArrayPractice;

public class FindNumberofRepetationSearchElement {

	public static void main(String[] args) {
		int a[] = {10,20,30,10,40,10,10,20};
		int number = 10;
		int count = 0;
		int c = 0;
		
		//enhanced loop
		for(int x :a) {
			if(x == number) {
				count++;
			}
		}System.out.println(count);
		
		//normal loop
		int num = 20;
		for(int i =0; i<a.length; i++) {
			if(a[i]==num) {
				c++;
			}
		}System.out.println(c);
		
	}

}
