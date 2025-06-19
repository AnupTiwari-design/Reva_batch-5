class Student {
    int id;
    String name;
    static String college = "ABC College"; // shared by all students

    Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    void display() {
        System.out.println(id + " " + name + " " + college);
    }
}

Q: Create a class Calculator with overloaded methods add():
	•	add(int a, int b)
	•	add(double a, double b)
	•	add(int a, int b, int c)

Call each of them with appropriate inputs and print the results.