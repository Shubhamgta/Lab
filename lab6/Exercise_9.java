package lab6;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Date;

/*
 * Exercise 9: Create a method to accept date and print the duration in 
 * days, months and years with regards to current system date.
 */
public class Exercise_9 {
	
	public static void main(String ...args) {
		String sDate1="31/12/1998";  
		String sDate2="12/04/2000";  
		
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("d/MM/yyyy");
		LocalDate localDate1 = LocalDate.parse(sDate1, formatter);
		LocalDate localDate2 = LocalDate.parse(sDate2, formatter);
		
		Period period = Period.between(localDate1, localDate2);
		System.out.println("day : "+ period.getDays());
		System.out.println("month : "+ period.getMonths());
		System.out.println("year : "+ period.getYears());
	}
}
