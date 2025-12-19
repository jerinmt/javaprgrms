import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class FilePractice {

	public static void main(String[] args) {
		//create file
		File file = new File("assignment.txt");
	    try {
	      boolean value = file.createNewFile();
	      if (value) {
	        System.out.println("The new file is created.");
	      }
	      else {
	        System.out.println("The file already exists.");
	      }
	    }
	    catch(Exception e) {
	      e.getStackTrace();
	    }
	    //write to the file
	    String data = "Java file handling practice";
	    try {
	        FileWriter output = new FileWriter("assignment.txt");
	        output.write(data);
	        System.out.println("Content written to the file.");
	        output.close();
	      }
	      catch (Exception e) {
	        e.getStackTrace();
	      }
	    //read from the file
	    char[] array = new char[100];
	    try {
	      FileReader input = new FileReader("assignment.txt");
	      input.read(array);
	      System.out.println("File content:");
	      System.out.println(array);
	      input.close();
	    }
	    catch(Exception e) {
	      e.getStackTrace();
	    }
	    //delete the file
	    boolean value = file.delete();
	    if(value) {
	      System.out.println("The File is deleted.");
	    }
	    else {
	      System.out.println("The File is not deleted.");
	    }
	}
}
