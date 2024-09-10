import java.util.Scanner;

class Even extends Thread {
    private int n;

    public Even(int n) {
        this.n = n;
    }

    public void run() {
        
            int square = n * n;
            System.out.println("Square of " + n + "= " + square);
        
    }
}

class Odd extends Thread {
    private int n;

    public Odd(int n) {
        this.n = n;
    }

    public void run() {
        
            int cube = n * n * n;
            System.out.println("Cube of " + n + "= " + cube);
        
    }
}

public class p34 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        for (int i = 1; i <= 10; i++) {
            
            System.out.println("number is: " + i);
            if (i % 2 == 0) {
                Even e2 = new Even(i);
                e2.start();
            } else {
                Odd o3 = new Odd(i);
                o3.start();
            }
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
