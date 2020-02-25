package lab3;

public class Exercise_2 {
	int x =10;
	public static void main(String ...args) {
		
		Exercise_2 m = new Exercise_2();
		String arr[] = {"sdjhjds", "sdjlkfjl", "lksfdljfo"};
		int len = arr.length;
		
		for(int i=0; i<len; i++) {
			StringBuilder stringBuilder = new StringBuilder();
			stringBuilder.append(arr[i]);
			int in = stringBuilder.length();
			int mid;
			if(in%2 != 0) {
				mid = (int)(in/2)+1;
			} else {
				mid = (int)(in/2);
			}
			
			System.out.print(arr[i].substring(0, mid).toUpperCase());
			System.out.println(arr[i].substring(mid, in));

			
	
		}
	}
	
}
