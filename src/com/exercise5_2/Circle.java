package com.exercise5_2;

public class Circle {
    private double radius; 
    private String color;  

  
    public Circle() {
        radius = 1.0;
        color = "red";
    }
    
    public Circle(double radius) {
        this.radius = radius;
        color = "red";
    }

   
    public double getRadius() {
        return radius;
    }

  
    public String getColor() {
        return color;
    }

    
    public double getArea() {
        return Math.PI * radius * radius; 
    }

    
    @Override
    public String toString() {
        return "Circle: radius=" + radius + ", color=" + color;
    }
}
