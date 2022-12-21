package basic;

import java.util.Scanner;

public class UserInput {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter no:");
        int i=sc.nextInt();
        String j=sc.next();
        System.out.println("entered no is:"+i);
        System.out.println("entered string  is:"+j);
    }
}
