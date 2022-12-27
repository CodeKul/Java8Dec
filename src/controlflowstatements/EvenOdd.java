package controlflowstatements;

import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter limit:");
        int limit=sc.nextInt();
        int i=0;
        System.out.println("Do u print even or odd: even:0, Odd:1");
        int evenOdd=sc.nextInt();


        while (i<limit) {
            if (evenOdd == 1) {
                i++;

                if ((i % 2) == 1) {
                    System.out.println(i);
                }
                i++;
            } else {
                if ((i % 2) == 0) {
                    System.out.println(i);
                }
                i++;
            }

        }}
}
