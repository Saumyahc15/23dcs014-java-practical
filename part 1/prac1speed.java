import java.lang.*;
import java.util.Scanner;
class prac1speed
{
	public static void main(String []args)
	{
	Scanner sc=new Scanner(System.in);
		System.out.println("Enter the distance(in metres):");
		float d=sc.nextFloat();
		System.out.println("Enter the time(in hour,minute and second format):");
		float h=sc.nextFloat();
		float m=sc.nextFloat();
		float s=sc.nextFloat();
		
		float time=(h*60*60)+(m*60)+s;
		System.out.println("Time in sec is:"+time);
		
		float speed=d/time;
		System.out.println("Speed in m/s is:"+speed);
		
		float h1=time/3600;
		float d1=d/1000;
		float speed1=d1/h1;
		System.out.println("Speed in km/h is:"+speed1);
	
		float d2=d/1609;
		float speed2=d2/h1;
		System.out.println("Speed in miles/h is:"+speed2);
	}
}
