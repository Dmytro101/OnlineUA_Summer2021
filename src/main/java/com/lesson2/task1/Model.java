package com.lesson2.task1;

import java.util.Random;

public class Model {

    public static final int MAX_ATTEMPTS = 101;
    public static final int MIN_NUMBER = 0;
    public static final int RAND_MAX = 100;
    public static final String NUM_IS_GREATER = "Target number is greater!";
    public static final String NUM_IS_LESSER = "Target number is lesser!";
    public static final String NUM_IS_GUESSED = "You guessed the number!";
    public static final String TOTAL_ATTEMPTS = "Total attempts:";
    public static final String YOUR_ATTEMPTS = "Your attempts:";

    private int targetNumber;
    private int min;
    private int max;
    private int[] attempts;
    private String yourAttempts;
    private int numOfAttempts;
    private boolean isGuessed;


    public void init(int min, int max) {
        targetNumber = rand(min, max);
        this.min = min;
        this.max = max;
        attempts = new int[MAX_ATTEMPTS];
        numOfAttempts = 0;
        yourAttempts = YOUR_ATTEMPTS;
        isGuessed = false;
    }

    public String checkValue(int guess) {
        attempts[numOfAttempts++] = guess;
        addAttempt(guess);
        if (guess == targetNumber) {
            isGuessed = true;
            return NUM_IS_GUESSED;
        } else if (targetNumber > guess) {
            min = guess + 1;
            return NUM_IS_GREATER;
        } else {
            max = guess - 1;
            return NUM_IS_LESSER;
        }
    }

    public boolean isGuessed() {
        return isGuessed;
    }

    public int getMin() {
        return min;
    }

    public int getMax() {
        return max;
    }

    private int rand(int min, int max) {
        Random random = new Random();
        return random.nextInt(max - min + 1) + min;
    }

    private int rand() {
        return rand(0, RAND_MAX);
    }

    private void addAttempt(int guess) {
        yourAttempts = yourAttempts + " " + guess;
    }

    public String getAttemptsInfo() {
        return yourAttempts;
    }

    public String getStatistics() {
        return TOTAL_ATTEMPTS + " " + numOfAttempts + '\n' + getAttemptsInfo();
    }
}
