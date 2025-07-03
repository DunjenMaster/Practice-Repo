/**
 * This program demonstrates the use of synchronization in Java to ensure thread safety
 * when multiple threads access shared resources. It simulates an ATM system where
 * multiple customers can check their balance and withdraw money concurrently.
 * 
 * Classes:
 * - ATM: Represents the ATM machine with synchronized methods for checking balance
 *   and withdrawing money to ensure thread safety.
 * - customer: Represents a customer using the ATM. Each customer is a thread that
 *   performs operations on the ATM.
 * - SyncATMPro: The main class that initializes the ATM and customer threads.
 * 
 * Key Features:
 * - Synchronized methods in the ATM class ensure that only one thread can access
 *   the checkBalance or withdraw methods at a time, preventing race conditions.
 * - Simulated delays using Thread.sleep to mimic real-world ATM operations.
 * 
 * Usage:
 * - The main method creates an instance of the ATM and two customer threads.
 * - Each customer thread performs balance checking and withdrawal operations on the ATM.
 * - The synchronized keyword ensures that the operations are executed in a thread-safe manner.
 */
package Multithreading.Synchronisation;



class ATM1 {
    synchronized public void checkBalance(String name)
    {
        System.out.print(name + " is checking balance. ");
        try {
            Thread.sleep(1000); // Simulate time taken to check balance
        } catch (Exception e) {
            System.out.println("Balance");
        }
    }

    synchronized public void withdraw(String name, int amount)
    {
        System.out.print(name + " withdrawing ");
        try{
            Thread.sleep(1000);
        }catch (Exception e)
        {}
        System.out.println(amount);
    }
} 

class customer extends Thread {
    ATM1 atm;
    String name;
    int amount;

    customer(String n, ATM1 a, int amt){
        name = n;
        atm = a;
        amount = amt;
    }

    public void useATM()
    {
        atm.checkBalance(name);
        atm.withdraw(name, amount);
    }

    public void run(){
        useATM();
    }
}

public class SyncATMPro {
    public static void main(String[] args)
    {
        ATM1 atm = new ATM1();
        customer c1 = new customer ("Captain America", atm, 5000);
        customer c2 = new customer ("Iron Man" , atm, 10000);
        c1.start();
        c2.start();
    }

}
