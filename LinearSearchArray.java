package ArrayPractice;

public class LinearSearchArray {
	// in linear search the search will look for the element and it doesn't matter the element is duplicate or not and whenever its find the element from there it will exist from the loop will not check duplicates are there or not

	public static void main(String[] args) {
		int a[] = {10,20,70,40,50,30,100};
		
		int search_element =30;
		boolean status = false;  //not found true = found
		
		//enhanced for loop
		for(int arr: a) {
			if(arr==search_element) {
				System.out.println(search_element+" is Present in the array");
				status = true;
			}
		}if(status == false)
			{
			System.out.println("Is not Present");
			}
		
		//normal for loop
		int b[] = {100,200,400,500,600};
		int search = 300;
		boolean flag = false;
		
		for(int i =0; i <b.length-1; i++) {
			if(b[i]==search) {
				System.out.println("Element is present");
				flag = true;
			}
		}if(flag == false) {
			System.out.println("ELement is not present");
		}
	}

}
