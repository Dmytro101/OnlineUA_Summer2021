package com.lesson8.task1.model.entity;

/**
 * Created by Dmytro Telefus on 11.07.2021.
 */
public class NoteBook {
    private String firstName;
    private String login;

    public NoteBook(String firstName, String login) throws LoginException {
        if (!DataBase.checkLogin(login)) {
            throw new LoginException("Login already exists!", login);
        }
        this.firstName = firstName;
        this.login = login;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    @Override
    public String toString() {
        return "NoteBook{" +
                "firstName='" + firstName + '\'' +
                ", login='" + login + '\'' +
                '}';
    }
}
