package controlflowstatements;

import java.util.Scanner;

public class IfElseDemo {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter no: ");
        int i=sc.nextInt();


        if(i>=0 && i<=10) {
            System.out.println("no is between 0 and 10");

            if (i >= 11 && i <= 20)
                System.out.println("no is between 11 and 20");
            else if (i >= 21 && i <= 30)

                System.out.println("no is between 21 and 30");
            else if (i >= 31 && i <= 40)
                System.out.println("no is between 31 and 40");
        }
        else
        {
            if (i >= 41 && i <= 50)
                System.out.println("no is between 41 and 50");
            else if (i >= 51 && i <= 60)

                System.out.println("no is between 21 and 30");
            else if (i >= 61 && i <= 70)
                System.out.println("no is between 31 and 40");
        }
            System.out.println("no is out of range");
    }
}
