package strings;

import java.util.Arrays;
import java.util.Scanner;

public class StringMethods {
    public static void main(String[] args) {
//        String str1="welcome to \njava";
//        System.out.println(str1);
        String str2="Pune is metrocity";
        System.out.println(str2);
        System.out.println("reverse string is:");


        String array[]=str2.split(" ");
        System.out.println(Arrays.toString(array));


        for(String s:array){
            for(int i=s.length()-1;i>=0;i--)
            {
                System.out.print(s.charAt(i));

            }
            System.out.print(" ");
        }






//        Scanner sc=new Scanner(System.in);
//        String str4=sc.nextLine();
//        System.out.println(str4);

//        String str4="React";
//        System.out.println(str1.substring(0));
//        System.out.println(str1);
//
//        System.out.println(str1.toUpperCase());
//        System.out.println(str1.toLowerCase());
//        System.out.println(str1.replace("av","abc"));
//        System.out.println(str1.startsWith("w"));
//        System.out.println(str1.endsWith("a"));
//        System.out.println(str1.equals(str2));
//        System.out.println(str1.equalsIgnoreCase(str2));
//        System.out.println(str1.indexOf("t"));
//        System.out.println(str1.charAt(8));
//        System.out.println(str1.trim());
//        System.out.println(str1.replace("    "," ").trim());


    }
}
