// Base class
class Person {
    String name;
    int age;

    // Constructor
    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Method to display person details
    void displayPerson() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

// Student class using composition (has-a Person)
class Student {
    Person p;
    int rollNumber;

    // Constructor
    Student(String name, int age, int rollNumber) {
        this.p = new Person(name, age); // Initialize the Person object
        this.rollNumber = rollNumber;
    }

    // Method to display student details
    void displayStudent() {
        p.displayPerson(); // Use the method from Person
        System.out.println("Roll Number: " + rollNumber);
    }
}

// Main class
public class Main {
    public static void main(String[] args) {
        Student s1 = new Student("Anup", 21, 101);
        s1.displayStudent();
    }
}