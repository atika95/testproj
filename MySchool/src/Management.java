import java.util.*;
import java.sql.*;

/**
 * @author atikah
 *
 */
public class Management {

	 // JDBC driver name and database URL
	   static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";  
	   static final String DB_URL = "jdbc:mysql://localhost/school";

	   //  Database credentials
	   static final String USER = "atika";
	   static final String PASS = "mypass!@#";
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String choice;
		String tableName;
		int option=0;
		int run=0;
		Connection conn = null;
		Statement stmt = null;
		
		Scanner cin = new Scanner(System.in);
		Scanner nic = new Scanner(System.in);
		
		while (run==0) {	
		System.out.println("\n!! Welcome to School Management System !!\n");
		
		System.out.println("What are you need to do(Enter ther Name) ? ");
		System.out.println("1. View - View table value ");
		System.out.println("2. Insert - Insert new value ");
		System.out.println("3. Update - Update the table value ");
		System.out.println("4. Delete - Delete the table value ");
		System.out.print("Enter : ");
		choice = cin.nextLine();
		
		while (option==0) {
			if (choice.equalsIgnoreCase("1") || choice.equalsIgnoreCase("view") ) {
				System.out.println("--------------------------------------- ");
				System.out.println("View Table Value");
				System.out.print("Select table name to view (Students/Class/Marks) :");
				option=1;
				tableName = cin.nextLine();
				// view
				try {
				      //STEP 2: Register JDBC driver
				      Class.forName("com.mysql.jdbc.Driver");

				      //STEP 3: Open a connection
				      System.out.println("Connecting to a selected database...");
				      conn = DriverManager.getConnection(DB_URL, USER, PASS);
				      System.out.println("Connected database successfully...");
				      
				      //STEP 4: Execute a query
				      System.out.println("Creating statement...");
				      stmt = conn.createStatement();

				      String sql = "SELECT * FROM "+ tableName;
				      ResultSet rs = stmt.executeQuery(sql);
				      //STEP 5: Extract data from result set
				      if (tableName.equalsIgnoreCase("Students")) {
				     
				    	  System.out.println("_____________________________________________________________");
					      System.out.println("|Name    | ID      | Age   | Gender  | Class  |");
					      System.out.println("--------------------------------------------------------------");
					      
				      while(rs.next()){
				         //Retrieve by column name
				         String name  = rs.getString("Name");
				         int id = rs.getInt("ID");
				         int age = rs.getInt("age");
				         String gender  = rs.getString("Gender");
				         String subject = rs.getString("Class");

				         //Display values
				         
				         System.out.println("|"+ name +"            |"+ id +"        |"+ age +"          |"+ gender +"   |"+ subject +"     |");
				         
				      	}
				      System.out.println("--------------------------------------------------------------");
				      } else if (tableName.equalsIgnoreCase("Class")) {
				    	  System.out.println("_______________________________");
					      System.out.println("|Subject   | credit_hours      |");
					      System.out.println("-------------------------------");
					      while(rs.next()){
					         //Retrieve by column name
						     String subject = rs.getString("Subject");
					         String credit_hours = rs.getString("credit_hours");

					         //Display values
					         System.out.println("|"+ subject + "  |" + credit_hours + "  |");
					         
					      }
					      System.out.println("-------------------------------");
					   } else if (tableName.equalsIgnoreCase("Marks")) {
						   System.out.println("_________________________");
						   System.out.println("Name    | Grade	| Status	|");
						   System.out.println("-----------------------");
						   
					      while(rs.next()){
					         //Retrieve by column name
						     String name  = rs.getString("Name");
						     String grade = rs.getString("Grade");
						     String status = rs.getString("Status");
					  
					         //Display values;
					         System.out.println(name +"           |" + grade +"			|" + status +"			|"	);
					      }  
					      System.out.println("-----------------------");
					   }
				      rs.close();
				   }catch(SQLException se){
				      //Handle errors for JDBC
				      se.printStackTrace();
				   }catch(Exception e){
				      //Handle errors for Class.forName
				      e.printStackTrace();
				   }finally{
				      //finally block used to close resources
				      try{
				         if(stmt!=null)
				            conn.close();
				      }catch(SQLException se){
				      }// do nothing
				      try{
				         if(conn!=null)
				            conn.close();
				      }catch(SQLException se){
				         se.printStackTrace();
				      }//end finally try
				   }//end try
				
			} else if (choice.equalsIgnoreCase("2") || choice.equalsIgnoreCase("Insert") ) {
				System.out.println("--------------------------------------- ");
				System.out.println("Insert new value ");
				System.out.println("Select Table to Insert their value (Students/Class/Marks) ");
				System.out.print("Enter : ");
				tableName = cin.nextLine();
			    option=1;
			    if (tableName.equalsIgnoreCase("Students")) {
			    	String Name;
			    	int id;
			    	int age;
			        String gender;
			        String subject;
			    	
			    	System.out.println("Enter Details Below ..");
			    	System.out.print("Name : ");
			    	Name = cin.nextLine();
			    	System.out.print("ID : ");
			    	id = cin.nextInt();
			    	System.out.print("Age : ");
			    	age = cin.nextInt();
			    	System.out.print("Gender : ");
			    	gender = nic.nextLine();
			    	System.out.print("Class : ");
			    	subject = cin.nextLine();
			    	
			    	
			    	
			    	
			    try{
			        //STEP 2: Register JDBC driver
			        Class.forName("com.mysql.jdbc.Driver");

			        //STEP 3: Open a connection
			        System.out.println("Connecting to a selected database...");
			        conn = DriverManager.getConnection(DB_URL, USER, PASS);
			        System.out.println("Connected database successfully...");
			        
			        //STEP 4: Execute a query
			        System.out.println("Inserting records into the table...");
			        stmt = conn.createStatement();
			        
			        String sql = "INSERT INTO " + tableName +
			                     " VALUES ("+Name+"," +id+ ",'"+ age +"','"+ gender + "',"+ subject + ",')";
			        stmt.executeUpdate(sql);
			        System.out.println("Inserted records into the table...");

			     }catch(SQLException se){
			        //Handle errors for JDBC
			        se.printStackTrace();
			     }catch(Exception e){
			        //Handle errors for Class.forName
			        e.printStackTrace();
			     }finally{
			        //finally block used to close resources
			        try{
			           if(stmt!=null)
			              conn.close();
			        }catch(SQLException se){
			        }// do nothing
			        try{
			           if(conn!=null)
			              conn.close();
			        }catch(SQLException se){
			           se.printStackTrace();
			        }//end finally try
			     }//end try
			    } // end student if
			
			    else if (tableName.equalsIgnoreCase("Class")) {
			    	String subject;
			    	String credit_hours;
			    	
			    	System.out.println("Enter Details Below ..");
			    	System.out.print("Enter Class Subject : ");
			    	subject = cin.nextLine();
			    	System.out.print("Enter Class Credit Hours : ");
			    	credit_hours = nic.nextLine();
			    				    	
			    try{
			        //STEP 2: Register JDBC driver
			        Class.forName("com.mysql.jdbc.Driver");

			        //STEP 3: Open a connection
			        System.out.println("Connecting to a selected database...");
			        conn = DriverManager.getConnection(DB_URL, USER, PASS);
			        System.out.println("Connected database successfully...");
			        
			        //STEP 4: Execute a query
			        System.out.println("Inserting records into the table...");
			        stmt = conn.createStatement();
			        
			        String sql = "INSERT INTO " + tableName +
			                     " VALUES ("+subject+",'" +credit_hours+ "')";
			        stmt.executeUpdate(sql);
			        System.out.println("Inserted records into the table...");

			     }catch(SQLException se){
			        //Handle errors for JDBC
			        se.printStackTrace();
			     }catch(Exception e){
			        //Handle errors for Class.forName
			        e.printStackTrace();
			     }finally{
			        //finally block used to close resources
			        try{
			           if(stmt!=null)
			              conn.close();
			        }catch(SQLException se){
			        }// do nothing
			        try{
			           if(conn!=null)
			              conn.close();
			        }catch(SQLException se){
			           se.printStackTrace();
			        }//end finally try
			     }//end try
			    } // end class if
			    
			    else if (tableName.equalsIgnoreCase("Marks")) {
			    	String name;
			    	String subject;
			    	String grade;
			    	String status;

			    	System.out.println("Enter Details Below ..");
			    	System.out.print("Enter Student Name  : ");
			    	name = cin.nextLine();
			    	System.out.print("Enter Subject : ");
			    	subject = cin.nextLine();
			    	System.out.print("Grade : ");
			    	grade = cin.nextLine();
			    	System.out.print("Enter Student's Status : ");
			    	status = cin.nextLine();
			    				    	
			    try{
			        //STEP 2: Register JDBC driver
			        Class.forName("com.mysql.jdbc.Driver");

			        //STEP 3: Open a connection
			        System.out.println("Connecting to a selected database...");
			        conn = DriverManager.getConnection(DB_URL, USER, PASS);
			        System.out.println("Connected database successfully...");
			        
			        //STEP 4: Execute a query
			        System.out.println("Inserting records into the table...");
			        stmt = conn.createStatement();
			        
			        String sql = "INSERT INTO " + tableName +
			                     " VALUES ("+name+"," +subject+ "," +grade+"," +status+")";
			        stmt.executeUpdate(sql);
			        System.out.println("Inserted records into the table...");

			     }catch(SQLException se){
			        //Handle errors for JDBC
			        se.printStackTrace();
			     }catch(Exception e){
			        //Handle errors for Class.forName
			        e.printStackTrace();
			     }finally{
			        //finally block used to close resources
			        try{
			           if(stmt!=null)
			              conn.close();
			        }catch(SQLException se){
			        }// do nothing
			        try{
			           if(conn!=null)
			              conn.close();
			        }catch(SQLException se){
			           se.printStackTrace();
			        }//end finally try
			     }//end try
			    } // end class if
			} else if (choice.equalsIgnoreCase("3") || choice.equalsIgnoreCase("Update") ) {
				System.out.println("--------------------------------------- ");
				System.out.println(" Update the table value ");
				option=1;
			
			} else if (choice.equalsIgnoreCase("4") || choice.equalsIgnoreCase("Delete") ) {
				System.out.println("--------------------------------------- ");
				System.out.println(" Delete the table value ");
				option=1;
			
			}else if (choice.equalsIgnoreCase("h") || choice.equalsIgnoreCase("help") ) {
				System.out.println("--------------------------------------- ");
				System.out.println("1. View - View table value ");
				System.out.println("2. Insert - Insert new value ");
				System.out.println("3. Update - Update the table value ");
				System.out.println("4. Delete - Delete the table value ");
				System.out.print("Enter : ");
				choice = cin.nextLine();
			
			} else {
				System.out.println("--------------------------------------- ");
				System.out.println(" Invalid input Please Try Again . Enter h or Help for info");
				System.out.print("Enter : ");
				choice = cin.nextLine();
			}
		
		 }
		option=0;
		}
		
		}

}