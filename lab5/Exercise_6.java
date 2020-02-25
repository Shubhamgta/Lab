package lab5;
//import com.cg.eis.exception.EmployeeException_ex6;;

public class Exercise_6 {
	public static void main(String ...args)  {
		Integer sal = 2133;
		try {
			checkSalary(sal);
		} catch (UserDefinedException_Ex4 a) {
			System.out.println(a);
		}
	}
	
	public static  void  checkSalary(Integer sal) throws UserDefinedException_Ex4 {
		if(sal<3000) {
			throw new UserDefinedException_Ex4("error");
		} else {
			System.out.println("Nice Salary");
		}
	}
}
