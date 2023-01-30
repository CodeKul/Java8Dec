package multithreading;

import java.util.Scanner;

class Account{
    int bal;

    public Account(int amt){
        this.bal=amt;
    }

    public Boolean inSufficientBalance(int wamt) {
        if (bal > wamt){
            return true;
        }
        else {
            return false;
        }
    }
    public void withdraw(int amnt){
        bal=bal-amnt;
        System.out.println("balance is:"+bal);
    }

}

class Customer implements Runnable{

    Account account;
    String name;
    public Customer(Account account1,String name1){
        this.account=account1;
        this.name=name1;
    }

    @Override
    public void run() {
        Scanner sc=new Scanner(System.in);
        int amount;
    synchronized (account){
        System.out.println(Thread.currentThread().getName()+"enter amount to be withdraw:");
        amount=sc.nextInt();
        account.inSufficientBalance(amount);
        account.withdraw(amount);}
   }
}

public class SynchronizedDemo1 {
    public static void main(String[] args) {

        Account account=new Account(1000);
        Customer c1=new Customer(account,"Customer1");
        Customer c2=new Customer(account,"Customer2");
        Thread t1=new Thread(c1);
        Thread t2=new Thread(c2);
        t1.setName("Customer1");
        t2.setName("Customer2");

        t1.start();
        t2.start();
    }
}
