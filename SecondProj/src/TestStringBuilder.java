/**
 * 
 */

/**
 * @author User
 *
 */
public class TestStringBuilder {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//intialising 
		StringBuilder sb = new StringBuilder(args[0]);
		String constant = "Studying";
				
		System.out.println("Given String:" + sb + " with length:" + sb.length());
		System.out.println("First Three:" + sb.substring(0,3));
		System.out.println("Last Three:" + sb.substring((sb.length()-3)));
		int startOfConstant = sb.indexOf(constant);
		int endOfConstant = startOfConstant + constant.length();
		System.out.println("Print Studying:" + sb.substring(startOfConstant, endOfConstant));
		
		//insert 
		sb.insert((sb.indexOf("am")+2), " atikah");
		System.out.println("After insert: " + sb);
		sb.delete(sb.indexOf("am"), sb.indexOf("am")+2);
		System.out.println("After delete: " + sb);
		System.out.println("Reserve: " + sb.reverse());
		
		StringBuilder sb2 = new StringBuilder(args[0]);
		System.out.println(sb == sb2);
		StringBuilder sb3 = (sb.insert(sb.indexOf("am")+2, "atikah"));
		System.out.println(sb == sb3);
		
		sb = null;
		
		System.out.println("sb3:" + sb);
		System.out.println("sb3:" + sb3);
		
	}

}
