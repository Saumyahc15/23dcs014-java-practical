import java.util.*;
import java.lang.*;
class p2s4
{
public static void main(String []args)
{
Scanner s=new Scanner(System.in);
System.out.println("Enter your string:");
String x=s.nextLine();
int n=x.length();
System.out.println("Length of the string is:"+n);

String y=x.toUpperCase();
System.out.println("Upper case of the string is:"+y);

String z=x.toLowerCase();
System.out.println("Lower case of the string is:"+z);

String reverse = "";
for (int i = x.length() - 1; i >= 0; i--) 
{
    reverse += x.charAt(i);
}
System.out.println("Reversed string: " + reverse);

 char[] ch = x.toCharArray();
        Arrays.sort(ch);
		System.out.println("Sorted string:"+new String(ch));
}
}
