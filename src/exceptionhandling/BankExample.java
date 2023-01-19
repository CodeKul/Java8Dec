package exceptionhandling;

import java.util.Scanner;

public class BankExample {
    int amount=1000;
    public void depositAmount(int amt){
        amount=amount+amt;
        System.out.println("Amount Deposited Successfully");
    }
    public void withdrawAmount(int amt){
        if(amt>amount){
            throw new RuntimeException();
        }
        amount=amount-amt;
        System.out.println("Amount Withdrawn Successfully");
    }
    public void checkBalance(){
        System.out.println("Your Available Balance is: "+amount);
    }

    public static void main(String[] args) {
        int amnt;
        char ch;
        System.out.println("Welcome to SBI Bank\n1.Deposit\n2.Withdraw\n3.Balance Enquiry\n4.Exit");
        System.out.println("Enter Your Choice");
        BankExample bank=new BankExample();
        Scanner sc=new Scanner(System.in);
        int choice=sc.nextInt();
       do{
            switch (choice){
                case 1:
                    System.out.println("Enter Amount u want to deposit: ");
                    amnt=sc.nextInt();
                    bank.depositAmount(amnt);
                    bank.checkBalance();
                    break;
                case 2:
                    System.out.println("Enter Amount u want to withdraw: ");
                    amnt=sc.nextInt();
                    try{
                        bank.withdrawAmount(amnt);
                        bank.checkBalance();
                    }catch (Exception e)
                    {
                        System.out.println(e);
                    }
                    break;
                case 3:
                    bank.checkBalance();
                    break;
                case 4:
                    break;
            }
           System.out.println("do you want to continue:");
           ch=sc.next().charAt(0);
           System.out.println("Welcome to SBI Bank\n1.Deposit\n2.Withdraw\n3.Balance Enquiry\n4.Exit");
           System.out.println("Enter Your Choice");
           choice=sc.nextInt();
        }while  (ch=='y' || ch=='Y');
    }
}
