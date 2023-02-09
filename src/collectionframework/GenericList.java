package collectionframework;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GenericList {
    public static void main(String[] args) {
        List<Integer> list1=new ArrayList<>();
        list1.add(10);
        list1.add(10);
        list1.add(10);
        list1.add(10);
        listed(list1);

        List<String> list2=new ArrayList<>();
        list2.add("asdas");
        list2.add("asdas");
        list2.add("asdas");
        list2.add("asdas");
        listed(list2);

        List<?> list3= Arrays.asList(12,43.4,"dsfsd");
        listed(list3);


    }
    public static void listed(List<?> list){
        list.forEach(System.out::println);
    }

}
