import java.util.*;

public class GeneratePowerSet {

    public static void generateSubsets(String input) {
        List<String> result = new ArrayList<>();
        helper(input, 0, "", result);
        
        // Print all subsets
        for (String subset : result) {
            System.out.println("\"" + subset + "\"");
        }
    }

    // Recursive helper function
    private static void helper(String s, int index, String current, List<String> result) {
        if (index == s.length()) {
            result.add(current);
            return;
        }

        // Include the current character
        helper(s, index + 1, current + s.charAt(index), result);

        // Exclude the current character
        helper(s, index + 1, current, result);
    }

    public static void main(String[] args) {
        String input = "abc";
        System.out.println("\n All subsets of \"" + input + "\":");
        generateSubsets(input);
    }
}
