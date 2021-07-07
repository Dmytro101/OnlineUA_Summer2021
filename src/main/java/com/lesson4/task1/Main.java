package com.lesson4.task1;

import com.lesson4.task1.model.Model;
import com.lesson4.task1.view.View;
import com.lesson4.task1.controller.Controller;

/**
 * Created by Dmytro Telefus on 05.07.2021.
 * Modified by Dmytro Telefus on 07.07.2021.
 */
public class Main {

    public static void main(String[] args) {
        Controller controller = new Controller(new Model(), new View());
        controller.processUser();
    }
}