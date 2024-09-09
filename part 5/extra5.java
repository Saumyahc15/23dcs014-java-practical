import java.lang.*;
import java.util.Scanner;

class extra5
{
	public static void main(String []args)
	{
		int a=5,b=0,c;
		System.out.println("before");
		
		try{
			
			c=a/b;
			System.out.println(c);
		}
		catch(ArithmeticException e)
		{        
		
			System.out.println("Exception solved " + e.getMessage());
		}
		finally
		{
          System.out.println("after");
		 
		} 
		System.out.println("HI");
	}
}
