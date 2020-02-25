package lab3;

import java.util.Scanner;
import java.util.*;

public class Exercise_1 {
	
	public static void main(String ...args) {
		Integer arr[] = new Integer[10];
		Scanner sn = new Scanner(System.in);
		int i = 0;
		while(i<10) {
			arr[i] = Integer.parseInt(sn.nextLine());
			i++;
		}
		 Arrays.sort(arr); 
		 System.out.print(arr[1]);
		
	}
}
