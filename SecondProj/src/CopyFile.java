import java.io.BufferedReader;
import java.io.*;
import java.io.IOException;
import java.io.InputStreamReader;

public class CopyFile {

   public static void main(String args[]) throws IOException {  
      //FileInputStream in = null;
      //FileOutputStream out = null;
      
      FileReader in = null;
      FileWriter out = null;
      
      
      try {
         //in = new FileInputStream(".\\input.txt");
    	  
    	  BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
          
          System.out.println("Enter Input file :");
          String input=br.readLine();
          System.out.println("Enter Output file :");
          String output=br.readLine();
          
        // in = new FileInputStream(dirpath);
         // out = new FileOutputStream(dname);
         
    	  in = new FileReader(input);
          out = new FileWriter(output);
    	  
         int c;
         while ((c = in.read()) != -1) {
            out.write(c);
         }
         System.out.println("File copy");
      }finally {
         if (in != null) {
            in.close();
         }
         if (out != null) {
            out.close();
         }
      }
   }
}