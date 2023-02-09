package collectionframework;

import java.util.Iterator;
import java.util.Vector;

public class VectorDemo {
    public static void main(String[] args) {
        Vector<Integer> list1=new Vector<>();
        list1.add(12);
        list1.add(12);
        list1.add(12);
        list1.add(12);
        list1.add(12);

        System.out.println(list1);
        System.out.println(list1.size());
        System.out.println(list1.remove(4));
        list1.ensureCapacity(3);
        Iterator iterator=list1.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }


}
