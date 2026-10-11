package JavaPrograms;

public class ReverseNumber {

	public static void main(String[] args) {
		int num = 1235;
		int rev=0;
		int n;
		while(num>0) {
			n = num%10;
			rev = rev*10+n;
			num=num/10;
		}
		System.out.println(rev);

	}

}
