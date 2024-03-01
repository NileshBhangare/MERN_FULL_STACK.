
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Creating an ArrayList
        ArrayList<Integer> arrayList = new ArrayList<>();

        // Adding elements to the ArrayList
        arrayList.add(10);
        arrayList.add(20);
        arrayList.add(30);
        arrayList.add(40);

        // Accessing elements in the ArrayList
        System.out.println(arrayList.get(0));  // Output: 10

        // Adding elements at specific index
        arrayList.add(1, 15);  // Inserts 15 at index 1

        // Removing elements
        arrayList.remove(2);  // Removes the element at index 2

        // Iterating through the ArrayList
        for (Integer element : arrayList) {
            System.out.println(element);
        }
    }
}
