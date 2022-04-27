package filie.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class BinaryFilesReadEx1 {
	public static void main(String [] args) {
		// The name of the file to open
		String fileName = "sample.txt";
		try {
			//Use this for reading the data
			byte[] buffer = new byte[1000];
			FileInputStream inputStream = new FileInputStream(fileName);
			//read fills buffer with data and returns
			//the number of bytes read
			int total = 0;
			int nRead = 0;
			while((nRead = inputStream.read(buffer)) != -1) {
				//Convert to String so we can display it.
				System.out.println(new String(buffer));
				total += nRead;
			}
		}
		catch(FileNotFoundException ex) {
			System.out.println("Unable to open file '" + fileName + "'");
		}
		catch(IOException ex) {
			System.out.println("Error reading file '" + fileName + "'");
		}
	}

}
