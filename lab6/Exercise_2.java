package lab6;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/*
 * Exercise 2: Write a Java program that reads a file and displays
 * the file on the screen, with a line number before each line?
 */

public class Exercise_2 {
	public static void main(String ...args) throws FileNotFoundException {
		String inputPath = "D:\\workspace\\ipfile.txt";
		File inputFile = new File(inputPath);
		String outputPath = "D:\\workspace\\opfile11.txt";
		File outFile = new File(outputPath);
		
		int size = 0;
		
		try (
			InputStream inputStream = new FileInputStream(inputFile);
			BufferedInputStream bin = new BufferedInputStream(inputStream);
			// path
			OutputStream outputStream = new FileOutputStream(outFile);
			BufferedOutputStream bout = new BufferedOutputStream(outputStream);
		) {
			// this is for single bit
			char ch;
			int readByte;
			int totalSize = 0;
			while((readByte = bin.read())> 0) { 
				bout.write(readByte);
				totalSize++;
			}
			System.out.println(totalSize);
			
		} catch(IOException exception) {
				exception.printStackTrace();
		
		

	}
}
}