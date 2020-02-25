package lab4;

public class Exercise_1 {
	public static void main(String ...args) {
		long n = 89379835;
		long k = 0;
		
		while(n != 0) {
			long a = n%10;
			k+= (a*a*a);
			n = n/10;
		}
		
	}
}
