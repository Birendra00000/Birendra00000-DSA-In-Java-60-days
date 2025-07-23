import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Student {
    private int id;
    private String name;
    private double gpa;

    // Constructor
    public Student(int id, String name, double gpa) {
        this.id = id;
        this.name = name;
        this.gpa = gpa;
    }

    // Getters
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getGpa() {
        return gpa;
    }

    @Override
    public String toString() {
        return "Student { ID: " + id + ", Name: " + name + ", GPA: " + gpa + " }";
    }
}

public class Main {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();

        // Adding students
        students.add(new Student(101, "Bibek", 3.8));
        students.add(new Student(102, "Sarita", 3.6));
        students.add(new Student(103, "Manish", 3.9));
        students.add(new Student(104, "Aayush", 2.5));

        // Display all students
        System.out.println("All Students:");
        for (Student s : students) {
            System.out.println(s);
        }

        // Find student with GPA above 3.7
        System.out.println("\nHigh GPA Students:");
        students.stream()
                .filter(s -> s.getGpa() > 3.7)
                .forEach(System.out::println);

        // Remove student by ID (e.g., ID = 104)
        int idToRemove = 104;
        students.removeIf(s -> s.getId() == idToRemove);

        System.out.println("\nAfter removing student with ID " + idToRemove + ":");
        students.forEach(System.out::println);

        // Search student by name
        String searchName = "Sarita";
        System.out.println("\nSearching for student with name '" + searchName + "':");
        boolean found = false;
        for (Student s : students) {
            if (s.getName().equalsIgnoreCase(searchName)) {
                System.out.println("Found: " + s);
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Student not found.");
        }
    }
}
