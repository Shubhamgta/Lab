package lab6;

import java.io.File;
import java.util.Scanner;

/*
 * Exercise 7: Write a Java program that reads on file name from the user, then 
 * displays information about whether the file exists, whether the 
 * file is readable, whether the file is writable, the type of file and
 * the length of the file in bytes? 
 */

public class Exercise_7 {
	public static void main(String ...args) {
		Scanner in = new Scanner(System.in);
		String path = "D:\\workspace\\ipfile.txt";
		File fs = new File(path);
		System.out.println("Is exist :" + fs.exists());
		System.out.println("Is Readable :" + fs.canRead());
		System.out.println("Is writable " + fs.canWrite());
		System.out.println("lenght :" + fs.length());

	}
}
