package lab6;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Exercise_1 {
	
	public static void main(String ...args) {
		Scanner in = new Scanner(System.in);
		String str = in.nextLine();
		Integer sum = 0;
		
		   StringTokenizer st = new StringTokenizer(str," ");  
		while (st.hasMoreTokens()) {  
		         sum += Integer.parseInt(st.nextToken());
		} 
		System.out.println(sum);
	}
}
