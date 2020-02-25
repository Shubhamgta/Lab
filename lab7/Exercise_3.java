package lab7;
import java.util.*;
public class Exercise_3 {
public static void main(String[] args) {
	int[] nums= {2,4,5,6,7,8,9};
	System.out.println(getSquares(nums));
}
public static Map getSquares(int[] nums) {
	Map<Integer,Integer> map= new HashMap<>();
	for(int n:nums) {
		map.put(n, n*n);
	}
	return map;
}
}
