/**
 * Demonstrates the use of synchronization in multithreading using the `synchronized` keyword.
 * 
 * <p>This program contains the following components:
 * 
 * <ul>
 *   <li><b>MyData</b>: A shared resource class with a synchronized method `display` to ensure
 *       thread-safe access to the resource.</li>
 *   <li><b>MyThread1</b> and <b>MyThread2</b>: Two threads that operate on the shared resource
 *       `MyData` and invoke the `display` method with different strings.</li>
 *   <li><b>WithMonitor</b>: The main class that initializes the shared resource and starts the threads.</li>
 * </ul>
 * 
 * <p>The `synchronized` keyword ensures that only one thread can execute the `display` method
 * at a time, preventing race conditions and ensuring proper synchronization.
 * 
 * <p>Key Features:
 * <ul>
 *   <li>Thread-safe access to shared resource using synchronization.</li>
 *   <li>Demonstrates the use of `Thread.sleep` to simulate a delay in execution.</li>
 *   <li>Illustrates how multiple threads interact with a shared resource.</li>
 * </ul>
 * 
 * <p>Expected Output:
 * The output will display the strings "Hello World" and "Welcome to Java" character by character,
 * but the order of execution will be synchronized to avoid interleaving of characters from both strings.
 */
package Multithreading.Synchronisation;

class MyData 
{
    synchronized void display(String str)
    {
        //synchronized(this) 
        //{
            for(int i= 0 ; i<str.length(); i++)
            {
                System.out.print(str.charAt(i));
                try{Thread.sleep(100);
                }catch(Exception e){}
            }
        //}
    }
}

class MyThread1 extends Thread
{   
    MyData d;
    public MyThread1(MyData dat)
    {
        d = dat;
    }

    @Override
    public void run()
    {
        d.display("Hello World");
    }

}

class MyThread2 extends Thread
{
    MyData data;
    MyThread2 (MyData dat){
        data = dat;
    }

    public void run(){
        data.display("Welcome to Java");
    }
}
public class WithMonitor {
    public static void main(String[] args)
    {
        MyData data = new MyData();
        MyThread1 t1 = new MyThread1(data);
        MyThread2 t2 = new MyThread2(data);
        t1.start();
        t2.start();

    }

}
