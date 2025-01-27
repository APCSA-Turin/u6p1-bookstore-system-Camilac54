package com.example.project;

public class Book{
    //requires 5 attributes String title, String author, int yearPublished, String isbn, int quantity
    private String title;
    private String author;
    private int yearPublished; 
    private String isbn;
    private int quantity;
    
    //requires 1 constructor with 5 arguments that intitialize the attribtues of the class.
    public Book (String title, String author, int yearPublished, String isbn, int quantity) { 
        this.title = title;
        this.author = author;
        this.yearPublished = yearPublished;
        this.isbn = isbn;
        this.quantity = quantity;
    }

    public String getTitle() { // returns string title
        return title;
    }

    public void setTitle(String newTitle) { // changes value of title to newTitle
        title = newTitle;
    }

    public String getAuthor() { // return string author
        return author;
    }

    public void setAuthor(String newAuthor) { // changes value of author to newAuthor
        author = newAuthor;
    }

    public int getYearPublished() { // returns int yearPublished
        return yearPublished;
    }

    public void setYearPublished(int newYearPublished) { // changes value of yearPublished to newYearPublished
        yearPublished = newYearPublished;
    }
 
    public String getIsbn() { // returns string is banned
        return isbn;
    }

    public void setIsbn(String newIsbn) { // changes value of is banned to new is banned 
        isbn = newIsbn;
    }

    public int getQuantity() { // return int quantity
        return quantity;
    }

    public void setQuantity(int newQuantity) { // changes value of quantity to newQuantity
        quantity = newQuantity;
    }

    public String bookInfo() { //returns "Title: [], Author: [], Year: [], ISBN: [], Quantity: []"
        String str =  "Title: " + title + ", Author: " + author + ", Year: " + yearPublished + ", ISBN: " + isbn + ", Quantity: " + quantity;
        return str;
    } 
}