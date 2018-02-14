//File's Existence
// We can check if the abstract pathname of a File object exists using the exists() method of the File class.

import java.io.File;

public class FileExistence {

public static void main(String[] argv) {
    // Create a File object
    File dummyFile = new File("input.txt");

    // Check for the file's existence
    boolean fileExists = dummyFile.exists();
    if (fileExists) {
      System.out.println("The " + dummyFile +  "file exists.");
    } else {

      System.out.println("The file does  not  exist.");
    }

  }
}
 