package filie.io;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;

public class FileReader {

	public static void main(String args[]) throws IOException {
	   	Reader in = null;
	   	FileWriter out = null;
	 	try {
	 		in = new java.io.FileReader("Enter File location here");
	 		out = new FileWriter("Enter output file location here");
	   	    int c;
	   	    while ((c = in.read()) != -1) {
	   	        out.write(c);
	   	     	}
	   	    System.out.println("Reading and Writing in a file is done!!!");
	   	  	}
	   	  	catch(Exception e) {
	   		     System.out.println(e);
	   	  	}
	   	  	finally {
   	     		if (in != null) {
   	     			in.close();
   	     		}
   	     		if (out != null) {
   	     			out.close();     	
   	        	}
	   	  	}
		}
	}