import java.lang.*;
import java.util.Scanner;
class prac1expense
{
	public static void main(String []args)
	{
	float []a=new float[100];
	int n,i;
	float sum=0;
	Scanner sc=new Scanner(System.in);
    System.out.println("Enter the number of elements in the array:");
	n=sc.nextInt();
	for(i=0;i<n;i++)
	{
	 System.out.println("Array element["+(i+1)+"]");
	 a[i]=sc.nextFloat();
	}
	 
	 for(i=0;i<n;i++)
	 {
	 sum=sum+a[i];
	 }
	 System.out.println("Your total expense is:"+sum);
	}
}
