import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {
    public static void main(String[] args) {
        // Creating a queue using LinkedList
        Queue<String> queue = new LinkedList<>();

        // Adding elements to the queue
        queue.offer("Apple");
        queue.offer("Banana");
        queue.offer("Orange");

        // Displaying the elements of the queue
        System.out.println("Queue elements:");
        System.out.println(queue);

        // Adding a duplicate element (allowed)
        queue.offer("Apple");

        // Displaying the elements of the queue again (duplicate added)
        System.out.println("\nAfter adding 'Apple' again, the queue contains:");
        System.out.println(queue);

        // Retrieving and removing the head of the queue
        String head = queue.poll();
        System.out.println("\nRemoved element from the queue: " + head);

        // Displaying the elements of the queue after removing the head
        System.out.println("Queue elements after poll:");
        System.out.println(queue);

        // Retrieving but not removing the head of the queue
        String peek = queue.peek();
        System.out.println("\nPeeked element from the queue: " + peek);

        // Displaying the elements of the queue after peeking
        System.out.println("Queue elements after peek:");
        System.out.println(queue);

        // Checking if a specific element exists in the queue
        String searchElement = "Banana";
        if (queue.contains(searchElement)) {
            System.out.println("\n'" + searchElement + "' is present in the queue.");
        } else {
            System.out.println("\n'" + searchElement + "' is not present in the queue.");
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
