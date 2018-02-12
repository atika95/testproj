// for StringBuilder
// Program to create a StringBuilder with "I am Studying Java"
// print first 3 characters
// print last 3 characters
//extract Studying and print

public class StudyingJava {

	public String(int i) {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuilder sb = new StringBuilder("I am Studying Java");
		String sub = sb. substring(sb.indexOf("I"), sb.indexOf("av"));
		
		
		System.out.println("sb:" + sb);
		System.out.println(String.substring(3));
		System.out.println(String.substring(3));
		
		
	}

}
