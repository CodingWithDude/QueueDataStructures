import java.util.LinkedList;
import java.util.Queue;

public class Main {
    // *****************************************************

    // Queue = FIFO data structure. First-In First-Out
    //		   A collection designed for holding elements prior to processing
    //		   Linear data structure

    //         enqueue = offer()
    //         dequeue = poll()

    // Where are queues useful?

    // 1. Keyboard Buffer (letters should appear on the screen in the order they're pressed)
    // 2. Printer Queue (Print jobs should be completed in order)
    // 3. Used in LinkedLists, PriorityQueues, Breadth-first search

    // *****************************************************

    public static void main(String[] args) {

        Queue<String> queue = new LinkedList<>();

        queue.offer("Karen");
        queue.offer("Chad");
        queue.offer("Steve");
        queue.offer("Herald");

        queue.poll();
        System.out.println(queue.peek());
        System.out.println(queue);
    }
}
