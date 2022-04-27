package filie.io;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ScannerFile {
	public static void main(String args[]) {
		//Read an entire file
		try {
			String location = "location path";
			File file = new File(location);
			Scanner input = new Scanner(file);
			String data = "";
			while(input.hasNextLine()) { //while file has next line, data becomes that line
				data = input.nextLine();
			}
		}catch(FileNotFoundException e) { //if file isn't found print file not found
			System.out.println("File not found!");
			e.printStackTrace();
		}
		
		
		//Account for any errors that might occur
//		try {
//			String location = "file location";
//			File file = new File(location);
//			Scanner input = new Scanner(file);
//			String line = input.nextLine();
//		}catch(FileNotFoundException e){
//			System.out.println("File not found!");
//			e.printStackTrace();
//		}
		//Read a files first line.
//		String location = "file location";
//		File file = new File(location);
//		Scanner input = new Scanner(file);
//		String line = input.nextLine();
	}
}
