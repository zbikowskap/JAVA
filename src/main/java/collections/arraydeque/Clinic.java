package collections.arraydeque;

import java.util.ArrayDeque;
import java.util.Queue;

public class Clinic {

    private Queue<String> queue = new ArrayDeque<>();

    public void registerPatient(String name) {
        queue.offer(name);
    }

    public String handlePatient() {
        return queue.poll();
    }

}
