package collections.arraydeque;

import java.util.ArrayDeque;
import java.util.Queue;

public class QueueExample {

    //FIFO - KOLEJKA
    public static void main(String[] args) {

        Queue<String> queue = new ArrayDeque<>();

        //Metoda offer wrzuca element do kolejki
        queue.offer("A");
        queue.offer("B");
        queue.offer("C");
        queue.offer("D");

        //Metoda peek pobiera pierwszy element z kolejki
        System.out.println(queue.peek());
        //Metoda poll zdejmuje element z kolejki
        System.out.println(queue.poll());
        System.out.println(queue.poll());

    }

}
