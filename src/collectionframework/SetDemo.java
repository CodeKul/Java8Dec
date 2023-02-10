package collectionframework;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetDemo {
    public static void main(String[] args) {
        Set<Integer> set1=new HashSet<>();
        set1.add(23);
        set1.add(33);
        set1.add(43);
        set1.add(28);
        set1.add(23);


        System.out.println(set1);

        Set<Integer> set2=new LinkedHashSet<>();
        set2.add(23);
        set2.add(33);
        set2.add(43);
        set2.add(28);
        set2.add(23);


        System.out.println(set2);

        Set<Integer> set3=new TreeSet<>();
        set3.add(23);
        set3.add(33);
        set3.add(43);
        set3.add(28);
        set3.add(23);


        System.out.println(set3);
    }
}
