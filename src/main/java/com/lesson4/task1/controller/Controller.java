package com.lesson4.task1.controller;


import com.lesson4.task1.model.Model;
import com.lesson4.task1.view.View;

import java.util.Scanner;

/**
 * Created by Dmytro Telefus on 05.07.2021.
 * Modified by Dmytro Telefus on 07.07.2021.
 */
public class Controller {

    private Model model;
    private View view;

    public Controller(Model model, View view) {
        this.model = model;
        this.view = view;
    }

    public void processUser() {
        Scanner sc = new Scanner(System.in);
        Note note = new Note(view, sc);
        note.inputNote();
    }
}
