package collectionframework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LaptopIml {
    public static void main(String[] args) {
        List<Laptop> laptops=new ArrayList<>();
        Laptop l1=new Laptop(201,"Dell",80000L);
        Laptop l2=new Laptop(304,"Lenovo",76000L);
        Laptop l3=new Laptop(201,"Asus",60000L);

        laptops.add(l1);
        laptops.add(l2);
        laptops.add(l3);

       laptops.forEach(System.out::println);

        System.out.println();

        Collections.sort(laptops);
        laptops.forEach(System.out::println);
    }
}
