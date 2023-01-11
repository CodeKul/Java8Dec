package strings;

import java.util.Arrays;

public class SplitDemo {
    public static void main(String[] args) {
        String str="Good morning today is 11th January 2023";
        String[] array=str.split(" ");
        System.out.println(Arrays.toString(array));
//        for(int i=0;i< array.length;i++){
//            System.out.println(array[i]);
//        }

        for(String s:array){
            System.out.println(s);
        }
        System.out.println(array[5].charAt(3));
        System.out.println(str.charAt(5));
        String str1=array[1];
        String[] array1=str1.split("");
        System.out.println(Arrays.toString(array1));

    }


}
