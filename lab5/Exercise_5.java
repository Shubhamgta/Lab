package lab5;

public class Exercise_5 {
	public static void main(String ...args) {
		Exercise_5 aa = new Exercise_5();
		int age = 34;
		try {
			aa.check(age);
		} catch(RuntimeException s) {
			System.out.println(s.getMessage());
		}
		
	}

	
	public void check(int age) throws RuntimeException {
		
		if(age<15) {
			throw new UserDefineException_Ex5("this is userDefined exception");
		}
	}
}
