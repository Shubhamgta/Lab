package lab1;

public class Exercise_2 {
public boolean checkPowOfTwo(int i) {
	boolean t = true;
	while(t) {
		if(i== 1) return true;
		System.out.println(i);
		if(i%2 !=0)
			{t=false; return false;}
		
		i = (int)i/2;
	}
	
	return true;
}
}
