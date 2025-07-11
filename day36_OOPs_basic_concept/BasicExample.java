public class BasicExample {
    // Fields (properties)
    String brand;
    int year;

    // Method to start the engine
    void startEngine() {
        System.out.println(brand + " engine started!");
    }

    // Method to display car info
    void displayInfo() {
        System.out.println("Brand: " + brand);
        System.out.println("Year: " + year);
    }

    // Main method to run the program
    public static void main(String[] args) {
        // Create an object of Car
        BasicExample myCar = new BasicExample();

        // Set object data
        myCar.brand = "Honda";
        myCar.year = 2022;

        // Call object methods
        myCar.startEngine();
        myCar.displayInfo();
    }
}
