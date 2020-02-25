package lab1;

public class Exercise_1 {
public boolean checkNumber(int i) {
	int p = i%10; // 5
	i=i/10;
	
	while(i!=0) { ///12345
		int t=i%10; //4
		if(p<t)
			return false;
		
		i=i/10;
	}
	
	return true;
 }
}
