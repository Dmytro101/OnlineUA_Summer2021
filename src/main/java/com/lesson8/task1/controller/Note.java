package com.lesson8.task1.controller;

import com.lesson8.task1.view.View;

import java.util.Scanner;

import static com.lesson8.task1.view.TextConstants.*;

/**
 * Created by Dmytro Telefus on 05.07.2021.
 * Modified by Dmytro Telefus on 11.07.2021.
 */
public class Note {

    private View view;
    private Scanner sc;

    private String firstName;
    private String login;

    public Note(View view, Scanner sc) {
        this.view = view;
        this.sc = sc;
    }

    public void inputNote() {
        UtilityController utilityController =
                new UtilityController(sc, view);

        this.firstName = utilityController.inputStringValueWithScanner(
                FIRST_NAME_DATA, view.getResource(REGEX_FIRST_NAME));

        this.login = utilityController.inputStringValueWithScanner(
                LOGIN_DATA, view.getResource(REGEX_LOGIN));
    }

    public void inputLogin() {
        UtilityController utilityController =
                new UtilityController(sc, view);

        this.login = utilityController.inputStringValueWithScanner(
                LOGIN_DATA, view.getResource(REGEX_LOGIN));
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLogin() {
        return login;
    }
}
