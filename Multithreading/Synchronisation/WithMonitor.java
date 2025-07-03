package Multithreading.Synchronisation;

class MyData2 {
    synchronized void display(String str) {
        for (int i = 0; i < str.length(); i++) {
            System.out.print(str.charAt(i));
            try { Thread.sleep(100); } catch (Exception e) {}
        }
    }
}

class MyThread1 extends Thread {
    MyData2 data;
    public MyThread1(MyData2 data) {
        this.data = data;
    }
    @Override
    public void run() {
        data.display("Hello World");
    }
}

class MyThread2 extends Thread {
    MyData2 data;
    public MyThread2(MyData2 data) {
        this.data = data;
    }
    @Override
    public void run() {
        data.display("Welcome to Java");
    }
}

public class WithMonitor {
    public static void main(String[] args) {
        MyData2 data = new MyData2();
        MyThread1 t1 = new MyThread1(data);
        MyThread2 t2 = new MyThread2(data);
        t1.start();
        t2.start();
    }
}