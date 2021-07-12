package com.lesson8.task2;

public class App1 {

//    throws
//    public static void main(String[] args) throws String { // Doesn't work
    public static void main(String[] args) throws Throwable {

//        catch
        try {

        } catch (Throwable t) {} // Works

//        try {
//
//        } catch (String s) {} // Doesn't work

//        throw
        throw new Error(); // Works
//        throw new String("Exception"); // Doesn't work
    }
}
