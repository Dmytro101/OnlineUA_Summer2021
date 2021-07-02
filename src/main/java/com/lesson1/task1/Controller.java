package com.lesson1.task1;

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
        String message;

        while (!model.isFinished(inputStringValueWithScanner(sc))) {
            message = model.getMessage();
            if (message != null) {
                view.printMessage(message);
            }
        }
        view.printMessage(model.getMessage());
    }

    public String inputStringValueWithScanner(Scanner sc) {
        view.printMessage(View.INPUT_STRING_DATA);
        String title;
        do {
            title = sc.nextLine();
            if (title.isEmpty()) {
                view.printMessage(View.EMPTY_INPUT_DATA + View.INPUT_STRING_DATA);
            }
        } while (title.isEmpty());
        return title;
    }
}
