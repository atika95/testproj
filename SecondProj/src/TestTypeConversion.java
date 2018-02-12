/**
 * 
 */

/**
 * @author User
 *
 */
public class TestTypeConversion {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//accept a double from command line
		Double salaryDb1 = new Double(args[0]);
		//double salary = Double.parseDouble(args[0]);
		double salary = salaryDb1.doubleValue();
		if (salaryDb1.isNaN()) {
			System.out.println("Salary is not valid");
		}else{ 
		}
		//convert salary to a string
		String salaryStr = String.valueOf(salary);
		
		System.out.println(salaryStr);
		
	}

}
