package com.controlstatements;

public class MyClass {
    String message;

    public MyClass(String message) {
        this.message = message;
    }

    public void displayMessage() {
        System.out.println(message);
    }

    public static void main(String[] args) {
        MyClass myObject = new MyClass("hey this is java code for New keyword ");

        myObject.displayMessage();
    }
}




