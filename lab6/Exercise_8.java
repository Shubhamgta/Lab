package lab6;
public class Exercise_8 {
	
	public static void main(String ...args) {
		String a = "ANET";
		boolean f = true;
		Integer len = a.length();
		char ar[] = a.toCharArray();
		
		for(int i=0; i<len-1; i++) {
			if(ar[i] > ar[i+1]) {
				f = false;
				break;
			}
		}
		System.out.println(f);
	}
}
