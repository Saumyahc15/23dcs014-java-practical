import java.util.Scanner;

class SumThread extends Thread {
    private int start;
    private int end;
    private int result;

    public SumThread(int start, int end) {
        this.start = start;
        this.end = end;
    }

    public void run() {
        result = 0;
        for (int i = start; i <= end; i++) {
            result += i;
        }
    }

    public int getResult() {
        return result;
    }
}

public class p33 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the value of N: ");
        int n = s.nextInt();
        System.out.print("Enter the number of threads: ");
        int Threads = s.nextInt();

        int Size = n / Threads;
        SumThread[] threads = new SumThread[Threads];

        for (int i = 0; i < Threads; i++) {
            int start = i * Size + 1;
            int end = (i == Threads - 1) ? n : (i + 1) * Size;
            threads[i] = new SumThread(start, end);
            threads[i].start();
        }

        int sum = 0;
        for (int i = 0; i < Threads; i++) {
            try {
                threads[i].join();
                int threadResult = threads[i].getResult();
                System.out.println("Thread " + (i + 1) + " value: " + threadResult);
                sum += threadResult;
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.println("The sum of the numbers from 1 to " + n + " is: " + sum);
    }
}
