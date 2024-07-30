import java.lang.*;
import java.util.Scanner;
class prac1fibonacci
{  
public static void main(String args[])  
{    
int n;
 int n1=0,n2=1,n3,i; 
System.out.println("Enter the number of days you exercise(in a week):");
Scanner sc=new Scanner(System.in);
n=sc.nextInt();
   
 System.out.print(n1+" "+n2);//printing 0 and 1    
    
 for(i=2;i<n;++i)  
 { 
  n3=n1+n2;    
  System.out.print(" "+n3);    
  n1=n2;    
  n2=n3;    
 }    
}
}  
