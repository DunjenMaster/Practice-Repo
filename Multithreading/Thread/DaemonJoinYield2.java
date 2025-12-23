/**
 * This program demonstrates the use of daemon threads and the join method in Java.
 * 
 * Key Concepts:
 * 1. **Daemon Threads**:
 *    - Daemon threads are background threads that do not prevent the JVM from exiting.
 *    - They are typically used for tasks like garbage collection or background monitoring.
 *    - A thread can be set as a daemon thread using the `setDaemon(true)` method before starting it.
 * 
 * 2. **Join Method**:
 *    - The `join()` method is used to pause the execution of the current thread until the specified thread completes its execution.
 *    - If a thread attempts to join itself (i.e., a thread calls `join()` on itself), it will throw an `IllegalThreadStateException`.
 * 
 * Program Flow:
 * - A custom thread (`MyThread`) is created and set as a daemon thread.
 * - The main thread attempts to join itself using `mainThread.join()`.
 * - Since a thread cannot join itself, an `IllegalThreadStateException` is thrown.
 * - The exception is caught and logged to the console.
 * 
 * Note:
 * - This example highlights the importance of understanding thread behavior and the restrictions of the `join()` method.
 */
package Multithreading.Thread;

class MyThread2 extends Thread {}


public class DaemonJoinYield2 
{
    /**
     * The main method demonstrates the use of daemon threads and the join method.
     * It creates a custom thread, sets it as a daemon thread, and starts it.
     * The main thread then attempts to join itself, which will result in an exception
     * because a thread cannot join itself. The exception is caught and logged.
     *
     * Key points:
     * - Daemon threads are background threads that do not prevent the JVM from exiting.
     * - The join method is used to wait for a thread to finish execution.
     * - Attempting to join the current thread (itself) will throw an IllegalThreadStateException.
     */
    public static void main(String[] args) 
    {
        MyThread2 t = new MyThread2();
        t.setDaemon(true);
        t.start();
        Thread mainThread = Thread.currentThread();
        try{
            mainThread.join();
        }catch (Exception e){
            System.out.println("Exception: " + e);
        }
    }
}
