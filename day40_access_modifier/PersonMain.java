public class    PersonMain {
    public String name;
    private int age;
    protected String address;
    String gender; // default access

    public PersonMain(String name, int age, String address, String gender) {
        this.name = name;
        this.age = age;
        this.address = address;
        this.gender = gender;
    }

    public void showInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age); // private field accessed inside the class
        System.out.println("Address: " + address);
        System.out.println("Gender: " + gender);
    }
}

// Non-public class with main method
class MainApp {
    public static void main(String[] args) {
        PersonMain p = new PersonMain("Hari", 22, "Pokhara", "Male");

        System.out.println("From MainApp:");
        System.out.println("Public: " + p.name);           // ✅ public
        // System.out.println("Private: " + p.age);        // ❌ private - not accessible
        System.out.println("Protected: " + p.address);     // ✅ protected (same package)
        System.out.println("Default: " + p.gender);        // ✅ default (same package)

        p.showInfo(); // ✅ all values displayed using method
    }
}
