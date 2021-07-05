package com.lesson4.task1;

import com.lesson3.task1.GlobalConstants;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Controller {

    private Model model;
    private View view;

    public Controller(Model model, View view) {
        this.model = model;
        this.view = view;
    }

    public void processUser() {
        Scanner sc = new Scanner(System.in);

        model.addRecord(inputEntityWithScanner(sc));
    }

    private Entity inputEntityWithScanner(Scanner sc) {
        List<String> inputList = new ArrayList<>();
        for (int i = 0; i < View.FIELDS.size(); i++) {
            Pattern pattern = Pattern.compile(View.REGEX.get(i));
            String inputMessage = getInputIntMessage(view.FIELDS.get(i));
            view.printMessage(inputMessage);

            while (true) {
                String input = sc.nextLine();
                Matcher matcher = pattern.matcher(input);
                if (!matcher.matches()) {
                    view.printMessage(View.WRONG_INPUT_DATA + inputMessage);
                    continue;
                }
                inputList.add(input);
                break;
            }
        }
        return new Entity(inputList.get(0), inputList.get(1));
    }

    private String getInputIntMessage(String target) {
        return view.concatenationString(
                view.INPUT,
                view.SPACE_SIGN,
                target,
                view.SPACE_SIGN,
                view.EQUAL_SIGN);
    }
}
