class Shape
{
	void print()
	{
		System.out.println("This is shape.");
	}
}

class Rectangle extends Shape
{
	void p()
	{
	System.out.println("This is rectangular shape.");	
	}
}

class Circle extends Shape
{
    void r()
	{
		System.out.println("This is circular shape.");
	}	
}

class Square extends Rectangle
{
	void i()
	{
		System.out.println("Square is a Rectangle.");
	}
}

class p20
{
	public static void main(String []args)
	{
		Square S=new Square();
		S.print();
		S.p();
	}
}
