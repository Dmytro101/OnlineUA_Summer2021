package com.lesson7.task2;

public class Main {

    public static void main(String[] args) {
        // Creating mutable Year object
        Year year = new Year(2010);

        // Creating immutable object
        Immutable immutable = new Immutable("Jack", 35, year);

        // Print object
        System.out.println(immutable);

        // Trying to change fields
        immutable.setName("Mark");
        immutable.setAge(10);
        immutable.setYear(new Year(0));

        // Check if nothing has changed
        System.out.println(immutable);

        // Trying to change field via year variable
        year.setValue(0);

        // Another check
        System.out.println(immutable);

        // Trying to break something
        immutable.getYear().setValue(0);

        // So the output is the same
        System.out.println(immutable);
    }
}
