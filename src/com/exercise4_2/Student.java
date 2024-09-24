package com.exercise4_2;


public class Student extends Person {
    private String program; 
    private int year; 

   
    public Student() {
        super(); 
        this.program = "Unknown";
        this.year = 1;
    }

   
    public Student(String name, String address, String program, int year) {
        super(name, address); 
        this.program = program;
        this.year = year;
    }

    
    public String getProgram() {
        return program;
    }

   
    public int getYear() {
        return year;
    }

   
    @Override
    public String toString() {
        return "Student: " + super.toString() + ", program=" + program + ", year=" + year;
    }
}
