package lab6;
public class Exercise_3 {
	
	public static void main(String ...stringsargs) {
		String k = "GeeksforGeeks";
		StringBuffer s=new StringBuffer(k);
		s.append("|" +new StringBuffer(k).reverse());
		String str = s.toString();
	    System.out.println("String object: "+str);
	}
}
