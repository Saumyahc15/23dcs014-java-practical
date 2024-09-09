public class extrat2
{
	public static void main(String []args)
	{
		System.out.println("user define message");
		try
		{
			throw new Exception();
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
	}
}
