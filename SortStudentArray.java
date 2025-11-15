import java.util.*;

class Student {
    int roll;
    String name;

    Student(int roll, String name) {
        this.roll = roll;
        this.name = name;
    }

    void display() {
        System.out.println(roll + " - " + name);
    }
}

public class SortStudentArray{
    public static void main(String[] args) {
        Student[] students = {
            new Student(3, "Ravi"),
            new Student(1, "Anita"),
            new Student(2, "Kiran")
        };

        // Sort by roll number
        Arrays.sort(students, (a, b) -> a.roll - b.roll);

        System.out.println("Sorted Student List:");
        for (Student s : students) {
            s.display();
        }
    }
}
