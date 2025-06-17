
 class PrintNumbers {
    static public void printNumbers() {
        for (int i = 0; i < 1000; i++) {
            System.out.println(i);
        }
    }
}

 class Thread2 implements Runnable {

    @Override
    public void run() {
        // Print current thread ID
        System.out.println("Thread2 ThreadId: " + Thread.currentThread().getId());
        // Execute printNumbers in this thread
        PrintNumbers.printNumbers();
    }
}

public class Test {
    public static void main(String[] args) {
        // Print main thread ID
        System.out.println("Main ThreadId: " + Thread.currentThread().getId());

        // Create and start 3 threads, each running a new Thread2 instance
        for (int i = 0; i < 3; i++) {
            new Thread(new Thread2()).start();
            // Important: use start() to run the thread concurrently,
            // do not call run() directly if you want multithreading
        }

        // Main thread also calls printNumbers()
        PrintNumbers.printNumbers();
    }
}