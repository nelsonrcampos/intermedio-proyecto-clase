package org.example.clase_3.pageobject.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
    //Mapeo de elementos
    private By txt_user_name = By.cssSelector("#user-name");
    private By txt_user_password = By.cssSelector("#password");
    private By btn_login = By.cssSelector("#login-button");

    public By getTxt_user_name() {
        return txt_user_name;
    }

    public By getTxt_user_password() {
        return txt_user_password;
    }

    public By getBtn_login() {
        return btn_login;
    }
}
