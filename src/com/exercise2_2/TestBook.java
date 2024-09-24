package com.exercise2_2;

import com.exercise2_1.Author;

public class TestBook {
    public static void main(String[] args) {
       
        Author[] authors = new Author[2];
        authors[0] = new Author("Tan Ah Teck", "AhTeck@somewhere.com", 'm');
        authors[1] = new Author("Paul Tan", "Paul@somewhere.com", 'm');

        
        Book javaDummy = new Book("Java for Dummy", authors, 19.99, 99);
        System.out.println(javaDummy);  
    }
}

