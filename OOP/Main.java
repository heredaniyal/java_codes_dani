package OOP;

class Student {
    String name;
    Student(String name) {
        this.name = name;
    }
}

public class Main {
    static void changeReference(Student s) {
        s = new Student("New Student"); // This does NOT affect the original object
    }
    public static void main(String[] args) {
        Student s1 = new Student("John");
        changeReference(s1);
        System.out.println("Student name: " + s1.name);
    }
}