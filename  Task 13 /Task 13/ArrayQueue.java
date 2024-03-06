public class ArrayQueue {
    private int[] queueArray;
    private int front; // Index of the front element
    private int rear; // Index of the rear element
    private int size; // Current size of the queue
    private int capacity; // Maximum capacity of the queue

    // Constructor to initialize the queue with a given capacity
    public ArrayQueue(int capacity) {
        this.capacity = capacity;
        queueArray = new int[capacity];
        front = 0;
        rear = -1;
        size = 0;
    }

    // Method to add an element to the rear of the queue
    public void enqueue(int item) {
        if (isFull()) {
            System.out.println("Queue is full. Cannot enqueue " + item);
            return;
        }
        rear = (rear + 1) % capacity;
        queueArray[rear] = item;
        size++;
    }

    // Method to remove and return the element from the front of the queue
    public int dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is empty. Cannot dequeue.");
            return -1;
        }
        int removedItem = queueArray[front];
        front = (front + 1) % capacity;
        size--;
        return removedItem;
    }

    // Method to get the front element of the queue without removing it
    public int peek() {
        if (isEmpty()) {
            System.out.println("Queue is empty. No element to peek.");
            return -1;
        }
        return queueArray[front];
    }

    // Method to check if the queue is empty
    public boolean isEmpty() {
        return size == 0;
    }

    // Method to check if the queue is full
    public boolean isFull() {
        return size == capacity;
    }

    // Method to get the size of the queue
    public int size() {
        return size;
    }

    public static void main(String[] args) {
        ArrayQueue queue = new ArrayQueue(5);

        // Enqueue elements
        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        queue.enqueue(40);
        queue.enqueue(50);

        // Dequeue elements
        System.out.println("Dequeued element: " + queue.dequeue());
        System.out.println("Dequeued element: " + queue.dequeue());

        // Peek element
        System.out.println("Front element: " + queue.peek());

        // Check size
        System.out.println("Size of queue: " + queue.size());
    }
}
