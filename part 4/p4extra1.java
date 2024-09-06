//Example of single inheritance
import java.util.*;
class Parent
{
	int a,b;
	void add(int a,int b)
	{
		int c=a+b;
		System.out.println("Addition of the numbers is "+c);
	}
}
class Child extends Parent
{
	int x,y;
	void multiply(int x,int y)
	{
		int z=x*y;
		System.out.println("Multiplication of the numbers is "+z);
	}
}

class p4extra1
{
public static void main(String []args)
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter first number:");
int n1=sc.nextInt();
System.out.println("Enter second number:");
int n2=sc.nextInt();

Parent P=new Parent();
Child C=new Child();
P.add(n1,n2);
C.multiply(n1,n2);
}
}
