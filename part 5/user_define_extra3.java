import java.util.*;
class InvalidAgeException extends Exception
{
InvalidAgeException(String s)
{
	super(s);
}
}
class user_define_extra3
{
	public static void main(String []args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your age:");
		int age=sc.nextInt();
		if(age<18)
			{
		try
		{
			throw new InvalidAgeException("Not eligible for voting in 2024");
		}
		catch(InvalidAgeException e)
		{
			System.out.println(e.getMessage());
			System.out.println("Exception caught successfully");
		}
			}
			else
			{
			System.out.println("eligible for voting in 2024");	
			}
	}
}
