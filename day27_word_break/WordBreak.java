import java.util.*;

public class WordBreak {

    public static boolean wordBreak(String s, Set<String> wordDict) {
        // base case
        if (s.length() == 0) {
            return true;
        }

        // try every possible prefix
        for (int i = 1; i <= s.length(); i++) {
            String prefix = s.substring(0, i);
            String suffix = s.substring(i);

            // if prefix is in dictionary, check the rest recursively
            if (wordDict.contains(prefix) && wordBreak(suffix, wordDict)) {
                return true;
            }
        }

        // if no prefix works
        return false;
    }

    public static void main(String[] args) {
        String s = "leetcode";
        Set<String> wordDict = new HashSet<>(Arrays.asList("Hello", "World"));

        boolean canBreak = wordBreak(s, wordDict);
        System.out.println("\nCan the word be segmented? " + canBreak);
    }
}
