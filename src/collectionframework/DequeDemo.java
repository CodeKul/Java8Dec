package collectionframework;

import java.util.ArrayDeque;
import java.util.Deque;

public class DequeDemo {
    public static void main(String[] args) {
        Deque<Integer> deque=new ArrayDeque<>();
        deque.add(23);
        deque.add(43);
        deque.add(73);
        deque.add(23);

        System.out.println(deque);
        deque.addFirst(20);
        deque.addLast(90);
        System.out.println(deque);
        System.out.println(deque.getFirst());
        System.out.println(deque.getLast());
        System.out.println(deque.size());
        System.out.println(deque.contains(23));
        System.out.println(deque.contains(67));
        System.out.println(deque.element());
        System.out.println(deque.offer(45));
        System.out.println(deque);
        System.out.println(deque.isEmpty());

    }
}
