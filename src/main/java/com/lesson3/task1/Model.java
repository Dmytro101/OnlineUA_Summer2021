package com.lesson3.task1;

import java.util.ArrayList;
import java.util.List;

public class Model {

    private int secretNumber;

    private int minBarrier;
    private int maxBarrier;

    private List<Integer> attempts = new ArrayList<>();

    public void setBarriers(int minBarrier, int maxBarrier) {
        this.minBarrier = minBarrier;
        this.maxBarrier = maxBarrier;
    }

    public boolean checkValue(int guess) {
        attempts.add(guess);
        if (guess == secretNumber) {
            return false;
        } else if (guess > secretNumber) {
            maxBarrier = guess;
        } else {
            minBarrier = guess;
        }
        return true;
    }

    public int getSecretNumber() { return secretNumber; }

    public int getMinBarrier() {
        return minBarrier;
    }

    public int getMaxBarrier() {
        return maxBarrier;
    }

    public void setSecretNumber(int secretNumber) {
        this.secretNumber = secretNumber;
    }

    public void setRandomSecretNumber() {
        secretNumber = (int)Math.ceil(Math.random() *
                (maxBarrier - minBarrier - 1) + minBarrier);
    }

    public List<Integer> getAttempts() {
        return attempts;
    }
}
