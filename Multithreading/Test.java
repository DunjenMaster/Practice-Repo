package Multithreading;


//class MyThread extends Thread{
//    public void run(){
//        int i = 1;
//        while (true){
//            System.out.println(i + " - Hello");
//            i++;
//        }
//    }
//}

public class Test extends Thread {

    /**
     * The run method is executed when the thread is started. 
     * It enters an infinite loop, printing a message to the console 
     * with an incrementing counter starting from 1.
     * 
     * Note: This method runs indefinitely and does not include 
     * any termination condition, which may lead to high CPU usage.
     */
    public void run(){
        int i = 1;
        while (true){
            System.out.println(i + " - Hello");
            i++;
        }
    }

    /**
     * The main method serves as the entry point for the program execution.
     * It demonstrates the use of multithreading by creating and starting a thread.
     * Additionally, it runs an infinite loop that prints a counter followed by " - World".
     *
     * Note:
     * - The commented-out code suggests an alternative thread implementation using `MyThread`.
     * - The current implementation creates an instance of `Test` and starts it as a thread.
     * - The infinite loop continuously increments and prints the counter.
     *
     * @param args Command-line arguments passed to the program (not used in this implementation).
     */
    public static void main(String[] args) {
        //MyThread t = new MyThread();
        //t.start();
        Test t = new Test();
        t.start();
        int i =1;
        while (true){
            System.out.println(i + " - World");
            i++;
        }
    }
}
