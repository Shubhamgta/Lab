package lab6;

public class Exercise_5 {
	public static void main(String ...args) {
		Integer a = 6235553;
		a = new Exercise_5().method(a);
		System.out.print(a);
	}
	
	public Integer method(Integer a) {
		
		String aa = Integer.toString(a);
		StringBuffer p = new StringBuffer(aa);
		Integer len = aa.length();

		int pos = 0;int k = 0;
		int i;
		for(i=0; i<len/2; i++) {

			Integer aas = ((int)p.charAt(pos) - (int)p.charAt(pos+1));
     		System.out.println(Math.abs((int)p.charAt(pos) - (int)p.charAt(pos+1)));
			k = k*10 +aas;
			pos+=2;
		}
		
		if(i*2+1 == len)
			k = k*10 + (int)p.charAt(len-1);
		
		return k;
	}
}
