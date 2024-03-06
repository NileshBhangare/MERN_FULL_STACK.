import java.util.ArrayDeque;
import java.util.Deque;

public class DequeExample {
    public static void main(String[] args) {
        // Creating a dequeue using ArrayDeque
        Deque<String> deque = new ArrayDeque<>();

        // Adding elements to the front of the dequeue
        deque.addFirst("Front1");
        deque.addFirst("Front2");

        // Adding elements to the rear of the dequeue
        deque.addLast("Rear1");
        deque.addLast("Rear2");

        // Displaying the elements of the dequeue
        System.out.println("Deque elements:");
        System.out.println(deque);

        // Retrieving and removing the front element of the dequeue
        String frontElement = deque.removeFirst();
        System.out.println("\nRemoved front element from the dequeue: " + frontElement);

        // Retrieving and removing the rear element of the dequeue
        String rearElement = deque.removeLast();
        System.out.println("Removed rear element from the dequeue: " + rearElement);

        // Displaying the elements of the dequeue after removal
        System.out.println("Deque elements after removal:");
        System.out.println(deque);

        // Retrieving but not removing the front element of the dequeue
        String peekFront = deque.peekFirst();
        System.out.println("\nPeeked front element from the dequeue: " + peekFront);

        // Retrieving but not removing the rear element of the dequeue
        String peekRear = deque.peekLast();
        System.out.println("Peeked rear element from the dequeue: " + peekRear);

        // Displaying the elements of the dequeue after peeking
        System.out.println("Deque elements after peeking:");
        System.out.println(deque);

        // Checking if a specific element exists in the dequeue
        String searchElement = "Rear1";
        if (deque.contains(searchElement)) {
            System.out.println("\n" + searchElement + " is present in the dequeue.");
        } else {
            System.out.println("\n" + searchElement + " is not present in the dequeue.");
        }

        // Removing all elements from the dequeue
        deque.clear();

        // Checking if the dequeue is empty
        if (deque.isEmpty()) {
            System.out.println("\nThe dequeue is empty.");
        } else {
            System.out.println("\nThe dequeue is not empty.");
        }
    }
}
