#include <iostream>
using namespace std;

// Base class
class Person {
public:
    string name;
    int age;

    // Constructor
    Person(string n, int a) {
        name = n;
        age = a;
    }

    // Display method
    void displayPerson() {
        cout << "Name: " << name << endl;
        cout << "Age: " << age << endl;
    }
};

// Derived class
class Student : public Person {
public:
    int rollNumber;

    // Constructor
    Student(string n, int a, int r) : Person(n, a) {
        rollNumber = r;
    }

    // Display method
    void displayStudent() {
        displayPerson(); // Call base class method
        cout << "Roll Number: " << rollNumber << endl;
    }
};

// Main function
int main() {
    Student s1("Anup", 21, 101);
    s1.displayStudent();

    return 0;
}