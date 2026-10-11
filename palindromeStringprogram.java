package StringProgram;

public class palindromeStringprogram {

	public static void main(String[] args) {
		String s = "madam";
		String rev = "";
		
		for(int i = s.length()-1; i>=0 ; i--) {
			rev = rev + s.charAt(i);
			
		}
		System.out.println(s + " original String");
		System.out.println(rev + " reversed String");
		
		if(s.equals(rev)) {
			System.out.println(rev + " is palindrome string");
		}else {
			System.out.println(rev +" not is palindrome string");
		}

	}

}
