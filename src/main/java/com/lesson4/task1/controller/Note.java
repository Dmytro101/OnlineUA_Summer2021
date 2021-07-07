package com.lesson4.task1.controller;

import com.lesson4.task1.view.View;
import java.util.Scanner;

import static com.lesson4.task1.view.TextConstants.*;

/**
 * Created by Dmytro Telefus on 05.07.2021.
 */
public class Note {

    private View view;
    private Scanner sc;

//    private String lastName;
    private String firstName;
//    private String middleName;
//    private String shortFullName;
    private String login;
//    private String comment;
//    private [Enum] group;
//    private String homePhone;
//    private String mobilePhone;
//    private String mobilePhoneExtra;
//    private String email;
//    private String skype;
//    private String zipCode;
//    private String city;
//    private String street;
//    private String houseNumber;
//    private String appartmentNumber;
//    private String fullAddress;
//    private Date creationDate;
//    private Date modificationDate;


    public Note(View view, Scanner sc) {
        this.view = view;
        this.sc = sc;
    }

    public void inputNote() {
        UtilityController utilityController =
                new UtilityController(sc, view);

//        this.lastName = utilityController.inputStringValueWithScanner(
//                LAST_NAME_DATA, view.getResource(REGEX_LAST_NAME));

        this.firstName = utilityController.inputStringValueWithScanner(
                FIRST_NAME_DATA, view.getResource(REGEX_FIRST_NAME));

//        this.middleName = utilityController.inputStringValueWithScanner(
//                MIDDLE_NAME_DATA, view.getResource(REGEX_MIDDLE_NAME));

//        this.shortFullName = createShortFullName();

        this.login = utilityController.inputStringValueWithScanner(
                LOGIN_DATA, view.getResource(REGEX_LOGIN));

//        this.comment = utilityController.inputStringValueWithScanner(
//                COMMENT_DATA, view.getResource(REGEX_COMMENT));

//        this.group = utilityController.inputStringValueWithScanner(
//                GROUP_DATA, view.getResource(REGEX_GROUP));

//        this.homePhone = utilityController.inputStringValueWithScanner(
//                HOME_PHONE_DATA, view.getResource(REGEX_HOME_PHONE));

//        this.mobilePhone = utilityController.inputStringValueWithScanner(
//                MOBILE_PHONE_DATA, view.getResource(REGEX_MOBILE_PHONE));

//        this.mobilePhoneExtra = utilityController.inputStringValueWithScanner(
//                MOBILE_PHONE_EXTRA_DATA, view.getResource(REGEX_MOBILE_PHONE));

//        this.email = utilityController.inputStringValueWithScanner(
//                EMAIL_DATA, view.getResource(REGEX_EMAIL));

//        this.skype = utilityController.inputStringValueWithScanner(
//                SKYPE_DATA, view.getResource(REGEX_SKYPE));

//        this.zipCode = utilityController.inputStringValueWithScanner(
//                ZIP_CODE_DATA, view.getResource(REGEX_ZIP_CODE));

//        this.city = utilityController.inputStringValueWithScanner(
//                CITY_DATA, view.getResource(REGEX_CITY));

//        this.street = utilityController.inputStringValueWithScanner(
//                STREET_DATA, view.getResource(REGEX_STREET));

//        this.houseNumber = utilityController.inputStringValueWithScanner(
//                HOUSE_NUMBER_DATA, view.getResource(REGEX_HOUSE_NUMBER));

//        this.appartmentNumber = utilityController.inputStringValueWithScanner(
//                APPARTMENT_NUMBER_DATA, view.getResource(REGEX_APPARTMENT_NUMBER));

//        this.fullAddress = createFullAddress();
//
//        this.creationDate = getDate();
//
//        this.modificationDate = creationDate;
    }

//    private String createShortFullName() {
//        to be implemented...
//    }
//
//    private String createFullAddress() {
//        to be implemented...
//    }
//
//    private Date getDate() {
//        to be implemented...
//    }
}
