package com.example.project;

public class User{
    //requires 3 private attributes String name, String Id, Book book that is initialized to empty
    private String name; 
    private String ID;
    private Book[] books;

    //requires 1 contructor with two parameters that will initialize the name and id
    public User (String name, String ID) {
        this.name = name;
        this.ID = ID;
        this.books = new Book[5];
    }

    public String getName() { // returns string name
        return name;
    }

    public void setName(String newName) { // changes string name to string newName
        this.name = newName;
    }

    public String getId() { // returns string ID
        return ID;
    }

    public void setId(String newID) { // changes string ID to string newID
        this.ID = newID;
    }

    public Book[] getBooks() { // returns book array
        return books;
    }

    public void setBooks(Book[] newBooks) { // changes book array books to newBooks
        this.books = newBooks;
    }

    public String bookListInfo() { //returns a booklist for the user, if empty, output "empty"}
        String str = "";
        for (int i = 0; i < books.length; i ++) { 
            if (books[i] == null) { // if the value of a book element is null, it will add "empty" to a string instead of null
                str += "empty\n";
            } else {
                str += books[i].bookInfo() + "\n"; // adds the filled element of books into a string and a space
            }
        }
        return str;
    
    }

    public String userInfo(){ //returns  "Name: []\nID: []\nBooks:\n[]"
        String str = "Name: " + name + "\nId: " + ID + "\nBooks: \n" + bookListInfo();
        return str;
    }
}