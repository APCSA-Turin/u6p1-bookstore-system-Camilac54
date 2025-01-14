package com.example.project;

public class User{
    //requires 3 private attributes String name, String Id, Book book that is initialized to empty
    private String name; 
    private String ID;
    private Book book;

    //requires 1 contructor with two parameters that will initialize the name and id
    public User (String name, String ID) {
        this.name = name;
        this.ID = ID;
    }

    public String getName() {
        return name;
    }


    public void setName(String newName) {
        name = newName;
    }

    public String getId() {
        return ID;
    }

    public void setId(String newID) {
        ID = newID;
    }

    public Book getBooks() {
        return book;
    }

    public setBooks(Book newBook) {
        book = newBook;
    }

    public String bookListInfo() { //returns a booklist for the user, if empty, output "empty"}
        if (book.isEmpty()) {
            String str = "\nempty\nempty\nempty\nempty\nempty\n"; 
        } else {
            String str = book.bookInfo();
        }
    }

    public String userInfo(){ //returns  "Name: []\nID: []\nBooks:\n[]"
        String str =    "Name:" + name + "\nID: " + ID + "\nBooks:\n" + bookListInfo();
        return str;
    }
}