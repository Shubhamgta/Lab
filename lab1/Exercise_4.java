package lab1;

public class Exercise_4 {
	
public int getSumDiff(int i) {
	int sm = 0;
	int s1 =0;
	for(int k=1; k<=i; k++) {
		sm += k*k;
	}
	for(int k=1; k<=i; k++) {
		s1 += k;
	}
	return sm-(s1*s1);
  }
}
