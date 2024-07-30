import java.lang.*;
import java.util.Scanner;
class prac1bill
{
	public static void main(String []args)
	{
	Scanner sc=new Scanner(System.in);
    System.out.println("Enter your choice(1 for motor,2 for fan,3 for tube and 4 for wires):");
	int n=sc.nextInt();
	switch(n)
	{
		case 1:
		System.out.println("Enter the price of motor:");
		float m=sc.nextFloat();
		System.out.println("Enter the quantity of motor:");
		int q=sc.nextInt();
		float p=m*q;
		float price=p+(0.08f*p);
		System.out.println("Your total charge is:"+price);
		break;
		
		case 2:
		System.out.println("Enter the price of fan:");
		float m1=sc.nextFloat();
		System.out.println("Enter the quantity of fan:");
		int q1=sc.nextInt();
		float p1=m1*q1;
		float price1=p1+(0.12f*p1);
		System.out.println("Your total charge is:"+price1);
		break;
		
		case 3:
		System.out.println("Enter the price of tube light:");
		float m2=sc.nextFloat();
		System.out.println("Enter the quantity of tube light:");
		int q2=sc.nextInt();
		float p2=m2*q2;
		float price2=p2+(0.05f*p2);
		System.out.println("Your total charge is:"+price2);
		break;
		
		case 4:
		System.out.println("Enter the price of wires:");
		float m3=sc.nextFloat();
		System.out.println("Enter the quantity of wires:");
		int q3=sc.nextInt();
		float p3=m3*q3;
		float price3=p3+(0.075f*p3);
		System.out.println("Your total charge is:"+price3);
		break;
		
		case 5:
		System.out.println("Enter the price of the product:");
		float m4=sc.nextFloat();
		System.out.println("Enter the quantity of the product:");
		int q4=sc.nextInt();
		float p4=m4*q4;
		float price4=p4+(0.03f*p4);
		System.out.println("Your total charge is:"+price4);
		break;
	}
	}
}
