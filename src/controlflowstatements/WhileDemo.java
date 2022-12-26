package controlflowstatements;

import java.util.Scanner;

public class WhileDemo {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        char ch;
        do {
            System.out.println("enter value of i");
            int i = sc.nextInt();
            while (i >= 1 && i <= 2) {
                System.out.println("value of i is: " + i);
                i++;
            }
            System.out.println("do you want to continue:");
            ch=sc.next().charAt(0);
        }while (ch=='y' || ch=='Y');

//        do{
//            System.out.println("value of i is: "+i);
//            i++;
//        }while (i>=1 && i<=2);

    }
}
