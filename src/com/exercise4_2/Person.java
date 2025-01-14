package com.exercise4_2;


public class Person {
    private String name; 
    private String address; 

    
    public Person() {
        this.name = "Unknown";
        this.address = "Unknown";
    }

   
    public Person(String name, String address) {
        this.name = name;
        this.address = address;
    }

   
    public String getName() {
        return name;
    }

   
    public String getAddress() {
        return address;
    }

    
    @Override
    public String toString() {
        return "Person: name=" + name + ", address=" + address;
    }
}
