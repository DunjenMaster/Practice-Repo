package Multithreading;

/**
 * The MyThread class extends the Thread class and overrides the run method.
 * It continuously prints an incrementing count to the console in an infinite loop.
 * 
 * Note:
 * - This thread runs indefinitely unless explicitly stopped or interrupted.
 * - Use caution when running this thread as it may consume significant CPU resources.
 */
class MyThread1 extends Thread {
    public void run()
    {
        int count = 1;
        while(count <= 100){
            System.out.println(count++);
        } 
    }
}

public class DaemonJoinYield 
{
    /**
     * The main method demonstrates the use of a daemon thread in Java.
     * It creates an instance of the `MyThread` class, sets it as a daemon thread,
     * and starts it. The main thread then sleeps for 100 milliseconds.
     * 
     * Key points:
     * - A daemon thread runs in the background and does not prevent the JVM from exiting
     *   once all user threads have finished execution.
     * - The `setDaemon(true)` method marks the thread as a daemon thread.
     * - The `Thread.sleep(100)` call pauses the main thread for 100 milliseconds,
     *   allowing the daemon thread to execute during this time.
     * 
     * Note: The `try-catch` block is used to handle any potential interruptions
     * during the sleep period.
     */
    public static void main(String[] args)
    {
        MyThread1 t = new MyThread1();
        t.setDaemon(true);
        t.start();

        try {
            Thread.sleep(100); // Main thread sleeps for 1 second
        } catch (Exception e) {}
    }
}
