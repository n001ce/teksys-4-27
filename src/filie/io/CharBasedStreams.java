package filie.io;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.Reader;

public class CharBasedStreams {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Reader fr = null;
		BufferedReader br = null;
		PrintWriter w = null;
		
		try {
			fr = new java.io.FileReader("insert location here");
			br = new BufferedReader(fr);
			w = new PrintWriter("insert output file location");
			String st;
			
			while((st = br.readLine()) != null) {
				w.print(st);
			}
		}
		catch(FileNotFoundException e) {
			System.out.println("you got exception. Input File is not found.");
		}
		catch(IOException i) {
			System.out.println("you got exception. outFile is not found.");
		}
		finally {
			fr.close();
			w.close();
			br.close();
		}

	}

}
