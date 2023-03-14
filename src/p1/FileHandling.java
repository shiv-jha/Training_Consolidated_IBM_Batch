package p1;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileHandling {

	public static void main(String[] args) throws IOException {
		File oFile= new File("myfile.txt");
		System.out.println(oFile.exists());
		oFile.createNewFile();
		System.out.println(oFile.getAbsoluteFile());
		FileWriter oWriter = new FileWriter(oFile);
		oWriter.write("Hello , writing into file");
		oWriter.write("\n");
		oWriter.write("Hello , writing into 2nd line");
		oWriter.write("\n");
		oWriter.write("Hello , writing into 3rd line");
		oWriter.close();
		Scanner oScan= new Scanner(oFile);
		while(oScan.hasNextLine()) {
		System.out.println(oScan.nextLine());
		}
	}

	//try
	//catch
	//finally
	//throw
	//throws
}
