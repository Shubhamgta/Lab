package lab5;

public class Exercise_4 {
	public static void main(String ...args) {
		Exercise_4 aa = new Exercise_4();
		String fnm = null;
		String lnm = null;
		try {
			aa.check(fnm, lnm);
		} catch(RuntimeException s) {
			System.out.println(s.getMessage());
		}
		
	}
	
	public void check(String fnm, String lnm) throws RuntimeException {
		
		if(fnm == null && lnm == null) {
			throw new UserDefinedException_Ex4("this is userDefined exception");
		}
	}
}
