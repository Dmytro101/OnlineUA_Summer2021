package com.lesson13.task1;

import java.util.Arrays;
import java.util.NoSuchElementException;
import java.util.stream.IntStream;

public class IntStreamUtility {

    private static int[] numbers = {0, 15, -5, 10, 0, 41, -19, 9, 1, 0};
    public static final int MULTIPLIER = 2;

    public static void main(String[] args) {

        System.out.println("Original array: " + Arrays.toString(numbers));
        System.out.println("Average: " + getAverageOfIntArray(numbers));
        System.out.println("Min element value: " + getMinElementInIntArray(numbers));
        System.out.println("Min element index: " + getIndexOfMinElementInIntArray(numbers));
        System.out.println("Zeros: " + getNumberOfZerosInIntArray(numbers));
        System.out.println("Positive numbers: " + getPositiveNumbersAmountInIntArray(numbers));
        System.out.println("Array multiplied by " + MULTIPLIER + ": " +
                Arrays.toString(multiplyEveryIntegerInArray(numbers, MULTIPLIER)));
    }

    public static double getAverageOfIntArray(int[] numbers) {
        return Arrays.stream(numbers).average().orElseThrow(IllegalArgumentException::new);
    }

    public static int getIndexOfMinElementInIntArray(int[] numbers) {
        return IntStream.range(0, numbers.length)
                .reduce((i, j) -> numbers[i] > numbers[j] ? j : i)
                .orElseThrow(IllegalArgumentException::new);
    }

    public static int getMinElementInIntArray(int[] numbers) {
        return Arrays.stream(numbers).min().orElseThrow(NoSuchElementException::new);
    }

    public static long getNumberOfZerosInIntArray(int[] numbers) {
        if (numbers.length == 0) return 0;
        return Arrays.stream(numbers).filter(x -> x == 0).count();
    }

    public static long getPositiveNumbersAmountInIntArray(int[] numbers) {
        if (numbers.length == 0) return 0;
        return Arrays.stream(numbers).filter(x -> x > 0).count();
    }

    public static int[] multiplyEveryIntegerInArray(int[] numbers, int multiplier) {
        if (numbers.length == 0) return numbers;
        return Arrays.stream(numbers).map(x -> x * multiplier).toArray();
    }
}
