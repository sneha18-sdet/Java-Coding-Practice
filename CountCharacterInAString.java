package StringProgram;

public class CountCharacterInAString {

	public static void main(String[] args) {
		String str = "Java is good programming Language";
		int count = 0;
		for(int i = 0; i<str.length(); i++) {
			if(str.charAt(i) != ' ') {
				count++;
			}
		}
		System.out.println("Total number of characters in a string: " + count);

	}

}
