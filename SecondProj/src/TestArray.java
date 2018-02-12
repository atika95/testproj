import java.util.Arrays;

/**This calss for test Java Arrays
 * @author User
 * 
 */

public class TestArray {

	 /**
	  * 
	  * @param args
	  */
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//double salaries [] = {100,150,170,180};
		int salaries [] = {2222,100,50,60,170,80,1,5,10};
		//Array.sort(salaries);
		Arrays.binarySearch(salaries, 1);
		
		System.out.println(Arrays.binarySearch(salaries, 1));
		
		
		}
		/*
		for (int i = 0;i < salaries.length; i++) {
			System.out.println("Salary of " + i + " is " + salaries[i]);
		}
		*/
 		/*for (double sal: salaries) {
 			System.out.println("Salary is " + sal);
 			
 		}
	}
*/
}
