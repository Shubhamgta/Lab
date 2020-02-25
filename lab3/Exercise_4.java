package lab3;

import java.util.HashMap;
import java.util.Map;

public class Exercise_4 {
	public static void main(String ...args) {
		String str = "dfkjhslkgjhjlrdd";
		countChar(str);
	}
	
	public static void countChar(String s) {
		Map<String, Integer> mp=  new HashMap< String,Integer>(); 
		for(String i: s.split("")) {
			if(mp.get(i) != null)
			mp.put(i, mp.get(i) + 1);
			else
		    mp.put(i, 1);
		}
		
		for(Map.Entry<String, Integer> entry : mp.entrySet()) {
			System.out.println("Key = " + entry.getKey() + 
                    ", Value = " + entry.getValue()); 
		}
	}
}
