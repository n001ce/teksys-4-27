package filie.io;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class DelimitedFile {

	public static void main(String[] args) {
		// Reading a Delimited File
		try {
		String location = "location path";
		File file = new File(location);
		Scanner input = new Scanner(file);
		ArrayList<String[]> data = new ArrayList<String[]>();//create new ArrayList of type String array
		while(input.hasNextLine()) {
			String line = input.nextLine();// create line and split it by "," 
			data.add(line.split(","));// store in String array data
		}
		for(String[] line : data) { //for each line in data print line out
			System.out.println(line[0] + " | " + line[1] + " | " + line[2]);
		}

	}catch(FileNotFoundException e) {//File not found exception thrown
		System.out.println("File not found!");
	}

}
