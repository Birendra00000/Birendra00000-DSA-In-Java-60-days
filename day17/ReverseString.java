public class ReverseString {

    // Recursive function to reverse a string
    public static String reverse(String str) {
        // Base case: if the string is empty or has 1 character, return it
        if (str.isEmpty()) {
            return str;
        }

        // Reverse the rest of the string and add the first character to the end
        return reverse(str.substring(1)) + str.charAt(0);
    }

    public static void main(String[] args) {
        String original = "Nepal";
        String reversed = reverse(original);

        System.out.println("Original String: " + original);
        System.out.println("Reversed String: " + reversed);
    }
}
