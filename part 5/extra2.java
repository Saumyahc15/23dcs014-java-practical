import java.lang.*;
import java.util.Scanner;

class extra2
{
	
	public static void main(String []args)
	{
		int x=5,b=0,c;
		int a[]={10,20,30};
		String y="charusat";
		String p=null;
		try{
			
			c=x/b;
			System.out.println(a[3]);
			System.out.println(y.charAt(9));
			System.out.println(p.length());
		}
		
		  
		catch(ArithmeticException e)
		  {
			  System.out.println("Exception solved 1" + e.toString());
			  
		  }
		  
		  catch(ArrayIndexOutOfBoundsException k)
		   {
			  System.out.println("Exception solved 2" + k.toString());
			  
		  }
		   catch(StringIndexOutOfBoundsException h)
		   {
			  System.out.println("Exception solved 3" + h.toString());
			  
		  }
		  
		  catch(NullPointerException u)
		   {
			  System.out.println("Exception solved 4" + u.toString());
			  
		  }
		  
		  
		  
		  
	}
	
}
