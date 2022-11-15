package org.example.clase_3.pageobject.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class LoginServices {
    //Para interactuar con la pagina
    private WebDriver driver;
    private LoginPage loginPage;


    public LoginServices(WebDriver driver){
        this.driver = driver;
        this.loginPage = new LoginPage();
    }

    public void ingresar_user_name(String user_name){
        this.driver.findElement(
                this.loginPage.getTxt_user_name()
        ).sendKeys(user_name);
    }

    public void ingresar_user_password(String user_password){
        this.driver.findElement(
                this.loginPage.getTxt_user_password()
        ).sendKeys(user_password);
    }

    public void click_login(){
        this.driver.findElement(
                this.loginPage.getBtn_login()
        ).click();
    }

    public void iniciar_sesion(String user_name, String user_password){
        ingresar_user_name(user_name);
        ingresar_user_password(user_password);
        click_login();
    }
}
