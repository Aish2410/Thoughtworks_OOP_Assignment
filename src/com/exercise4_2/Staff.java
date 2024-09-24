package com.exercise4_2;


public class Staff extends Person {
    private String title; 
    private double salary; 

    
    public Staff() {
        super(); 
        this.title = "Unknown";
        this.salary = 0.0;
    }

    
    public Staff(String name, String address, String title, double salary) {
        super(name, address); 
        this.title = title;
        this.salary = salary;
    }

   
    public String getTitle() {
        return title;
    }

    
    public double getSalary() {
        return salary;
    }

   
    @Override
    public String toString() {
        return "Staff: " + super.toString() + ", title=" + title + ", salary=" + salary;
    }
}

