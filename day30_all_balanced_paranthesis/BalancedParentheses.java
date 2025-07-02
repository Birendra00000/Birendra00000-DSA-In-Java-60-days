public class BalancedParentheses {

    // Function to generate all combinations of balanced parentheses
    public static void generateParentheses(int open, int close, String str) {
        // Base case: when no open or close brackets are left
        if (open == 0 && close == 0) {
            System.out.println(str);
            return;
        }

        // If we have open brackets left, we can add '('
        if (open > 0) {
            generateParentheses(open - 1, close, str + "(");
        }

        // If close > open, we can add ')'
        if (close > open) {
            generateParentheses(open, close - 1, str + ")");
        }
    }

    public static void main(String[] args) {
        int n = 3; // number of pairs of parentheses

        System.out.println("Balanced Parentheses for n = " + n + ":");
        generateParentheses(n, n, "");
    }
}
