package controlflowstatements;

import java.util.Scanner;

public class ForDemo {
    public static void main(String[] args) {
        int i;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter limit:");
        int limit=sc.nextInt();
        int result=0;

        for(i=1;i<=limit;i++){
            result=result+i;

        }
        System.out.println(result);
    }
}
