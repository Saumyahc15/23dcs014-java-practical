//A. By Extending the Thread Class
/*public class p32 extends Thread {
    public void run() {
        System.out.println("Hello World");
    }

    public static void main(String[] args) {
        p32 thread = new p32();
        thread.start();
    }
}*/

//B. By Implementing the Runnable Interface
public class p32 implements Runnable {
    public void run() {
        System.out.println("Hello World");
    }

    public static void main(String[] args) {
        Thread thread = new Thread(new p32());
        thread.start();
    }
}
