package org.example.clase_5.pagefactory.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class LoginServices {
    //Para interactuar con la pagina
    private WebDriver driver;
    private LoginPage loginPage;


    public LoginServices(WebDriver driver){
        this.driver = driver;

        PageFactory.initElements(driver, LoginPage.class);
        //this.loginPage = new LoginPage();
    }

    public void ingresar_user_name(String user_name){
        //this.driver.findElement(
        //        this.loginPage.getTxt_user_name()
        //).sendKeys(user_name);

        this.loginPage.getTxt_user_name().sendKeys(user_name);
    }

    public void ingresar_user_password(String user_password){
       //this.driver.findElement(
       //         this.loginPage.getTxt_user_password()
       // ).sendKeys(user_password);

        this.loginPage.getTxt_user_password().sendKeys(user_password);
    }

    public void click_login(){
       // this.driver.findElement(
       //         this.loginPage.getBtn_login()
       // ).click();

        this.loginPage.getBtn_login().click();
    }

    public void iniciar_sesion(String user_name, String user_password){
        ingresar_user_name(user_name);
        ingresar_user_password(user_password);
        click_login();
    }
}
