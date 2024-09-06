import java.util.Scanner;

// Interface for Shape
interface Shape {
    void draw();
    default void resize(double factor) {
        System.out.println("Resizing shape by a factor of " + factor);
    }
}

// Class for Circle
class Circle implements Shape {
    private double radius;
    private String color;

    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    @Override
    public void draw() {
        System.out.println("Drawing a circle with radius " + radius + " and color " + color);
    }
}

// Class for Rectangle
class Rectangle implements Shape {
    private double length;
    private double width;
    private String color;

    public Rectangle(double length, double width, String color) {
        this.length = length;
        this.width = width;
        this.color = color;
    }

    @Override
    public void draw() {
        System.out.println("Drawing a rectangle with length " + length + ", width " + width + ", and color " + color);
    }
}

// Class for Sign
class Sign {
    private Shape shape;
    private String text;

    public Sign(Shape shape, String text) {
        this.shape = shape;
        this.text = text;
    }

    public void display() {
        shape.draw();
        System.out.println("Posting sign with text: " + text);
    }
}

public class p23 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the type of shape (1 for Circle, 2 for Rectangle): ");
        int shapeType = scanner.nextInt();

        Shape shape = null;

        if (shapeType == 1) {
            System.out.println("Enter the radius of the circle: ");
            double radius = scanner.nextDouble();
            System.out.println("Enter the color of the circle: ");
            String color = scanner.next();
            shape = new Circle(radius, color);
        } else if (shapeType == 2) {
            System.out.println("Enter the length of the rectangle: ");
            double length = scanner.nextDouble();
            System.out.println("Enter the width of the rectangle: ");
            double width = scanner.nextDouble();
            System.out.println("Enter the color of the rectangle: ");
            String color = scanner.next();
            shape = new Rectangle(length, width, color);
        }

        System.out.println("Enter the text for the sign: ");
        String text = scanner.next();

        Sign sign = new Sign(shape, text);
        sign.display();

        System.out.println("Enter the resize factor: ");
        double resizeFactor = scanner.nextDouble();
        shape.resize(resizeFactor);
    }
}
