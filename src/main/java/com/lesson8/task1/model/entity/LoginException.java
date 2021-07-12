package com.lesson8.task1.model.entity;

/**
 * Created by Dmytro Telefus on 11.07.2021.
 */
public class LoginException extends Exception {
    private String login;

    private String getLogin() {
        return login;
    }

    public LoginException(String message, String login) {
        super(message);
        this.login = login;
    }
}
