package Multithreading.Thread;


class MyThread3 extends Thread
{
    /**
     * Constructor for the MyThread class.
     * This constructor initializes a thread with a specified name and sets its priority
     * to the normal priority level.
     *
     * @param name The name of the thread.
     */
    public MyThread3(String name)
    {
        super(name);
        setPriority(Thread.NORM_PRIORITY); // Because MAX_PRIORITY is a static method that is why it is being called with the class name like Thread.Max_PRIORITY
    }
}



public class ThreadMethodsConstructors2
{
    /**
     * The main method demonstrates the creation and usage of a custom thread.
     * It showcases various thread methods such as getting the thread ID, name,
     * priority, state, and checking if the thread is alive.
     *
     * @param args Command-line arguments (not used in this example).
     * @throws Exception If any exception occurs during thread execution.
     */
    public static void main (String[] args) throws Exception
    {
        MyThread3 t = new MyThread3("My Name 2");
        //t.start();
        System.out.println("ID " + t.threadId());
        System.out.println("Name " + t.getName());
        System.out.println("Priority " + t.getPriority());
        t.start();
        System.out.println("State " + t.getState());
        System.out.println("Alive " + t.isAlive());

        //System.out.println("Thread Name: " + t.getName());
    }
}
