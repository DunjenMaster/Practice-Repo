package Multithreading.Synchronisation;
class ATM {
    private int balance;

    public ATM(int initialBalance) {
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
    private ATM atm;
    private String name;
    private int withdrawAmount;

    public Customer(ATM atm, String name, int withdrawAmount) {
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
        ATM atm = new ATM(1000); // Initial balance in the ATM

        Customer customer1 = new Customer(atm, "Alice", 300);
        Customer customer2 = new Customer(atm, "Bob", 500);
        Customer customer3 = new Customer(atm, "Charlie", 400);

        customer1.start();
        customer2.start();
        customer3.start();
    }
}
