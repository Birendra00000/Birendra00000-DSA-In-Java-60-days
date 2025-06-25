public class PermutationString {

    public static void generatePermutations(String str) {
        permute(str.toCharArray(), 0);
    }

    private static void permute(char[] chars, int index) {
        if (index == chars.length - 1) {
            System.out.println(String.valueOf(chars));
            return;
        }

        for (int i = index; i < chars.length; i++) {
            swap(chars, i, index);  
            permute(chars, index + 1); 
            swap(chars, i, index);  
        }
    }

    private static void swap(char[] chars, int i, int j) {
        char temp = chars[i];
        chars[i] = chars[j];
        chars[j] = temp;
    }

    public static void main(String[] args) {
        String str = "abc";
        System.out.println("\nPermutations of " + str + ":");
        generatePermutations(str);
    }
}
