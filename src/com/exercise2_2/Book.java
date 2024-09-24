package com.exercise2_2;

import com.exercise2_1.Author;

public class Book {
    private String name;
    private Author[] authors; 
    private double price;
    private int qty;

    // Constructor
    public Book(String name, Author[] authors, double price) {
        this(name, authors, price, 0); 
    }

    public Book(String name, Author[] authors, double price, int qty) {
        this.name = name;
        this.authors = authors;
        this.price = price;
        this.qty = qty;
    }

   
    public String getName() {
        return name;
    }

    public Author[] getAuthors() {
        return authors;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    @Override
    public String toString() {
        StringBuilder authorsString = new StringBuilder();
        authorsString.append("authors={");
        for (int i = 0; i < authors.length; i++) {
            authorsString.append(authors[i].toString());
            if (i < authors.length - 1) {
                authorsString.append(", ");
            }
        }
        authorsString.append("}");

        return "Book[name=" + name + "," + authorsString + ",price=" + price + ",qty=" + qty + "]";
    }
}
