package com.example.project;

public class IdGenerate{ //This class contains statics variable and methods, you do not initalize an object to use it.
    
    // //requires 1 private attribute String currentId. You must initialize it to 99
    private String currentID = "99";
    private int numberID = 0;

    // //requires one empty constructor
    public IdGenerate() {}

    public String getCurrentId() {
        return currentID;
    }

    public void reset() {//must reset the currentId back to 99
        currentID = "99";
    }

    public void generateID(){ //generates a new id, when called it will increment the currentId by 1.. Hint pay attention to data type of currentId
        numberID = Integer.parseInt(currentID); // Makes currentID an Int
        numberID ++; // Changes numberID by one
        currentID = Integer(numberID).toString(); // Changes numberID to a string in currentID
    }
}