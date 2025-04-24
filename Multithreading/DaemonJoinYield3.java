package Multithreading;


class MyThread extends Thread 
{
    /**
     * The run method is the entry point for the thread's execution.
     * It continuously prints an incrementing count followed by the string "MyThread".
     * This method runs indefinitely in a while loop.
     * Note: Ensure proper termination conditions or thread management to avoid infinite execution.
     */
    public void run()
    {
        int count = 1;
        while(true)
        {
            System.out.println(count++ + "MyThread");
        }
    }
}

/**
 * The DaemonJoinYield3 class demonstrates the use of the `Thread.yield()` method
 * in a multithreading context. It creates a custom thread and starts it, while
 * the main thread continuously prints a counter value.
 *
 * Key Features:
 * - A custom thread (`MyThread`) is created and started.
 * - The main thread enters an infinite loop, printing a counter value and calling
 *   `Thread.yield()` to hint the scheduler to give other threads a chance to execute.
 *
 * Note:
 * - The `Thread.yield()` method is a hint to the thread scheduler that the current
 *   thread is willing to yield its current use of a processor. However, it does not
 *   guarantee that other threads will be scheduled immediately.
 * - This program may run indefinitely unless interrupted, as the main thread does
 *   not have a termination condition.
 *
 * Usage:
 * - This class is intended for educational purposes to demonstrate thread behavior
 *   with `Thread.yield()`.
 *
 * @throws Exception if the thread execution is interrupted.
 */
public class DaemonJoinYield3 
{
    public static void main(String[] args) throws Exception
    {
        MyThread t= new MyThread();
        t.start();

        int count = 1;
        while(true)
        {
            System.out.println(count++ + "Main-Thread");
            Thread.yield();
        }
    }
}
