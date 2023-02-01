package collectionframework;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListMethods {
    public static void main(String[] args) {
        ArrayList<Integer> list1=new ArrayList<>();
        ArrayList<String> list3=new ArrayList<>();
        list1.add(11);
        list1.add(12);
        list1.add(13);
        list1.add(14);
        list1.add(13);
        list1.add(3,15);

        ArrayList<Integer> list2=new ArrayList<>();
        list2.add(10);
        list2.add(20);
        list2.add(30);
        list2.add(40);
        list2.add(50);

        System.out.println(list1);
        System.out.println(list1.size());

//        list1.remove(4);
//        System.out.println(list1);
//        System.out.println(list1.size());

//        System.out.println(list1.get(2));
//        System.out.println(list1.lastIndexOf(13));
//        System.out.println(list1.addAll(list2));
//        System.out.println(list1.removeAll(list2));
//        System.out.println(list1);
//        System.out.println(list1.hashCode());
        System.out.println(list1.contains(90));
        Collections.sort(list1);
        System.out.println(list1);
        System.out.println(list2);
        list1.set(2,70);
        System.out.println(list1);


    }
}

