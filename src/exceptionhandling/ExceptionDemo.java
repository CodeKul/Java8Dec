package exceptionhandling;

import java.util.Scanner;

public class ExceptionDemo {
    public static void main(String[] args) {

        System.out.println("enter value of i and j:");
        Scanner sc=new Scanner(System.in);

        String str=null;

        try {
            int i,j;
            i=sc.nextInt();
            j=sc.nextInt();
        }catch (Exception e)
        {
            System.out.println(e);
        }
        try {
            System.out.println(str.length());
        }
        catch (NullPointerException e)
        {
            System.out.println(e);
        }
        try {
            int k = 20/10;
            System.out.println(k);
        }
        catch (ArithmeticException e)
        {
            System.out.println(e);
        }

        System.out.println("hi");
        System.out.println("hi");
        System.out.println("hi");
        System.out.println("hi");
    }
}
