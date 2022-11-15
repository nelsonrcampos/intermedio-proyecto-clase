package org.example.clase_5.pagefactory.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage {
    //Mapeo de elementos
    @FindBy(id = "user-name")
    private WebElement txt_user_name;

    @FindBy(id = "user-password")
    private WebElement txt_user_password;

    @FindBy(id = "login-button")
    private WebElement btn_login;


    public WebElement getTxt_user_name() {
        return txt_user_name;
    }

    public WebElement getTxt_user_password() {
        return txt_user_password;
    }

    public WebElement getBtn_login() {
        return btn_login;
    }
}
