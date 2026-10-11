package JavaPrograms;

public class ReverseAString {

	public static void main(String[] args) {
		
//		//With using String methods 1
		
//		String s = "Welcome";
//		String rev = "";
//		
//		for(int i = s.length()-1 ; i>=0 ;i--) {
//			rev = rev + s.charAt(i);
//		}
//		System.out.println(rev);
		
		//By converting string to Array 2
//		String s = "Welcome";
//		String rev ="";
//		
//		char a[] = s.toCharArray(); //this method will change the string to array
//		
//		for(int i = a.length-1; i>=0; i--) {
//			rev = rev+a[i];
//		}
//		System.out.println(rev);
		
		
		//method 3
//		String input ="welcome";
//		char ch;
//		String str="";
//		for(int i = 0; i<input.length(); i++)
//		{
//			ch = input.charAt(i);
//			str = ch + str;
//		}System.out.println(str);
		
		//Build-in methods
		StringBuffer s = new StringBuffer("welcome");
		System.out.println(s.reverse());
		
		//StringBuilder
		StringBuilder y = new StringBuilder("Snehashree");
		System.out.println(y.reverse());
		
		
		
	}

}
