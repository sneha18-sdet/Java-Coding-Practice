package JavaPrograms;

public class ForLoop {

	public static void main(String[] args) {
		// 1 to 10 print
		for(int j=1;j<=10; j++) {
			System.out.println(j);
		}
		
		//1 to 10 even and odd numbers
		for(int i=1; i<=10; i++) {
			if(i%2==0) {
				System.out.println(i+" Even");
			}else {
				System.out.println(i+" odd");
			}
		}
		
		//Descending Number 1 to 10
		for(int n =10; n>=1; n--) {
			System.out.println(n);
		}

	}

}
