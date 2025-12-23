package Multithreading.Runnable;

/**
 * Statement of Purpose (SOP)
 *
 * 1. Purpose of the Code:
 *    - This code demonstrates the use of the `Runnable` interface to create a multithreaded application in Java.
 *    - It runs two threads concurrently: one prints "Hello" with an incrementing counter, and the other prints "World" with an incrementing counter.
 *
 * 2. Key Functionalities:
 *    - Implements the `Runnable` interface to define the behavior of a thread.
 *    - Creates and starts a thread using the `Thread` class.
 *    - Demonstrates concurrent execution of two threads.
 *
 * 3. Code Flow:
 *    - The `run` method is overridden to define the logic for the thread, which prints "Hello" with an incrementing counter in an infinite loop.
 *    - In the `main` method:
 *        - An instance of `Test2` is created and passed to a `Thread` object.
 *        - The thread is started using the `start` method.
 *        - The main thread concurrently prints "World" with an incrementing counter in an infinite loop.
 *
 * 4. Libraries and Tools Used:
 *    - Core Java (`java.lang.Thread` and `java.lang.Runnable`).
 *
 * 5. Example Use Case:
 *    - This code can be used to understand and demonstrate the basics of multithreading in Java.
 */

public class Test2 implements Runnable {
    @Override
    public void run() {
        int i = 1;
        while (true) {
            System.out.println(i + " - Hello");
            i++;
        }
    }

    public static void main(String[] args) {
        Test2 t = new Test2();
        Thread thread = new Thread(t);
        thread.start();
        int i = 1;
        while (true) {
            System.out.println(i + " - World");
            i++;
        }
    }
}


