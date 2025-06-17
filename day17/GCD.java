public class GCD {

    // Recursive function to find GCD
    public static int gcd(int a, int b) {
        // Base case: when b becomes 0, GCD is a
        if (b == 0) {
            return a;
        }

        // Recursive call
        return gcd(b, a % b);
    }

    public static void main(String[] args) {
        int a = 24;
        int b = 18;

        int result = gcd(a, b);
        System.out.println("\nGCD of " + a + " and " + b + " is: " + result);
    }
}
