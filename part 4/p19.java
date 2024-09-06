import java.util.*;
class Rectangle
{
	int a,b;
	Rectangle(int a,int b)
	{
		this.a=a;
		this.b=b;
	}
	void area()
	{
	int area=a*b;
	System.out.println("Area of Rectangle is "+area);
	}
	void perimeter()
	{
	int perimeter=2*(a+b);
	System.out.println("Perimeter of Rectangle is "+perimeter);
	}
}
class Square extends Rectangle
{
	int s;
	Square(int s)
	{
		super(s,s);
	}
	
	void area()
	{
	int area=a*b;
	System.out.println("Area of Square is "+area);
	}
	void perimeter()
	{
	int perimeter=4*a;
	System.out.println("Perimeter of Square is "+perimeter);
	}
}

class p19
{
	public static void main(String []args)
	{
		 Scanner sc = new Scanner(System.in);
        System.out.println("Enter the side of the square:");
        int side = sc.nextInt();
        System.out.println("Enter the length of the rectangle:");
        int length = sc.nextInt();
        System.out.println("Enter the breadth of the rectangle:");
        int breadth = sc.nextInt();
        
        Rectangle[] shapes = new Rectangle[2];
        shapes[0] = new Rectangle(length, breadth);
        shapes[1] = new Square(side);

        for (Rectangle shape : shapes) {
            shape.area();
            shape.perimeter();
	}
}
}
