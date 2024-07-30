import java.util.Scanner;

public class Complex {
    private double real;
    private double imaginary;

    public Complex(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    public Complex add(Complex other) {
        double realPart = this.real + other.real;
        double imaginaryPart = this.imaginary + other.imaginary;
        return new Complex(realPart, imaginaryPart);
    }

    public Complex subtract(Complex other) {
        double realPart = this.real - other.real;
        double imaginaryPart = this.imaginary - other.imaginary;
        return new Complex(realPart, imaginaryPart);
    }

    public Complex multiply(Complex other) {
        double realPart = this.real * other.real - this.imaginary * other.imaginary;
        double imaginaryPart = this.real * other.imaginary + this.imaginary * other.real;
        return new Complex(realPart, imaginaryPart);
    }

    public static Complex readComplexNumber() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the real part: ");
        double real = scanner.nextDouble();
        System.out.print("Enter the imaginary part: ");
        double imaginary = scanner.nextDouble();
        return new Complex(real, imaginary);
    }

    public void print() {
        System.out.println(real + " + " + imaginary + "i");
    }

    public static void main(String[] args) {
        Complex num1 = readComplexNumber();
        Complex num2 = readComplexNumber();

        Complex sum = num1.add(num2);
        sum.print();

        Complex diff = num1.subtract(num2);
        diff.print();

        Complex prod = num1.multiply(num2);
        prod.print();
    }
}
