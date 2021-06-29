package com.lesson2.task1;

import java.util.Scanner;

public class Controller {

    private Model model;
    private View view;

    public Controller(Model model, View view) {
        this.model = model;
        this.view = view;
    }

    public void processUser() {
        model.init(model.MIN_NUMBER, model.RAND_MAX);
        Scanner sc = new Scanner(System.in);

        do {
            view.printMessage(model.getAttemptsInfo());
            int min = model.getMin();
            int max = model.getMax();
            String message = view.INPUT_INT_DATA + " [" + min + ", " + max + "]";
            view.printMessage(model.checkValue(inputValidValue(sc, message, min, max)));
        } while(!model.isGuessed());

        view.printMessage(model.getStatistics());
    }

    public int inputIntValueOnRangeWithScanner(Scanner sc, String message) {
        view.printMessage(message);
        while( ! sc.hasNextInt()) {
            view.printMessage(View.WRONG_INPUT_DATA + message);
            sc.next();
        }
        return sc.nextInt();
    }

    public int inputValidValue(Scanner sc, String message, int min, int max) {
        int value;
        while (!isValidNumber(value = inputIntValueOnRangeWithScanner(sc, message), min, max)) {
            view.printMessage(View.WRONG_INPUT_DATA);
        }
        return value;
    }

    private boolean isValidNumber(int number, int min, int max) {
        return (number >= min) && (number <= max);
    }
}
