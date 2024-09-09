import java.lang.*;
import java.util.Scanner;

class extra1
{
	
	public static void main(String []args)
	{
	int a[]={10,20,30};
		  try{
		  System.out.println(a[3]);
		  }
		  catch(ArrayIndexOutOfBoundsException ae)
		  {
			  System.out.println("Saumya "+ae.toString());
			  
		  }
		  
		  catch(Exception e)
		  {
			  System.out.println("Exception solved "+e.toString());
			  
		  }
		  
	}
}
