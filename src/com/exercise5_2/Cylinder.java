package com.exercise5_2;

public class Cylinder {
    private Circle base; 
    private double height; 

    
    public Cylinder() {
        base = new Circle(); 
        height = 1.0;
    }

   
    public Cylinder(double height) {
        base = new Circle(); 
        this.height = height;
    }

   
    public Cylinder(double radius, double height) {
        base = new Circle(radius); 
        this.height = height;
    }

    
    public double getHeight() {
        return height;
    }

   
    public double getRadius() {
        return base.getRadius();
    }

  
    public double getVolume() {
        return base.getArea() * height; 
    }

   
    public double getArea() {
        return (2 * Math.PI * getRadius() * height) + (2 * base.getArea());
    }

    
    @Override
    public String toString() {
        return "Cylinder: base=" + base.toString() + ", height=" + height;
    }
}
