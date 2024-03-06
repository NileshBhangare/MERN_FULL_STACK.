import java.util.*;
// Common Methods
// add()
// addAll()
// clear()
// contains()
// containsAll()
// equals()
// isEmpty()
// remove()
// removeAll()
// retainAll()
// size()
// toArray()

import java.util.*;

public class SetExample {
    public static void main(String[] args) {
        // HashSet Example
        Set<String> hashSet = new HashSet<>();
        hashSet.add("Apple");
        hashSet.add("Banana");
        hashSet.add("Orange");
        hashSet.add("Apple"); // Duplicate element
        System.out.println("HashSet: " + hashSet);

        // LinkedHashSet Example
        Set<String> linkedHashSet = new LinkedHashSet<>();
        linkedHashSet.add("Apple");
        linkedHashSet.add("Banana");
        linkedHashSet.add("Orange");
        linkedHashSet.add("Apple"); // Duplicate element
        System.out.println("LinkedHashSet: " + linkedHashSet);

        // TreeSet Example (SortedSet)
        SortedSet<String> treeSet = new TreeSet<>();
        treeSet.add("Apple");
        treeSet.add("Banana");
        treeSet.add("Orange");
        treeSet.add("Apple"); // Duplicate element
        System.out.println("TreeSet: " + treeSet);

        // NavigableSet Example
        NavigableSet<Integer> navigableSet = new TreeSet<>();
        navigableSet.add(3);
        navigableSet.add(1);
        navigableSet.add(4);
        navigableSet.add(2);
        System.out.println("NavigableSet: " + navigableSet);

        // Checking NavigableSet Operations
        System.out.println("Ceiling(3): " + navigableSet.ceiling(3));
        System.out.println("Floor(3): " + navigableSet.floor(3));
        System.out.println("Higher(3): " + navigableSet.higher(3));
        System.out.println("Lower(3): " + navigableSet.lower(3));

        // Removing elements from NavigableSet
        navigableSet.remove(3);
        System.out.println("After removing 3: " + navigableSet);
    }
}
