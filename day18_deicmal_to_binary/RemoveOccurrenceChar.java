public class RemoveOccurrenceChar{

    public static String removeChar(String str, char target) {
        if (str.isEmpty()) {
            return "";
        }

        char firstChar = str.charAt(0);
        String rest = removeChar(str.substring(1), target);

        if (firstChar == target) {
            return rest;
        } else {
            return firstChar + rest;
        }
    }

    public static void main(String[] args) {
        String input = "apple";
        char toRemove = 'p';

        String result = removeChar(input, toRemove);
        System.out.println("\nAfter removal:"+result);  // Output: ale
    }
}
