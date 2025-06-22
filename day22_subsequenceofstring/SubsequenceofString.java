public class SubsequenceofString {

    public static void generateSubsequences(String str, int index, String current) {
        // Base Case: when we've considered all characters
        if (index == str.length()) {
            System.out.println(current);
            return;
        }

        // Include current character
        generateSubsequences(str, index + 1, current + str.charAt(index));

        // Exclude current character
        generateSubsequences(str, index + 1, current);
    }

    public static void main(String[] args) {
        String input = "abc";
        System.out.println("All subsequences of: " + input);
        generateSubsequences(input, 0, "");
    }
}
