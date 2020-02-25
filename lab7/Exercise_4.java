package lab7;
import java.util.*;
import java.util.Map.Entry;
public class Exercise_4 {
public static void main(String[] args) {
	Map<Integer,Integer> map= new HashMap<>();
	map.put(1, 99);
	map.put(3, 75);
	map.put(2, 85);
	map.put(5, 60);
	map.put(4, 60);
	System.out.println(getStudents(map));
}
static HashMap<Integer,String> getStudents(Map<Integer,Integer> map) {
	Map<Integer,String> medalResult= new HashMap<>();
	for(Entry<Integer, Integer> Entry : map.entrySet()) {
		if(Entry.getValue()>=90)
			medalResult.put(Entry.getKey(),"Gold");
		else if(Entry.getValue()>=80 && Entry.getValue()<90)
			medalResult.put(Entry.getKey(),"Silver");
		else if(Entry.getValue()>=70 && Entry.getValue()<80)
			medalResult.put(Entry.getKey(),"Bronze");
		else if(Entry.getValue()<70)
			medalResult.put(Entry.getKey(),"No mEdal");
	}
	return (HashMap<Integer, String>) medalResult;
}
}
