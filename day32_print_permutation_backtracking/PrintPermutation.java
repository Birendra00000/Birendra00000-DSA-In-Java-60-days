public class PrintPermutation {

    public static void printPerm(String str, String perm, int idx) {
        if (str.length() == 0) {
            System.out.println(perm);
            return;
        }

        for (int i = 0; i < str.length(); i++) {
            char currentChar = str.charAt(i);
            // Remove character at index i
            String newString = str.substring(0, i) + str.substring(i + 1);
            printPerm(newString, perm + currentChar, idx + 1);
        }
    }

    public static void main(String[] args) {
        String str = "XYZ";
        printPerm(str, "", 0);
    }
}
