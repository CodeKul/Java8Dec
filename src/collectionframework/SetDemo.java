package collectionframework;

import java.util.*;

public class SetDemo {
    public static void main(String[] args) {
//        Set<Integer> set1=new HashSet<>();
//        set1.add(23);
//        set1.add(33);
//        set1.add(43);
//        set1.add(28);
//        set1.add(23);
//        System.out.println(set1);
//
//        Set<Integer> set2=new LinkedHashSet<>();
//        set2.add(23);
//        set2.add(33);
//        set2.add(43);
//        set2.add(28);
//        set2.add(23);
//        System.out.println(set2);
//
//        Set<Integer> set3=new TreeSet<>();
//        set3.add(23);
//        set3.add(23);
//        set3.add(53);
//        set3.add(873);
//        set3.add(2389);
//        set3.add(11);
//        System.out.println(set3);

        SortedSet<Integer> set4=new TreeSet<>();
        set4.add(34);
        set4.add(54);
        set4.add(7);
        set4.add(65);
        set4.add(334);
        set4.add(9);

        System.out.println(set4);
//        System.out.println(set4.headSet(334));
        System.out.println(set4.tailSet(34));
        System.out.println(set4.subSet(9,65));







    }
}
