package JavaPrograms;

public class WhileVSDowhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				//condition is False(while) 
				int i =10;
				while(i<=5) {
					System.out.println(i);
					i++;
					}
				System.out.println("nothing output is there because condition false");
				
				
				//condition is False (d0...while)
				int j =10;
				do {
					System.out.println(j);
					j++;
				}while(j<=5);
				
				System.out.println(j + " Here output is there cause do statements are excuted atleast once before the condition");
	}

}
