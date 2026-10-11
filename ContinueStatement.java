package JavaPrograms;

public class ContinueStatement {

	public static void main(String[] args) {
		for(int i =1; i<=10;i++) {
			if(i==3 || i==5 || i==9) {
				continue; //jump 
			}
			System.out.println(i);
		}

	}

}
