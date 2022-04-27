package filie.io;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class DelimitedFile {

	public static void main(String[] args) throws IOException {
		String location = "C:\\Users\\Kepler01635\\Desktop\\courses.csv";
		File file = new File(location);
		FileWriter writer;
		try {
			writer = new FileWriter(file, true);
			writer.write("CIS335, Advanced Object-Oriented Programming, Bairon Vasque\n");
			writer.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//Reading a delimited file using model
		Scanner input = new Scanner(file);
		ArrayList<Course> data = new ArrayList<Course>();
		while(input.hasNextLine()) {
			String [] line = input.nextLine().split(",");
			data.add(new Course(line[0], line[1], line[2]));
		}
		for(Course course : data) {
			System.out.format("%-15s | %-35s | %-25s\n",
					course.getCode(), course.getName(), course.getInstructor());
		}
		
		
		// Reading a Delimited File
//		try {
//		String location = "location path";
//		File file = new File(location);
//		Scanner input = new Scanner(file);
//		ArrayList<String[]> data = new ArrayList<String[]>();//create new ArrayList of type String array
//		while(input.hasNextLine()) {
//			String line = input.nextLine();// create line and split it by "," 
//			data.add(line.split(","));// store in String array data
//		}
//		for(String[] line : data) { //for each line in data print line out
//			System.out.println(line[0] + " | " + line[1] + " | " + line[2]);
//		}
//
//	}catch(FileNotFoundException e) {//File not found exception thrown
//		System.out.println("File not found!");
//	}

}
}
