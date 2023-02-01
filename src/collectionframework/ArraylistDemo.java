package collectionframework;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArraylistDemo {
    public static void main(String[] args) {
       ArrayList<Integer> list1=new ArrayList<>();
       list1.add(10);
       list1.add(20);
       list1.add(30);
       list1.add(40);
       list1.add(60);
       list1.add(4,50);

        System.out.println(list1.size());
        System.out.println(list1);

        ArrayList<Integer> list2=new ArrayList<>(Arrays.asList(11,22,33,44));
        ArrayList<Integer> list3=new ArrayList<>(List.of(111,222,333,444));

        ArrayList<Integer> list4 =new ArrayList<>(){{
            add(110);
            add(111);
            add(112);
            add(113);
        }};
        System.out.println(list2);
        System.out.println(list3);
        System.out.println(list4);



//        for (int i=0;i<list1.size();i++)
//        {
//            System.out.println((list1.get(i)));
//        }
//        System.out.println("for each loop");
//
//        list1.forEach(a->{
//            System.out.println(a);
//        });
//
//        System.out.println("enhanced for loop");
//        for(Integer i:list1){
//            System.out.println(i);
//        }
    }
}
