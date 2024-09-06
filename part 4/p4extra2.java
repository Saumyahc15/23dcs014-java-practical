//Example of multilevel inheritance
import java.util.*;
class Grandparent
{
	void print()
	{
		System.out.println("I am a Grandparent.");
	}
}

class Parent extends Grandparent
{
    void put()
	{
		System.out.println("I am a Parent.");
	}	
}

class Child extends Parent
{
    void printout()
	{
		System.out.println("I am a Child.");
	}	
}

class p4extra2
{
	public static void main(String []args)
	{
	Child C=new Child();
	C.print();
	C.put();
	C.printout();
    }
}
