package com.lesson12.task2;

public class Main {
    public static void main(String[] args) {
        MyArrayList<String> list = new MyArrayList<>();
        list.add("1");
        list.add("2");

        try {
            list.remove(0);
            list.set(0, "0");
            list.clear();
        } catch (UnsupportedOperationException e) {
            System.out.println("You cannot remove elements from this data structure!");
        }
    }
}