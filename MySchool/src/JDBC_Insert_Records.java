//STEP 1. Import required packages
import java.sql.*;

public class JDBC_Insert_Records {
   // JDBC driver name and database URL
   static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";  
   static final String DB_URL = "jdbc:mysql://localhost/school";

   //  Database credentials
   static final String USER = "atika";
   static final String PASS = "mypass!@#";
   
   public static void main(String[] args) {
   Connection conn = null;
   Statement stmt = null;
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
      
      String sql = "INSERT INTO Students " +
                   "VALUES (20185005, 'Hanisah', 23, 'Female' )";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Students " +
                  "VALUES (20185005, 'suraya', 28, 'Female')";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Students " +
                  "VALUES (20188002, 'Ali', 25, 'Male')";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Students " +
                  "VALUES (20187003, 'Zain', 30, 'Male' )";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Students " +
      "VALUES(20186004, 'Suraya', 28, 'Female' )";
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
   System.out.println("Goodbye!");
}//end main
}//end JDBCExample
