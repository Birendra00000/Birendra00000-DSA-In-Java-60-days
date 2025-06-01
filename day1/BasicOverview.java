package day1;


public class BasicOverview {

    public static void main(String[] args) {
        // 1. Print Statement
        System.out.println("Hello, Java World!");

        // 2. Variables and Data Types
        int age = 21;
        double pi = 3.14;
        char grade = 'A';
        boolean isJavaFun = true;
        String name = "Alice";

        System.out.println("Age: " + age);
        System.out.println("Value of pi: " + pi);
        System.out.println("Grade: " + grade);
        System.out.println("Is Java fun? " + isJavaFun);
        System.out.println("Name: " + name);

        // 3. Type Casting
        int a = 10;
        double b = a; // implicit casting
        int c = (int) b; // explicit casting
        System.out.println("Implicit casting (int to double): " + b);
        System.out.println("Explicit casting (double to int): " + c);

        // 4. Operators
        int x = 5, y = 2;
        System.out.println("Addition: " + (x + y));
        System.out.println("Subtraction: " + (x - y));
        System.out.println("Multiplication: " + (x * y));
        System.out.println("Division: " + (x / y));
        System.out.println("Modulus: " + (x % y));
        System.out.println("Increment x: " + (++x));
        System.out.println("Decrement y: " + (--y));

        // 5. Conditional Statements
        int number = 10;
        if (number > 0) {
            System.out.println("Number is positive.");
        } else if (number < 0) {
            System.out.println("Number is negative.");
        } else {
            System.out.println("Number is zero.");
        }

        // 6. Switch Case
        int day = 2;
        switch (day) {
            case 1:
                System.out.println("Sunday");
                break;
            case 2:
                System.out.println("Monday");
                break;
            default:
                System.out.println("Another day");
        }

        // 7. Loops

        // For Loop
        System.out.println("For Loop:");
        for (int i = 1; i <= 5; i++) {
            System.out.println("i = " + i);
        }

        // While Loop
        System.out.println("While Loop:");
        int i = 1;
        while (i <= 5) {
            System.out.println("i = " + i);
            i++;
        }

        // Do-While Loop
        System.out.println("Do-While Loop:");
        int j = 1;
        do {
            System.out.println("j = " + j);
            j++;
        } while (j <= 5);
    }
}
