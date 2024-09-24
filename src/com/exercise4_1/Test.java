package com.exercise4_1;


public class Test {
    public static void main(String[] args) {
        
        Cylinder c1 = new Cylinder();
        System.out.println(c1);

        
        Cylinder c2 = new Cylinder(10.0);
        System.out.println(c2);

       
        Cylinder c3 = new Cylinder(2.0, 10.0);
        System.out.println(c3);

        
        System.out.println("Cylinder 1 volume: " + c1.getVolume());
        System.out.println("Cylinder 2 volume: " + c2.getVolume());
        System.out.println("Cylinder 3 volume: " + c3.getVolume());
    }
}
