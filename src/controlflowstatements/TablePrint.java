package controlflowstatements;

import java.util.Scanner;

public class TablePrint {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num;

        char ch;

        do {

            System.out.println("enter value of num:");
            num = sc.nextInt();
            int i=1;
            while (i <= 10) {
                System.out.println(num + "*" + i + "=" + (num * i));
                i++;
            }

            System.out.println("Do u want to continue:");
            ch=sc.next().charAt(0);

        }while (ch=='y' || ch=='Y');

    }
}
