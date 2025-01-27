package com.example.project;


public class BookStore{
 
    //requires at least 2 attributes Book[] books, User[] users (initialized to an empty array of 10 max users)
    private Book[] books = new Book[6];
    private User[] users = new User[10];

    //requires 1 empty constructor
    public BookStore() {}
   
    public User[] getUsers() { // returns array of users
        return users;
    }

    public void setUsers(User[] newUsers) {
        for (int i = 0; i < newUsers.length; i ++) { // iterate through all the values of users and change them to the corresponding value of newUsers
            users[i] = newUsers[i];
        }
    }

    public Book[] getBooks() {
        int count = 0;
        for (Book book : books) { // iterates through all books elements 
            if (book != null) { // counts how many are non-null
                count ++;
            }
        }

        Book[] bookLast = new Book[count]; // creates a new array with only non-null books
        int idx = 0;
        for (Book book : books) { // populates new array with non-null books
            if (book != null) {
                bookLast[idx++] = book;
            }
        }
        return bookLast; // returns the array which excludes nulls
    }

    // Method to add a user to the users array
    public void addUser(User user) { 
        for (int i = 0; i < users.length; i ++) { // iterates through all users array elements
            if (users[i] == null) { // finds the first null position in the array
                users[i] = user; // adds the desired user to that null
                break; // exits the loop with break after added
            }
        }

    }

    // Method to remove a user to the users array
    public void removeUser(User user) {
        for (int i = 0; i < users.length; i++) { // iterates throughout all users values
            if (users[i] != null && users[i].equals(user)) {
                for (int j = i; j < users.length - 1; j++) { // shifts all elements after the user to the left
                    users[j] = users[j + 1];
                }
                users[users.length - 1] = null; // sets the remaining elements to null after shifting
                break; // breaks out of the loop once completed 
            }
        }
    }
        
    // Method to consolidate users, shifts non-null users to the front of array
    public void consolidateUsers() {
        User[] temp = new User[4]; // create a temporary array with size 4 (size given by test code) 
        
        int idx = 0; // int to count index place
        for (User user : users) { // iterates through all the users elements
            if (user != null) { // if the element isn't null...
                temp[idx++] = user; // will add the value to the temp list
            }
        }
        users = temp; // assign this temp array to users and it changes the length overall
    }

    // Method to add a book to the books array
    public void addBook(Book book) { 
        for (int i = 0; i < books.length; i++) { // iterates through all elements of books array
            if (books[i] == null) { // finds the first null element of books
                books[i] = book; // adds the desired element into the null space
                break; // breaks out of the loop after added
            }
        }
    }

    // Method to insert a book to the books array in specific index
    public void insertBook(Book book, int index) {
        if (index < 0 || index >= books.length) {
            return; // returns if the index is out of bounds 
        }
        for (int i = books.length - 1; i > index; i--) { // shift the books one position to the right to make space for the new book
            books[i] = books[i - 1];
        }
        books[index] = book;  // inserts the book at the given index
    }

    // Method to remove a book to the books array
    public void removeBook(Book book) {
        for (int i = 0; i < books.length; i ++) { // iterates through all elements of books array
            if (books[i] != null && books[i].equals(book)) { // if the book is found, checks quantity
                if (books[i].getQuantity() > 1) {
                    books[i].setQuantity(books[i].getQuantity() - 1); // reduces the quantity by one
                } else {
                    for (int j = i; j < books.length - 1; j ++) { // iterates through the books length
                        books[j] = books[j + 1]; // shifts the books one position to the left
                    }
                    books[books.length - 1] = null; // sets the last element to null
                }
                return; // exists the loop once the book is removed
            }
        }    
    }
}
       
    // public String bookStoreBookInfo() {} //you are not tested on this method but use it for debugging purposes


    // public String bookStoreUserInfo() {} //you are not tested on this method but use it for debugging purposes




