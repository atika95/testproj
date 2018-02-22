package smk;

import java.sql.SQLException;
import java.util.Scanner;

public class Create {

    Create() throws SQLException {
        Scanner userInput = new Scanner(System.in);
        System.out.println("You selected option 1: Create database record: ");
        String name;
        System.out.println("Enter student name: ");
        name = userInput.next();

        String id;
        System.out.println("Enter id: ");
        id = userInput.next();

        String age;
        System.out.println("Enter age: ");
        age = userInput.next();
       
        DBUtilities dbUtilities = new DBUtilities();
        
        String sql_stmt = "INSERT INTO student (name,id,age) VALUES ('" + name + "','" + id + "','" + age + "')";
        
        dbUtilities.ExecuteSQLStatement(sql_stmt);
        
        
        CRUDSchool.DisplayMenu();
    }
}