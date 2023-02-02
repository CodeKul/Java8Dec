package collectionframework;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListDemo {
    public static void main(String[] args) {
        LinkedList<String> fruits=new LinkedList<>();
        fruits.add("apple");
        fruits.add("banana");
        fruits.add("pear");
        fruits.addFirst("strawberry");
        fruits.addLast("watermelon");
        System.out.println(fruits);
//        System.out.println( fruits.peek());
//        System.out.println( fruits.peekFirst());
//        System.out.println( fruits.peekLast());
//        System.out.println(fruits);
//        System.out.println( fruits.poll());
//        System.out.println(fruits);
//        System.out.println( fruits.pop());
//        System.out.println(fruits);
        System.out.println("acsending order");
        Collections.sort(fruits);
        System.out.println(fruits.contains("watermelon"));
        System.out.println("reverse traversing of list");

        Iterator iteratordes= fruits.descendingIterator();
        while (iteratordes.hasNext()){
            System.out.print(iteratordes.next()+" ");
        }
        System.out.println();
        System.out.println("linear traversing of list");
        Iterator iteratorasc= fruits.iterator();
        while (iteratorasc.hasNext()){
            System.out.print(iteratorasc.next()+" ");
        }


    }

}
