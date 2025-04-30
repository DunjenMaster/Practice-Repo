package Multithreading.Synchronisation;



class ATM {
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
    ATM atm;
    String name;
    int amount;

    customer(String n, ATM a, int amt){
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
        ATM atm = new ATM();
        customer c1 = new customer ("Captain America", atm, 5000);
        customer c2 = new customer ("Iron Man" , atm, 10000);
        c1.start();
        c2.start();
    }

}
