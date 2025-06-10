
public class BitManipulation {

    public static void main(String[] args) {
        int x = 5;  // Binary: 0101
        int y = 3;  // Binary: 0011

        // 1. AND
        System.out.println("x & y = " + (x & y)); // 0101 & 0011 = 0001 = 1

        // 2. OR
        System.out.println("x | y = " + (x | y)); // 0101 | 0011 = 0111 = 7

        // 3. XOR
        System.out.println("x ^ y = " + (x ^ y)); // 0101 ^ 0011 = 0110 = 6

        // 4. NOT
        System.out.println("~x = " + (~x)); // ~0101 = 1010 (2's complement = -6)

        // 5. Left shift
        System.out.println("x << 1 = " + (x << 1)); // 0101 << 1 = 1010 = 10

        // 6. Right shift
        System.out.println("x >> 1 = " + (x >> 1)); // 0101 >> 1 = 0010 = 2

        // 7. Check if number is even or odd
        System.out.println("Is x odd? " + ((x & 1) == 1));

        // 8. Count set bits
        System.out.println("Set bits in x: " + Integer.bitCount(x));

        // 9. Check if a number is power of 2
        int num = 8;
        boolean isPowerOfTwo = (num > 0) && ((num & (num - 1)) == 0);
        System.out.println("Is " + num + " a power of 2? " + isPowerOfTwo);

        // 10. Toggle a bit at position i (0-based)
        int n = 5; // 0101
        int i = 1;
        int toggled = n ^ (1 << i); // Toggle bit at position 1
        System.out.println("Toggle bit at position 1: " + toggled); // 0101 ^ 0010 = 0111 = 7

        // 11. Set a bit at position i
        int setBit = n | (1 << i);
        System.out.println("Set bit at position 1: " + setBit); // Already 1, so stays 5

        // 12. Clear a bit at position i
        int clearBit = n & ~(1 << i);
        System.out.println("Clear bit at position 1: " + clearBit); // 0101 & ~(0010) = 0101 & 1101 = 0101 = 5
    }
}
