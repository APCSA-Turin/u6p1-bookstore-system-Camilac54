package com.example.project;


public class BookStore{
 
    //requires at least 2 attributes Book[] books, User[] users (initialized to an empty array of 10 max users)
    private Book[] books = new Book[10];
    private User[] users = new User[10];


    //requires 1 empty constructor
    public BookStore() {}
   
    public User[] getUsers() {
        return users;
    }


    public void setUsers(User[] newUsers) {
        for (int i = 0; i < newUsers.length; i ++) { // iterate through all the values of users and change them to the corresponding value of newUsers
            users[i] = newUsers[i];
        }
    }


    public Book[] getBooks() {
        int count = 0;
        for (Book book : books) {
            if (book != null) {
                count ++;
            }
        }


        Book[] bookLast = new Book[count];
        int idx = 0;
        for (Book book : books) {
            if (book != null) {
                bookLast[idx++] = book;
            }
        }
        return bookLast;
    }


    public void addUser(User user) {
        for (int i = 0; i < users.length; i ++) {
            if (users[i] == null) {
                users[i] = user;
                break;
            }
        }

    }


    public void removeUser(User user) {
        for (int i = 0; i < users.length; i ++) {
            if (users[i] != null && users[i].equals(user)) {
                users[i] = null;
                consolidateUsers();
                break;
            }
        }
    }


    public void consolidateUsers() {
        User[] temp = new User[users.length];
        int idx = 0;


        for (User user : users) {
            if (user != null) {
                temp[idx++] = user;
            }
        }
        users = temp;

    }


    public void addBook(Book book) {
        for (int i = 0; i < books.length; i++) {
            if (books[i] == null) {
                books[i] = book;
                break;
            }
        }
    }


    public void insertBook(Book book, int index) {
        if (index < 0 || index >= books.length) {
            return;
        }
        // shift the books one position to the right to make space for the new book
        for (int i = books.length - 1; i > index; i--) {
            books[i] = books[i - 1];
        }
        books[index] = book;  // insert the book at the specified index
    }


    public void removeBook(Book book) {
        for (int i = 0; i < books.length; i ++) {
            if (books[i] != null && books[i].equals(book)) {
                if (books[i].getQuantity() > 1) {
                    books[i].setQuantity(books[i].getQuantity() - 1);
                } else {
                    for (int j = i; j < books.length - 1; j ++) {
                        books[j] = books[j + 1];
                    }
                    books[books.length - 1] = null;
                }
                return;
            }
        }    
    }
}
       
    // public String bookStoreBookInfo() {} //you are not tested on this method but use it for debugging purposes


    // public String bookStoreUserInfo() {} //you are not tested on this method but use it for debugging purposes




