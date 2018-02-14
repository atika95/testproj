import java.lang.reflect.Array;
import java.util.Arrays;

/**This class for test Java Arrays
 * @author User
 * 
 */

public class TestMultiArray {

	 /**
	  * 
	  * @param args
	  */
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String course_subjects[][] = new String [2][2];
		course_subjects [0][0] = "CS-Maths";
		course_subjects [0][1] = "CS-English";
		course_subjects [1][0] = "AC-Acounting";
		course_subjects [1][1] = "AC-Bahasa Melayu";
		
		String course_subject2 [][] = {{"CS-Maths","CS-English"},{ "AC-Acounting", "AC-Bahasa Melayu"}};  
		
		for(int i=0; i< course_subjects.length; i++) {
		for(int j=0;j< course_subjects.length; j++) {
		
		
		System.out.println("Course of " + i + "Subjects of " + j + "is " + course_subjects[i][j]);
		
			}
		}
		
	}
	
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
