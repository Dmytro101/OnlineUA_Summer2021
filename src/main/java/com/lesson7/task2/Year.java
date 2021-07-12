package com.lesson7.task2;

public class Year {
    private int value;

    public Year(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "Year{" +
                "value=" + value +
                '}';
    }
}
