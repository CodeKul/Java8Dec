package array;

import java.util.Arrays;
import java.util.List;

public class ArrayDemo {
    public static void main(String[] args) {
        int array[]={10,20,30,40,50,60};//1st method
//        int array[]=new int[10];//2nd method
//
//        System.out.println(array.length);
//        array[0]=10;
//        array[1]=20;
//        array[2]=30;
//        array[3]=40;
//        array[4]=50;
//        System.out.println(array.length);

//        for (int i=0;i<array.length;i++){
//            System.out.println(array[i]);
//        }

        for(int i:array){ //enhanced for loop
            System.out.println(i);
        }


        List<Integer> list= Arrays.asList(10,20,30,40);
        list.forEach(p->{               //lambda expression
            System.out.println(p);
        });






    }
}
