package ArrayPractice;

public class TwoDimensionalArray {

	public static void main(String[] args) {
		// 1. Declare and assign
        int a[][] = new int[3][2];

        a[0][0] = 100;
        a[0][1] = 200;
        a[1][0] = 300;
        a[1][1] = 400;
        a[2][0] = 500;
        a[2][1] = 600;

        // 2. Another way to declare and initialize
        int b[][] = {
            {10, 20},
            {30, 40},
            {50, 60}
        };

        // Find size of an array
        System.out.println("Length of rows: " + a.length);
        System.out.println("Length of columns: " + a[0].length);

        //read single value from an array
        System.out.println(b[2][1]);
        //loop for read both all values in rows and columns
        //normal
        for(int i = 0; i<a.length-1; i++) {
        	for(int j = 0; j<a.length-1; j++) {
        		System.out.println(a[i][j]);
        	}
        }
     
        //enhanced for loop
        for(int arr[]:b) {
        	for(int x:arr) {
        		System.out.println(x+"    ");
        	}
        } System.out.println();
        				
	}

}


