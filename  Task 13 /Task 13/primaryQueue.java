import java.util.LinkedList;
import java.util.Queue;

public class PrimaryQueueExample {
    public static void main(String[] args) {
        // Creating a queue using LinkedList
        Queue<Integer> queue = new LinkedList<>();

        // Adding elements to the queue
        queue.offer(10);
        queue.offer(20);
        queue.offer(30);

        // Displaying the elements of the queue
        System.out.println("Queue elements:");
        for (Integer element : queue) {
            System.out.println(element);
        }

        // Retrieving and removing the head of the queue
        int removedElement = queue.poll();
        System.out.println("\nRemoved element from the queue: " + removedElement);

        // Displaying the elements of the queue after removing the head
        System.out.println("Queue elements after poll:");
        for (Integer element : queue) {
            System.out.println(element);
        }

        // Retrieving but not removing the head of the queue
        int peekedElement = queue.peek();
        System.out.println("\nPeeked element from the queue: " + peekedElement);

        // Displaying the elements of the queue after peeking
        System.out.println("Queue elements after peek:");
        for (Integer element : queue) {
            System.out.println(element);
        }

        // Checking if a specific element exists in the queue
        int searchElement = 20;
        if (queue.contains(searchElement)) {
            System.out.println("\n" + searchElement + " is present in the queue.");
        } else {
            System.out.println("\n" + searchElement + " is not present in the queue.");
        }

        // Removing all elements from the queue
        queue.clear();

        // Checking if the queue is empty
        if (queue.isEmpty()) {
            System.out.println("\nThe queue is empty.");
        } else {
            System.out.println("\nThe queue is not empty.");
        }
    }
}
