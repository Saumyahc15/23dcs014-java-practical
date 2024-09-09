public class extrat4
{
	public static void main(String []args)
	{
		System.out.println("user define message");
		throw new ArithmeticException("CHARUSAT / by zero");
		System.out.println("rest of the code......");//will show error:unreachable statement
	}
}
