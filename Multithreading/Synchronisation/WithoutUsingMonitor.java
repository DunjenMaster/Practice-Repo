package Multithreading.Synchronisation;

// Renamed to avoid duplicate with WithMonitor.java
class MyDataWithoutMonitor {
    void display(String str) {
        for (int i = 0; i < str.length(); i++) {
            System.out.println(str.charAt(i));
        }
    }
}

// Renamed to avoid duplicate
class MyThread1WithoutMonitor extends Thread {
    MyDataWithoutMonitor data;
    MyThread1WithoutMonitor(MyDataWithoutMonitor data) {
        this.data = data;
    }

    @Override
    public void run() {
        data.display("Hello World");
    }
}

// Renamed to avoid duplicate
class MyThread2WithoutMonitor extends Thread {
    MyDataWithoutMonitor data;
    MyThread2WithoutMonitor(MyDataWithoutMonitor data) {
        this.data = data;
    }

    @Override
    public void run() {
        data.display("Welcome to Java");
    }
}

public class WithoutUsingMonitor {
    public static void main(String[] args) {
        MyDataWithoutMonitor data = new MyDataWithoutMonitor();
        MyThread1WithoutMonitor t1 = new MyThread1WithoutMonitor(data);
        MyThread2WithoutMonitor t2 = new MyThread2WithoutMonitor(data);
        t1.start();
        t2.start();
    }
}