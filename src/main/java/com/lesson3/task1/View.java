package com.lesson3.task1;

public class View {

    public static final String EQUAL_SIGN = "=";
    public static final String SPACE_SIGN = " ";
    public static final String OPENING_SQUARE_BRACKET = "[";
    public static final String CLOSING_SQUARE_BRACKET = "]";

    public static final String INPUT_INT_DATA = "Input INT value ";
    public static final String WRONG_INPUT_INT_DATA = "Wrong input! Repeat please! ";
    public static final String CONGRATULATION = "CONGRATULATIONS! You WIN! Secret number = ";
    public static final String YOUR_ATTEMPTS = "YOUR ATTEMPTS = ";

    public void printMessage(String message) {
        System.out.println(message);
    }

    public String concatenationString(String... message) {
        StringBuilder sb = new StringBuilder();
        for (String str : message) {
            sb.append(str);
        }
        return sb.toString();
    }
}
