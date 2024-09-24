package com.exercise4_2;

public class Test {
    public static void main(String[] args) {
        // Create a Student object
        Student student = new Student("Alice", "123 Main St", "Computer Science", 3);
        System.out.println(student);

        // Create a Staff object
        Staff staff = new Staff("Bob", "456 Elm St", "Professor", 75000);
        System.out.println(staff);
    }
}

