package collectionframework;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class HashMapDemo {
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<>();
        map.put(1, "abc");
        map.put(2, "xyz");
        map.put(3, "hgf");
        map.put(4, "ert");

//        HashMap<Integer, String> map1 = new HashMap<>();
//        map1.put(1, "abc");
//        map1.put(2, "xyz");
//        map1.put(3, "pqr");
//        map1.put(4, "hash");
//        System.out.println(map.size());
//
//        System.out.println(map.get(3));
//        System.out.println(map);
//        System.out.println(map1);
//        map.remove(4);
//        System.out.println(map);
//        System.out.println(map.containsKey(2));
//        map.putAll(map1);
//        System.out.println(map);

        System.out.println(map.size());
        map.forEach((k,v)->{
            System.out.print("key "+k+" ");
            System.out.print("value "+v);
            System.out.println();
        });

        for(Integer key:map.keySet()){
            System.out.print(key+" ");
            System.out.print(map.get(key));
            System.out.println();
        }

        for(Map.Entry<Integer,String >entry: map.entrySet()){
            System.out.print(entry.getKey()+" ");
            System.out.print(entry.getValue());
            System.out.println();
        }

        Iterator<Map.Entry<Integer,String >> itr=map.entrySet().iterator();
        while (itr.hasNext()){
            Map.Entry<Integer,String > entry =itr.next();
            System.out.print(entry.getKey()+" ");
            System.out.print(entry.getValue());
            System.out.println();
        }
    }
}
