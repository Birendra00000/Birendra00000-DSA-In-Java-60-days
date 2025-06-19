public class DecimalToBinary {

    public static void convertToBinary(int n) {
        if (n == 0) return;
        convertToBinary(n / 2);
        System.out.print(""+n % 2);
    }

    public static void main(String[] args) {
        int decimal = 13;
        if (decimal == 0) {
            System.out.print("0");
        } else {
             System.out.print("\n" + "Decimal to Into binary :");
            convertToBinary(decimal); 
        }
    }
}
