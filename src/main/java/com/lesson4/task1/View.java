package com.lesson4.task1;

import java.util.ArrayList;
import java.util.List;

public class View {

    public final static List<String> FIELDS;
    public final static List<String> REGEX;

    static {
        FIELDS = new ArrayList<String>()
        {{
            add("surname");
            add("nickname");
        }};

        REGEX = new ArrayList<String>() {{
            add("^[A-Za-z]{2,20}$");
            add("^\\w{5,20}$");
        }};
    }

    public static final String EQUAL_SIGN = "=";
    public static final String SPACE_SIGN = " ";
    public static final String INPUT = "Input";
    public static final String WRONG_INPUT_DATA = "Wrong input! Repeat please! ";

    public void printMessage(String message) {
        System.out.println(message);
    }

    public String concatenationString(String... message) {
        StringBuilder sb = new StringBuilder();
        for (String str : message) {
            sb.append(str);
        }
        return sb.toString();
    }
}
