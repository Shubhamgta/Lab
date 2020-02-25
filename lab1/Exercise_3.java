package lab1;

public class Exercise_3 {
	
	
	public int getSum(int i) {
		int n = i;
		int sm = 0;
		
		for(int k=1; k<=n; k++) {
			if(k%5 == 0 || k%3 == 0 || k%15 == 0)
				sm+=k;
		}
		
		return sm;
	}
}
