package collectionframework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorDemo {
    public static void main(String[] args) {
        Laptop1 l1=new Laptop1(402,"Dell",30000L);
        Laptop1 l2=new Laptop1(202,"Asus",40000L);
        Laptop1 l3=new Laptop1(302,"Hp",50000L);
        Laptop1 l4=new Laptop1(102,"Lenovo",50000L);


        List<Laptop1> list=new ArrayList<>();
        list.add(l1);
        list.add(l2);
        list.add(l3);
        list.add(l4);

        list.forEach(System.out::println);
        System.out.println();

        Comparator<Laptop1> comparator=new Comparator<Laptop1>() {
            @Override
            public int compare(Laptop1 o1, Laptop1 o2) {
                if(o1.code>o2.code)
                    return 1;
                else if (o1.code<o2.code)
                    return -1;
                else
                    return 0;
                }

        };

        Comparator<Laptop1> comparator1=new Comparator<Laptop1>() {
            @Override
            public int compare(Laptop1 o1, Laptop1 o2) {
                return o1.brand.compareTo(o2.brand);
            }
        };


        Collections.sort(list,comparator1.thenComparing(comparator));
        list.forEach(System.out::println);

    }
}
