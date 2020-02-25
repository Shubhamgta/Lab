package lab6;
/*Exercise_4: Create a method which accepts a String and replaces all the
 *  consonants in the String with the next alphabet.
 */
public class Exercise_4 {
	public static void main(String ...args) {
		String str = "java";
		char[] ch = str.toCharArray(); 
		  
        // Printing array 
        for (int i=0; i<str.length(); i++) { 
        	System.out.println(ch[i]);
        	
            if(ch[i] != 'a'  || ch[i] != 'e' || ch[i] != 'i' || ch[i] != 'o' || ch[i] != 'u') {
            	ch[i] = (char) (ch[i] + 1);
            }else {
            	System.out.println("ex");
            }
        }
        System.out.println(ch);
	}
}
