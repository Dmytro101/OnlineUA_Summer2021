package com.lesson8.task1.model.entity;

/**
 * Created by Dmytro Telefus on 11.07.2021.
 */
public enum DataBase {
    FIRST_NOTE("Jack", "jacky123"),
    SECOND_NOTE("Ivan", "vano1"),
    THIRD_NOTE("Sergiy", "serg777");

    private final String firstName;
    private final String login;

    DataBase(String firstName, String login) {
        this.firstName = firstName;
        this.login = login;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLogin() {
        return login;
    }

    public static boolean checkLogin(String login) {
        for (DataBase note : DataBase.values()) {
            if (note.getLogin().equals(login)) {
                return false;
            }
        }
        return true;
    }
}
