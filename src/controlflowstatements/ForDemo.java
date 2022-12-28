package controlflowstatements;

import java.util.Scanner;

public class ForDemo {
    public static void main(String[] args) {
        int i;
        Scanner sc=new Scanner(System.in);
//        System.out.println("enter limit:");
//        int limit=sc.nextInt();
//        int result=0;
//
//        for(i=1;i<=limit;i++){
//            result=result+i;
//
//        }
//        System.out.println(result);


        System.out.println("enter base:");
        int base=sc.nextInt();
        System.out.println("enter power:");
        int pow=sc.nextInt();
        Long result=1L;

        for(i=pow;i>0;i--) {
            result = result * base;
//            System.out.println("pow:"+i);
        }

        System.out.println("ans:"+result);

    }
}
