import java.util.LinkedList;

public class LinkedListExample {
    public static void main(String[] args) {
        // Create a LinkedList of Strings
        LinkedList<String> fruits = new LinkedList<>();

        // Add elements to the LinkedList
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Mango");

        // Print the LinkedList
        System.out.println("Fruits: " + fruits);

        // Add an element at the beginning
        fruits.addFirst("Orange");

        // Add an element at the end
        fruits.addLast("Pineapple");

        // Remove an element
        fruits.remove("Banana");

        // Print the LinkedList again
        System.out.println("Updated Fruits: " + fruits);

        // Access elements
        System.out.println("First fruit: " + fruits.getFirst());
        System.out.println("Last fruit: " + fruits.getLast());
    }
}
