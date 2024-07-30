class Parent
{
	void print()
	{
		System.out.println("This is parent class!!");
	}
}

class Child extends Parent
{
	void print1()
	{
		System.out.println("This is child class!!");
	}
}

class p17
{
	public static void main(String []args)
	{
		Parent p=new Parent();
		Child c=new Child();
		p.print();
		c.print1();
	}
}
