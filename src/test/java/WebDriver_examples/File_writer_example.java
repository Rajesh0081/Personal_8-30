package WebDriver_examples;

import java.io.FileWriter;
import java.io.IOException;

public class File_writer_example {

	public static void main(String[] args) throws Exception {
		FileWriter writer=new FileWriter("C:\\Users\\dell\\Desktop\\prasanthi.txt");
		
		writer.write("Welcome to Selenium");
		
		writer.write("\n");
		
		writer.write("This is Prasanthi");
		System.out.println("Written successfully");
		
		writer.close();

	}

}
