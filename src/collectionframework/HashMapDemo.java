package collectionframework;

import java.util.HashMap;
import java.util.Map;

public class HashMapDemo {
    public static void main(String[] args) {
        HashMap<Integer,String> map=new HashMap<>();
        map.put(1,"abc");
        map.put(2,"xyz");
        map.put(3,"abc");
        map.put(4,"xyz");

        HashMap<Integer,String> map1=new HashMap<>();
        map1.put(1,"abc");
        map1.put(2,"xyz");
        map1.put(3,"pqr");
        map1.put(4,"hash");
        System.out.println(map.size());

        System.out.println(map.get(3));
        System.out.println(map);
        System.out.println(map1);
        map.remove(4);
        System.out.println(map);
        System.out.println(map.containsKey(2));
        map.putAll(map1);
        System.out.println(map);

        for (Integer e:map.keySet()) {
            System.out.println(e+" "+map.get(e));
        }
    }
}
