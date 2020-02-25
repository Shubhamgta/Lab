package lab6;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;

/*
 * Exercise 6: Write a Java program that displays the number of 
 * characters, lines and words in a text?
 * 
 */
public class Exercise_6 {
	
	public static void main(String ...args) {
		String path = "D:\\workspace\\ipfile.txt";
		File inputFile = new File(path);
		
		try (
				InputStream inputStream = new FileInputStream(inputFile);
				BufferedInputStream bin = new BufferedInputStream(inputStream);
			) {
			int readLine=0, readChar =0, readWord =0;
			int readByte;
			int totalSize = 0;
			boolean flag = false;
			boolean ct = true;
			while((readByte = bin.read())> 0) { 
				if((char)readByte == '\n') {
					readLine++;
					flag  = true;
				}

				if(flag) {
					readWord++;
					flag = false;
				}
				else if((char)readByte == ' ') {
					readWord++;
				}

				if((int)readByte == 10 || (int)readByte == 13 || (int)readByte == 32) {
					System.out.println(readByte);
				} else {
					readChar++;
					System.out.println(readByte);
				}
				
				if(ct && readChar == 1) {
					readLine++;
					readWord++;
					ct = false;
					System.out.println("LineWord");
				}
//				
				totalSize++;
			}
			System.out.println("Line " + readLine);
			System.out.println("Word " + readWord);
			System.out.println("Char " + readChar);
			
		} catch(Exception ex) {
			ex.printStackTrace();
		}

		
	}
}
