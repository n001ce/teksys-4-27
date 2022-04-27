package filie.io;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ConsoleReader {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader R = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Input your name: ");
		String name = R.readLine();
		System.out.println("Your name is: " + name);
	}

}
