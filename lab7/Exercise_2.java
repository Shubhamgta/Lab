/*Exercise 2: Create a method that accepts a character array and count the number of times each 
 * character is present in the array. Add how many times each character is present to a 
 * hash map with the character as key and the repetitions count as value
Method Name-countCharacter
Method Description-Count the number of occurrence of each character in a Character array
Argument-char[]
Return Type-map
Logic-Count the number of times each character appears in the array. 
	Add the details into a hash map with character as key and count as value.
Example:
{‘A’,’P’,’P’,’L’,’E’}
Output: Will be hashmap with the following contents{‘A’:1,’P’:2,’L’:1,’E’:1}*/
package lab7;
import java.util.*;
public class Exercise_2 {
public static void main(String[] args) {
	char[] arr= {'A','P','P','L','E','A'};
	System.out.println(countCharacter(arr));
}
public static HashMap<Character,Integer> countCharacter(char[] arr) {
	HashMap<Character,Integer> map= new HashMap<>();
	for( char c: arr) {
		if(map.containsKey(c))
			map.put(c, map.get(c)+1);
		else
			map.put(c, 1);
	}
	return map;
}
}
