import java.util.ArrayList;

/**
 * 
 */

/**
 * @author User
 *
 */
public class TestArrayList {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList al = new ArrayList<>();
		
		for(String str:args) {
			al.add(str);
		}	
		System.out.println("Array List is empty: " + al.isEmpty());
		//al.add(new Integer(10));
		//al.add(Boolean.TRUE);
		
		System.out.println("original :" + al);
		al.remove(" Two ");
		System.out.println("Now :" + al);
		al.set(1, "New");
		System.out.println("Contains four :" + al.contains("four"));
		al.clear();
		System.out.println("Now :" + al);
		
			
			
		}
	}


