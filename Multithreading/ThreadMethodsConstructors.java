package Multithreading;


class MyRun implements Runnable
{
    /**
     * The run method is the entry point for the thread's execution.
     * This method is invoked when the thread is started and contains
     * the code that will be executed in the thread.
     * 
     * In this implementation, it prints a message to the console
     * indicating that the thread's run method has been executed.
     */
    @Override
    public void run()
    {
        System.out.println("Hello from MyRun");
    }
}

public class ThreadMethodsConstructors
{
    /**
     * The main method demonstrates the creation and usage of a thread in Java.
     * It creates a new thread with a custom name "My Name" using the Thread class
     * and a Runnable implementation (MyRun). The thread is started, and its name
     * is printed to the console using the getName() method.
     */
    public static void main(String args[])
    {
        Thread t = new Thread(new MyRun(),"My Name");  // Thread name here is "My Name".
        t.start();
        System.out.println("Thread Name: " + t.getName());
    }
}
