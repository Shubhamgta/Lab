package lab5;

public class Exercise_2 {
	public static void main(String ...args) {
		int n = 6;
		Exercise_2 aa = new Exercise_2();
		
//		aa.FibonaciSeries(n);
		System.out.println(aa.FibonaciSeriesRecur(n-1));
	}
	
	public void FibonaciSeries(int n) {
		int i = 1;
		int j = 1;
		
		for(int k=1; k<n-1; k++) { // 1 1 2 3 5 8 13 21
			int a = i + j;
			System.out.println(a);
			i = j;
			j = a;

		}
	}
	
	public int FibonaciSeriesRecur(int n) {
		if(n==0 || n==1)
			return 1;
		
		return FibonaciSeriesRecur(n-1) + FibonaciSeriesRecur(n-2);
	}
	
	
}
