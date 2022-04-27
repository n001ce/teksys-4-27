package filie.io;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;

public class FolderContent {
	public static void main(String[] args) throws IOException{
		//enter the path and dirname from keyboard
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Enter dirpath: ");
		String dirpath = br.readLine();
		
		System.out.println("Enter the dirname: ");
		String dname = br.readLine();
		
		File f = new File(dirpath, dname);
		
		if(f.exists()) {
			// get the contents into arr[]
			//now arr[i] represent either a File or Directory
			String arr[] = f.list();
			//find no. of entries in the directory
			int n = arr.length;
			//display the entries.
			for(int i = 0; i < n; i++) {
				System.out.println(arr[i]);
				//create File object with the entry test
				//if it is a file or directory
				File f1 = new File(arr[i]);
				if(f1.isFile()) {
					System.out.println(": is a file");
				}
			}
			
			System.out.println("No. of entries in this directory " + n);
			
		}
		
		else {
			System.out.println("Directory not found");
		}
		
	}
}
