
//Exercise 1: Create a method which accepts a hash map and return the values of the map in sorted 
//order as a List.
//Method Name-getValues
//Method Description-Get the values of a map in sorted order
//Argument-HashMap
//Return Type-List
//Logic-Return the values of a hash map in sorted order
package lab7;

import java.util.*;

public class Exercise_1 {
public static void main(String[] args) {
HashMap<Integer,Integer> map= new HashMap<>();
map.put(1,22);
map.put(4,25);
map.put(3,44);
map.put(2,2);

System.out.println(getValues(map));
}
public static List<Integer> getValues(HashMap<Integer,Integer> map) {
	ArrayList<Integer> list = new ArrayList<>(map.values());
	Collections.sort(list);
	return list;
}
}