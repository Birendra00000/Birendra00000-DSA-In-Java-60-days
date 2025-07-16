import java.util.ArrayList;

public class ArrayList1 {
    public static void main(String[] args) {
        // Use Java's built-in ArrayList, not your class name
        ArrayList<String> fruits = new ArrayList<>();

        // Add items to the ArrayList
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Mango");

        // Print the ArrayList
        System.out.println("Fruits: " + fruits);

        // Access an item
        System.out.println("First fruit: " + fruits.get(0)); // Apple

        // Remove an item
        fruits.remove("Banana");

        // Print updated list
        System.out.println("After removing Banana: " + fruits);

        // Size of the list
        System.out.println("Size: " + fruits.size());
    }
}
