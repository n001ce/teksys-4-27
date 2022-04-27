package filie.io;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ScannerFile {
	public static void main(String args[]) {
		//Account for any errors that might occur
		try {
			String location = "file location";
			File file = new File(location);
			Scanner input = new Scanner(file);
			String line = input.nextLine();
		}catch(FileNotFoundException e){
			System.out.println("File not found!");
			e.printStackTrace();
		}
//		String location = "file location";
//		File file = new File(location);
//		Scanner input = new Scanner(file);
//		String line = input.nextLine();
	}
}
