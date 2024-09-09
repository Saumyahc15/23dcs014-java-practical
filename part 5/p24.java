import java.util.Scanner;
class p24
{
public static void main(String []args)
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter first number:");
int x=sc.nextInt();
System.out.println("Enter second number:");
int y=sc.nextInt();
if(y==0)
{
try
{
int result=x/y;
}
catch(Exception e)
{
	System.out.println("Exception is "+e.toString());
}
}
else
{
    int result=x/y;
	System.out.println("Result is "+result);
}
}
}
