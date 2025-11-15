// Class representing a Student
class Student {
    int id;
    String name;

    // Constructor
    Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    // Method to display student details
    void display() {
        System.out.println("ID: " + id + ", Name: " + name);
    }
}

// Main class
public class ArrayOfObjectsExample {
    public static void main(String[] args) {
        // Create an array of Student objects (size 3)
        Student[] students = new Student[3];

        // Initialize objects
        students[0] = new Student(101, "Rahul");
        students[1] = new Student(102, "Priya");
        students[2] = new Student(103, "Amit");

        // Display details of all students
        for (int i = 0; i < students.length; i++) {
            students[i].display();
        }
    }
}
