package com.lesson8.task1.controller;


import com.lesson8.task1.model.Model;
import com.lesson8.task1.model.entity.LoginException;
import com.lesson8.task1.model.entity.NoteBook;
import com.lesson8.task1.view.View;

import java.util.Scanner;

/**
 * Created by Dmytro Telefus on 05.07.2021.
 * Modified by Dmytro Telefus on 11.07.2021.
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

        NoteBook noteBook = getNoteBook(note);
        System.out.println(noteBook);
    }

    private NoteBook getNoteBook(Note note) {
        NoteBook noteBook;
        while (true) {
            try {
                noteBook = new NoteBook(note.getFirstName(),
                        note.getLogin());
                break;
            } catch (LoginException e) {
                e.printStackTrace();
                view.printNotUniqueLogin();
                note.inputLogin();
            }
        }
        return noteBook;
    }
}
