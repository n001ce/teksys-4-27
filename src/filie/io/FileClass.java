/**
 * 
 */
package filie.io;

import java.io. * ;
public class FileClass {
 public static void main(String[] args) {
	 File f = new File("insert location here");
	 System.out.println(f.mkdir());
//   try {
//    File f = new File("insert file location here”);
//     if (f.createNewFile()) {
//       System.out.println("New File created!");
//     } else {
//       System.out.println("The file already exists.");
//     }
//   } catch(IOException e) {
//     e.printStackTrace();
//   }
 }
}

