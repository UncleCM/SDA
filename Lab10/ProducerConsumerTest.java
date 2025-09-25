class BoundedBuffer {
    private static final int BUFFER_SIZE = 5;
    private int count; // number of items in the buffer
    private int in;   // points to the next free position in the buffer
    private int out;  // points to the next full position in the buffer
    private Object[] buffer;
    
    public BoundedBuffer() {
        // buffer is initially empty
        count = 0;
        in = 0;
        out = 0;
        buffer = new Object[BUFFER_SIZE];
    }
    
    //producer calls this method
    public synchronized void insert(Object item) {
        while (count == BUFFER_SIZE) {
            try {
                wait();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                return;
            }
        }
        
        buffer[in] = item;
        in = (in + 1) % BUFFER_SIZE;
        count++;
        
        System.out.println("Producer Entered " + item + " Buffer Size = " + count);
        
        notifyAll();
    }
    
    // consumer calls this method
    public synchronized Object remove() {
        while (count == 0) {
            try {
                wait();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                return null;
            }
        }
        
        Object item = buffer[out];
        buffer[out] = null;
        out = (out + 1) % BUFFER_SIZE;
        count--;
        
        if (count == 0) {
            System.out.println("Consumer Consumed " + item + " Buffer EMPTY");
        } else {
            System.out.println("Consumer Consumed " + item + " Buffer Size = " + count);
        }
        
        notifyAll();
        
        return item;
    }
}

class Producer extends Thread {
    private BoundedBuffer buffer;
    
    public Producer(BoundedBuffer buffer) {
        this.buffer = buffer;
    }
    
    @Override
    public void run() {
        for (int i = 0; i <= 19; i++) {
            buffer.insert(i);
            
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                break;
            }
        }
    }
}

class Consumer extends Thread {
    private BoundedBuffer buffer;
    
    public Consumer(BoundedBuffer buffer) {
        this.buffer = buffer;
    }
    
    @Override
    public void run() {
        for (int i = 0; i < 20; i++) {
            buffer.remove();
            
            try {
                Thread.sleep(75);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                break;
            }
        }
    }
}

public class ProducerConsumerTest {
    public static void main(String[] args) {
        BoundedBuffer buffer = new BoundedBuffer();
        
        Producer producer = new Producer(buffer);
        Consumer consumer = new Consumer(buffer);
        
        producer.start();
        consumer.start();
        
        try {
            producer.join();
            consumer.join();
        } catch (InterruptedException e) {
            System.err.println("Main thread interrupted");
        }
    }
}