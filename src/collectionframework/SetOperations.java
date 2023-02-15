package collectionframework;

import java.util.HashSet;
import java.util.Set;

public class SetOperations {
    public static void main(String[] args) {
        Set<Integer> set1=new HashSet<>();
        set1.add(23);
        set1.add(22);
        set1.add(55);
        set1.add(98);
        System.out.println(set1);

        Set<Integer> set2=new HashSet<>();
        set2.add(55);
        set2.add(98);
        set2.add(99);
        System.out.println(set2);
        System.out.println(set1.contains(42));

        if(set1.containsAll(set2)){
            System.out.println(set1);
            System.out.println("set2 is subset of set1");
        }

        set1.addAll(set2);
        System.out.println("union:"+set1);

        set1.retainAll(set2);
        System.out.println("intersection:"+set1);

        set1.removeAll(set2);
        System.out.println(set1);




    }
}
