package Multithreading.Runnable;

class MyThread5 extends Thread
{
    /**
     * Constructs a new thread with the specified name.
     *
     * @param name the name of the thread
     */
    public MyThread5(String name)
    {
        super(name);
    }

    public void run()
    {
        int count = 1;
        while(true)
        {
            System.out.println(count++);
            try
            {
                Thread.sleep(1000);
            }   
            catch(InterruptedException e)
            {
                //System.out.println(e);
                System.out.println("Thread interrupted: " + e.getMessage());
            }
        
            }
            
        }
}

/**
 * The SleepMethod class demonstrates the creation and execution of a custom thread.
 * It initializes and starts a thread using the MyThread class.
 * 
 * <p>
 * This example is part of a multithreading practice project and showcases
 * basic thread operations.
 * </p>
 * 
 * Usage:
 * <pre>
 *     MyThread t = new MyThread("My Thread 1");
 *     t.start();
 * </pre>
 * 
 * Note: Ensure that the MyThread class is properly defined and implements
 * the required functionality for thread execution.
 */
public class SleepMethod 
{   
    /**
     * The main method serves as the entry point for the program.
     * It creates and starts a new thread using the MyThread class, 
     * then immediately interrupts the thread.
     *
     * @param args Command-line arguments passed to the program (not used).
     * @throws Exception If an exception occurs during thread execution.
     */
    public static void main(String[] args) throws Exception
    {
        MyThread5 t = new MyThread5("My Thread 1");
        t.start();
        t.interrupt();
    }
}
