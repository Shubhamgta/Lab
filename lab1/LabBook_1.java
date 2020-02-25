package lab1;

public class LabBook_1 {
	
	public static void main(String ...args) {
//      LAB_BOOK_1
		
//		Exercise 1: Create a class with a method which can calculate the sum of first n natural numbers which are divisible by 3 or 5.
		Exercise_3 naturalNum = new Exercise_3();
		System.out.println(naturalNum.getSum(20));
		
//      Exercise 2: Create a class with a method to find the difference between the sum of the squares and the square of the sum of the first n natural numbers.
		Exercise_4 squareSumDf = new Exercise_4();
		System.out.println(squareSumDf.getSumDiff(10));
		
//      Exercise 3: Create a method to check if a number is an increasing number
		Exercise_1 checkNum = new Exercise_1();
		if(checkNum.checkNumber(12345))
		System.out.println("incresing");
		else
	    System.out.println("not increasing");
		
//		Exercise 4: Create a method to check if a number is a power of two or not
		Exercise_2 checkPow = new Exercise_2();
		if(checkPow.checkPowOfTwo(16))
		System.out.println("Power of two");
		else
	    System.out.println("Not Power of two");
		
		
	}
}
