/**
 * Demonstrates multithreading without using synchronization (monitor).
 * 
 * <p>This program creates two threads that share a common resource (`MyData` object)
 * and execute concurrently. The `display` method in the `MyData` class is not synchronized,
 * which may lead to inconsistent output due to thread interference.
 * 
 * <p>Classes and their responsibilities:
 * <ul>
 *   <li><b>MyData:</b> Contains a method `display` to print characters of a string one by one.</li>
 *   <li><b>MyThread1:</b> A thread that calls the `display` method with the string "Hello World".</li>
 *   <li><b>MyThread2:</b> A thread that calls the `display` method with the string "Welcome to Java".</li>
 *   <li><b>WithoutUsingMonitor:</b> The main class that initializes the shared resource (`MyData`) 
 *       and starts both threads.</li>
 * </ul>
 * 
 * <p>Note: Since the `display` method is not synchronized, the output of the program may 
 * interleave characters from both threads, demonstrating the need for synchronization 
 * in multithreaded programs when accessing shared resources.
 */
package Multithreading.Synchronisation;

class MyData 
{
    void display(String str)
    {
        for(int i= 0 ; i<str.length(); i++)
        {
            System.out.println(str.charAt(i));
        }
    }
}

class MyThread1 extends Thread
{   
    MyData d;
    MyThread1(MyData dat)
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



public class WithoutUsingMonitor {
    public static void main(String[] args)
    {
        MyData data = new MyData();
        MyThread1 t1 = new MyThread1(data);
        MyThread2 t2 = new MyThread2(data);
        t1.start();
        t2.start();

    }

}
