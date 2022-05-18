package collections.arraydeque;

import java.util.ArrayDeque;
import java.util.Deque;

public class StackExample {

    //LIFO - STOS
    public static void main(String[] args) {

        Deque<String> stack = new ArrayDeque<>();

        //Push wkłada element do stosu
        stack.push("A");
        stack.push("B");
        stack.push("C");
        stack.push("D");

        //Peek podgląda
        System.out.println(stack.peek());
        //Pop zdejmuję
        System.out.println(stack.pop());
        System.out.println(stack.pop());

    }


}
