class Student {

    // Data members
    String name;
    int age;
    int marks;

    // Constructor 1: No arguments
    Student() {
        name = "Unknown";
        age = 0;
        marks = 0;
    }

    // Constructor 2: One argument
    Student(String name) {
        this.name = name;
        age = 0;
        marks = 0;
    }

    // Constructor 3: Two arguments
    Student(String name, int age) {
        this.name = name;
        this.age = age;
        marks = 0;
    }

    // Constructor 4: Three arguments
    Student(String name, int age, int marks) {
        this.name = name;
        this.age = age;
        this.marks = marks;
    }

    // Method to display student details
    void display() {
        System.out.println("Name  : " + name);
        System.out.println("Age   : " + age);
        System.out.println("Marks : " + marks);
        System.out.println("--------------------");
    }
}


