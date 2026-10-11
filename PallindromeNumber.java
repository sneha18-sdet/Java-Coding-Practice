package JavaPrograms;

public class PallindromeNumber {
	 public static boolean isPalindrome(int num) {
	        int n = num; // use the passed value
	        int rev = 0;

	        while (n > 0) {
	            int r = n % 10;
	            rev = rev * 10 + r;
	            n = n / 10;
	        }
	        return rev == num;
	    }

	public static void main(String[] args) {
		int number = 121;
		if(isPalindrome(number)) {
			System.out.println(number+ " is a pallindrome Number");
		} else {
			System.out.println(number+ " not a pallindrome number");
		}

	}

}
