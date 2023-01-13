package strings;

import java.util.Scanner;

public class CheckVowels {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Input a string: ");
        String input=sc.nextLine();

        System.out.println(test(input)?"String contains only vowels":
                "String contains letters other than vowels");

    }

    private static boolean test(String input) {
        String vowels="aeiou";
        String lcase=input.toLowerCase();//aieee

        for(int i=0;i<lcase.length();i++){
            if(vowels.indexOf(lcase.charAt(i))== -1){
                return false;
            }
        }
        return true;
    }
}
