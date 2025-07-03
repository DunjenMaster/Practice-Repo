/**
 * This program demonstrates the use of synchronization in Java to handle
 * concurrent access to a shared resource (ATM) by multiple threads (Customers).
 * 
 * <p>The program consists of the following components:
 * 
 * <ul>
 *   <li><b>ATM:</b> A class representing an ATM with methods to withdraw money
 *       and display the current balance. The methods are synchronized to ensure
 *       thread safety.</li>
 *   <li><b>Customer:</b> A class extending Thread that represents a customer
 *       attempting to withdraw money from the ATM. Each customer thread interacts
 *       with the ATM by displaying the balance, attempting a withdrawal, and
 *       displaying the balance again.</li>
 *   <li><b>SyncATMPro2:</b> The main class that initializes the ATM with an
 *       initial balance and creates multiple customer threads to simulate
 *       concurrent access to the ATM.</li>
 * </ul>
 * 
 * <p>Key Features:
 * <ul>
 *   <li>The `withdraw` and `displayBalance` methods in the ATM class are
 *       synchronized to prevent race conditions and ensure consistent behavior
 *       when accessed by multiple threads.</li>
 *   <li>Each customer thread performs a sequence of operations on the ATM:
 *       checking the balance, attempting a withdrawal, and checking the balance
 *       again.</li>
 *   <li>The program demonstrates how synchronization ensures that only one
 *       thread can access the critical section of the ATM at a time.</li>
 * </ul>
 * 
 * <p>Usage:
 * <pre>
 * ATM atm = new ATM(1000); // Create an ATM with an initial balance of 1000
 * Customer customer1 = new Customer(atm, "Alice", 300);
 * Customer customer2 = new Customer(atm, "Bob", 500);
 * Customer customer3 = new Customer(atm, "Charlie", 400);
 * 
 * customer1.start();
 * customer2.start();
 * customer3.start();
 * </pre>
 * 
 * <p>Expected Output:
 * 
 *   <li>The output will show each customer's interaction with the ATM, including
 *       balance checks and withdrawal attempts.</li>
 *   <li>The synchronized methods ensure that the balance is updated correctly
 *       and no two threads access the critical section simultaneously.</li>
 * </ul>
 */
package Multithreading.Synchronisation;
class ATM2 {
    private int balance;

    public ATM2(int initialBalance) {
        this.balance = initialBalance;
    }

    public synchronized void withdraw(String customerName, int amount) {
        System.out.println(customerName + " is trying to withdraw " + amount);
        if (amount <= balance) {
            System.out.println("Processing withdrawal for " + customerName);
            balance -= amount;
            System.out.println(customerName + " successfully withdrew " + amount);
        } else {
            System.out.println("Insufficient balance for " + customerName);
        }
        System.out.println("Remaining balance: " + balance);
    }

    public synchronized void displayBalance(String customerName) {
        System.out.println(customerName + ", your current balance is: " + balance);
    }
}

class Customer extends Thread {
    private ATM2 atm;
    private String name;
    private int withdrawAmount;

    public Customer(ATM2 atm, String name, int withdrawAmount) {
        this.atm = atm;
        this.name = name;
        this.withdrawAmount = withdrawAmount;
    }

    @Override
    public void run() {
        atm.displayBalance(name);
        atm.withdraw(name, withdrawAmount);
        atm.displayBalance(name);
    }
}

public class SyncATMPro2 {
    public static void main(String[] args) {
        ATM2 atm = new ATM2(1000); // Initial balance in the ATM

        Customer customer1 = new Customer(atm, "Alice", 300);
        Customer customer2 = new Customer(atm, "Bob", 500);
        Customer customer3 = new Customer(atm, "Charlie", 400);

        customer1.start();
        customer2.start();
        customer3.start();
    }
}
