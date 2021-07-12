package com.lesson8.task2;

public class App2 {

    public static void main(String[] args) {
        double d = sqr(10.0);
        System.out.println(d);
    }

    public static double sqr(double arg) {
        // Механизм исключений позволяет ничего не возвращать
        throw new RuntimeException();
    }

    public static int area(int width, int height) {
        if (width < 0 || height < 0) {
            throw new IllegalArgumentException("Arguments must be greater than 0!");
        } else {
            return width * height;
        }
    }
}
