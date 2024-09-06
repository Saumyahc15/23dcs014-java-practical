interface MyInterface
{
	void AbstractMethod();
	default void DefaultMethod()
	{
		System.out.println("This is default method in interface!!");
	}
}

class MyClass implements MyInterface
{
	public void AbstractMethod()
	{
	System.out.println("This is implementation of abstract method!!");	
	}
	public void DefaultMethod()
	{
	System.out.println("This is implementation of default method!!");	
	}
}

/*class NewClass implements MyInterface
{
	public void AbstractMethod()
	{
		System.out.println("This is implementation of abstract method in New Class!!");	
	}
	
}*/

public class extra1
{
	public static void main(String []args)
	{
		MyClass myclass=new MyClass();
		myclass.AbstractMethod();
		myclass.DefaultMethod();
		MyInterface A=new MyClass();
		A.DefaultMethod();
		//NewClass newclass=new NewClass();
		//newclass.DefaultMethod();
	}
}
