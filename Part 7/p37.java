class ProducerConsumer {

    // Shared buffer and control variables
    private final int[] buffer;
    private int size;
    private int count = 0;  // Tracks the number of items in the buffer
    private int in = 0;     // Points to the next empty position to produce
    private int out = 0;    // Points to the next filled position to consume

    public ProducerConsumer(int size) {
        this.size = size;
        buffer = new int[size];
    }

    // Producer method
    public synchronized void produce(int item) throws InterruptedException {
        while (count == size) {
            // Buffer is full, wait for consumer to consume
            wait();
        }
        
        // Simulate production delay
        Thread.sleep(500); // 500 milliseconds delay
        
        // Produce an item into the buffer
        buffer[in] = item;
        in = (in + 1) % size;
        count++;
        
        System.out.println("Produced: " + item);

        // Notify the consumer that an item has been produced
        notify();
        
        // Wait until the consumer consumes the item before producing the next one
        wait();
    }

    // Consumer method
    public synchronized void consume() throws InterruptedException {
        while (count == 0) {
            // Buffer is empty, wait for producer to produce
            wait();
        }
        
        // Simulate consumption delay
        Thread.sleep(500); // 500 milliseconds delay
        
        // Consume an item from the buffer
        int item = buffer[out];
        out = (out + 1) % size;
        count--;
        
        System.out.println("Consumed: " + item);

        // Notify the producer that an item has been consumed
        notify();
    }
}

class Producer extends Thread {
    private final ProducerConsumer sharedBuffer;

    public Producer(ProducerConsumer sharedBuffer) {
        this.sharedBuffer = sharedBuffer;
    }

    @Override
    public void run() {
        try {
            for (int i = 1; i <= 10; i++) {
                sharedBuffer.produce(i);
            }
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}

class Consumer extends Thread {
    private final ProducerConsumer sharedBuffer;

    public Consumer(ProducerConsumer sharedBuffer) {
        this.sharedBuffer = sharedBuffer;
    }

    @Override
    public void run() {
        try {
            for (int i = 1; i <= 10; i++) {
                sharedBuffer.consume();
            }
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}

public class p37 {
    public static void main(String[] args) {
        ProducerConsumer sharedBuffer = new ProducerConsumer(1); // Buffer of size 1

        Producer producer = new Producer(sharedBuffer);
        Consumer consumer = new Consumer(sharedBuffer);

        producer.start();
        consumer.start();
    }
}
