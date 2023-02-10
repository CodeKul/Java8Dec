package collectionframework;

import java.util.PriorityQueue;

public class QueueDemo {
    public static void main(String[] args) {
        PriorityQueue<Integer> queue = new PriorityQueue<>();
//        Queue<Integer> queue1=new PriorityQueue<>();
//        queue.add(23);
        queue.add(33);
        queue.add(43);
        queue.add(23);
        queue.add(23);

        System.out.println(queue);
        System.out.println(queue.contains(23));
        System.out.println(queue.remove());
        System.out.println(queue);
        System.out.println(queue.size());
        System.out.println(queue.contains(23));
        System.out.println(queue.peek());
        System.out.println(queue);
        System.out.println(queue.poll());
        System.out.println(queue);
        System.out.println(queue.offer(55));
        System.out.println(queue);
    }}