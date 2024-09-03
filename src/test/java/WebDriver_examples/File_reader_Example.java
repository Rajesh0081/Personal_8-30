package WebDriver_examples;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class File_reader_Example {

	public static void main(String[] args) throws Exception {
		FileReader reader=new FileReader("C:\\Users\\dell\\Desktop\\PERSONAL_BATCH.txt");
		
		BufferedReader file=new BufferedReader(reader);
		
		String line;
		
		while ((line=file.readLine())!=null) {
			System.out.println(line);
		}
		
		

	}

}
