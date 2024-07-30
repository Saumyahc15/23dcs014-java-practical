import java.util.Scanner;

class Area {
     double length;
     double breadth;

     Area(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }

     double returnArea() {
        return length * breadth;
    }
}

 class AreaTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter length of rectangle:");
        double length = scanner.nextDouble();
        System.out.println("Enter breadth of rectangle:");
        double breadth = scanner.nextDouble();

        Area area = new Area(length, breadth);

        System.out.println("Area of rectangle: " + area.returnArea());
    }
}
