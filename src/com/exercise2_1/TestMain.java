package com.exercise2_1;


public class TestMain {
    public static void main(String[] args) {
        
        Author a1 = new Author("Tan Ah Teck", "ahteck@nowhere.com", 'm');
        System.out.println(a1);  

        a1.setEmail("ahteck@somewhere.com");
       
        System.out.println("name is: " + a1.getName());
        System.out.println("email is: " + a1.getEmail());

        
        Book b1 = new Book("Java for dummies", a1, 8.8, 88);
        System.out.println(b1); 

        b1.setPrice(9.9);
        b1.setQty(99);
        
        System.out.println("name is: " + b1.getName());
        System.out.println("price is: " + b1.getPrice());
        System.out.println("qty is: " + b1.getQty());
        System.out.println("author's name: " + b1.getAuthor().getName());  
        System.out.println("author's email: " + b1.getAuthor().getEmail());      }
}