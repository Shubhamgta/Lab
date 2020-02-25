package lab5;

import java.util.Scanner;

public class Exercise_3 {
	 public static void main (String[] args)
	   {		
		   Scanner in = new Scanner(System.in);
	       int i =0;
	       int cp = in.nextInt();
	       int num =0;
	       //Empty String
	       String  primeNumbers = "";

	       for (i = 1; i <= cp; i++)         
	       { 		  	  
	          int counter=0; 	  
	          for(num =i; num>=1; num--)
		  {
	             if(i%num==0)
		     {
	 		counter = counter + 1;
		     }
		  }
		  if (counter ==2)
		  {
		     //Appended the Prime number to the String
		     primeNumbers = primeNumbers + i + " ";
		  }	
	       }	
	       System.out.println("Prime numbers from 1 to "+cp+" are :");
	       System.out.println(primeNumbers);
	   }
}
