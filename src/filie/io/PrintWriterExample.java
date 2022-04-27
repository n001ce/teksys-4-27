package filie.io;

import java.io.PrintWriter;

public class PrintWriterExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String data = "This is a text inside the file.";
		
		try {
			PrintWriter output = new PrintWriter("Enter output file location");
			output.print(data);
			output.close();
		}
		catch(Exception e){
			e.getStackTrace();
		}

	}

}
