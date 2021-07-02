package com.lesson3.task1;

import java.util.Scanner;

public class Controller {

    private Model model;
    private View view;

    public Controller(Model model, View view) {
        this.model = model;
        this.view = view;
    }

    public void processUser() {
        Scanner sc = new Scanner(System.in);

        model.setBarriers(GlobalConstants.MIN_BARRIER,
                            GlobalConstants.MAX_BARRIER);

        model.setRandomSecretNumber();

        while (model.checkValue(inputIntValueWithScanner(sc)));

        view.printMessage(View.CONGRATULATION + model.getSecretNumber());
        view.printMessage(View.YOUR_ATTEMPTS + String.valueOf(model.getAttempts()));
    }

    private int inputIntValueWithScanner(Scanner sc) {
        int res = 0;
        String inputMessage = getInputIntMessage();
        view.printMessage(inputMessage);

        while (true) {
            while (!sc.hasNextInt()) {
                view.printMessage(view.WRONG_INPUT_INT_DATA + inputMessage);
                sc.next();
            }

            if ((res = sc.nextInt()) <= model.getMinBarrier() ||
                    res >= model.getMaxBarrier()) {
                view.printMessage(view.WRONG_INPUT_INT_DATA + inputMessage);
                continue;
            }
            break;
        }
        return res;
    }

    private String getInputIntMessage() {
        return view.concatenationString(
                view.INPUT_INT_DATA, view.OPENING_SQUARE_BRACKET,
                String.valueOf(model.getMinBarrier()), View.SPACE_SIGN,
                String.valueOf(model.getMaxBarrier()), View.CLOSING_SQUARE_BRACKET,
                View.SPACE_SIGN, View.EQUAL_SIGN, View.SPACE_SIGN);
    }
}
