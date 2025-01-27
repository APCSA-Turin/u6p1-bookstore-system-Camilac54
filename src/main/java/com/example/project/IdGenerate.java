package com.example.project;

public class IdGenerate{ //This class contains statics variable and methods, you do not initalize an object to use it.
    
    // //requires 1 private attribute String currentId. You must initialize it to 99
    private static int currentID = 99;

    // //requires one empty constructor
    public IdGenerate() {}

    public static String getCurrentId() { // returns the value of currentID(an int) and changes it to a String
        return String.valueOf(currentID);
    }

    public static void reset() { //must reset the currentId back to 99
        currentID = 99;
    }

    public static void generateID(){ //generates a new id, when called it will increment the currentId by 1.. Hint pay attention to data type of currentId
        currentID ++;
    }
}