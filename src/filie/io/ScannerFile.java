package filie.io;

import java.util.Scanner;

public class ScannerFile {
	public static void main(String args[]) {
		String location = "file location";
		File file = new File(location);
		Scanner input = new Scanner(file);
		String line = input.nextLine();
	}
}
