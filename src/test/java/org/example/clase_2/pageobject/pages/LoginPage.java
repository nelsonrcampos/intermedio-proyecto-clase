package org.example.clase_2.pageobject.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

    //Mapeo de elementos
    private By txt_user_name = By.cssSelector("#user-name");
    private By txt_user_password = By.cssSelector("#password");
    private By btn_login = By.cssSelector("#login-button");

    //Para interactuar con la pagina
    private WebDriver driver;

    public LoginPage(WebDriver driver){
        this.driver = driver;
    }

    public void ingresar_user_name(String user_name){
        this.driver.findElement(this.txt_user_name).sendKeys(user_name);
    }

    public void ingresar_user_password(String user_password){
        this.driver.findElement(this.txt_user_password).sendKeys(user_password);
    }

    public void click_login(){
        this.driver.findElement(this.btn_login).click();
    }

    public void iniciar_sesion(String user_name, String user_password){
        ingresar_user_name(user_name);
        ingresar_user_password(user_password);
        click_login();
    }
}
