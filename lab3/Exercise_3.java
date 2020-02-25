package lab3;

import java.util.Arrays;
import java.util.Collection;

public class Exercise_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer arr[] = new Integer[6];

		arr[0] = 1;
		arr[1] = 19;
		arr[2] = 154;
		arr[3] = 1345;
		arr[4] = 154;
		arr[5] = 1645;
		
		for(int i=0; i<6; i++) {
			int a = arr[i];
			String s = Integer.toString(a);
			s = new StringBuilder().append(s).reverse().toString();
			arr[i] = Integer.parseInt(s);
		}
		
		Arrays.sort(arr); 
		
		for(int i=0; i<6; i++) {
			System.out.println(arr[i]);
		}
		
			
		  
	}

}
