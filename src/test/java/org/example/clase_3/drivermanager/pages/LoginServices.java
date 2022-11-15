package org.example.clase_3.drivermanager.pages;

import org.example.clase_3.drivermanager.config.DriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class LoginServices {
    private LoginPage loginPage;


    public LoginServices(){
        this.loginPage = new LoginPage();
    }

    public void irPagina(){
        DriverManager.getDriver().get(loginPage.getUrl());
    }

    public void ingresar_user_name(String user_name){
        DriverManager.getDriver().findElement(
                this.loginPage.getTxt_user_name()
        ).sendKeys(user_name);
    }

    public void ingresar_user_password(String user_password){
        //Implementando esperas
        WebElement txt_userPassword =  DriverManager.getWait().until(
                ExpectedConditions.visibilityOfElementLocated(this.loginPage.getTxt_user_password())
        );

        DriverManager.ingresarTexto(txt_userPassword, user_password);

        /*
        DriverManager.getDriver().findElement(
                this.loginPage.getTxt_user_password()
        ).sendKeys(user_password);

         */
    }

    public void click_login(){
        DriverManager.click(this.loginPage.getBtn_login());

        /*
        DriverManager.getDriver().findElement(
                this.loginPage.getBtn_login()
        ).click();

         */
    }

    public void iniciar_sesion(String user_name, String user_password){
        ingresar_user_name(user_name);
        ingresar_user_password(user_password);
        click_login();
    }
}
