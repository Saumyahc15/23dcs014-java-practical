import java.util.*;
interface AdvancedArithmetic
{
public int divisor_sum(int n);
}

class MyCalculator implements AdvancedArithmetic
{
	public int divisor_sum(int n)
	{
		int i,sum=0;
		for(i=1;i<=n;i++)
		{
			if(n%i==0)
			{
				sum=sum+i;
			}
		}
		return sum;
		
	}
}


class p22
{
	public static void main(String []args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your number:");
		int x=sc.nextInt();
		MyCalculator M=new MyCalculator();
		int result=M.divisor_sum(x);
		System.out.println("Sum is "+result);
	}
}
