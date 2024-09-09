import java.lang.*;
import java.util.Scanner;

class extra3
{
	
	public static void main(String []args)
	{
		int x=5,b=0,c;
		int a[]={10,20,30};
		String y="charusat";
		String p=null;
		try{
			try{
				
				System.out.println(a[3]);
			}
		    catch(ArrayIndexOutOfBoundsException k)
		   {
			  System.out.println("Exception solved 2" + k.toString());
		   }
		   try{
			
			c=x/b;
		   }
		   catch(ArithmeticException e)
		  {
			  System.out.println("Exception solved 1" + e.toString());
			  
		  }
		  try{
		  System.out.println(y.charAt(9));
		  }
		   
		   catch(StringIndexOutOfBoundsException h)
		   {
			  System.out.println("Exception solved 3" + h.toString());
			  
		  }
		  try{
			  System.out.println(p.length());
		    }
			catch(NullPointerException u)
		   {
			  System.out.println("Exception solved 4" + u.toString());
			  
		  }
		   
		}
      catch(Exception e)
		  {
			  System.out.println("Exception solved 1" + e.toString());
			  
		  }
	}
}
