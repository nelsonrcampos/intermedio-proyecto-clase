package org.example.clase_2.pageobject;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.example.clase_2.pageobject.pages.LoginPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class TestLogin {

    public static void main(String[] args) {
        //Configuramos el la variable global para Google Chrome
        WebDriverManager.edgedriver().setup();

        //Creamos la instancia del driver
        WebDriver driver = new EdgeDriver();
        //Maximizamos la pantalla
        driver.manage().window().maximize();
        //Navegamos a la URL deseada
        driver.get("https://www.saucedemo.com/");



        /*
        driver.findElement(By.cssSelector("#user-name")).sendKeys("standard_user");
        driver.findElement(By.cssSelector("#password")).sendKeys("secret_sauce");
        driver.findElement(By.cssSelector("#login-button")).click();
         */

        //Para implementación de page object model
        LoginPage loginPage = new LoginPage(driver);

        //loginPage.ingresar_user_name("standard_user");
        //loginPage.ingresar_user_password("secret_sauce");
        //loginPage.click_login();

        //loginPage.click_login();
        //loginPage.ingresar_user_name("standard_user");
        //loginPage.ingresar_user_password("secret_sauce");
        //loginPage.click_login();

        //loginPage.ingresar_user_password("secret_sauce");
        //loginPage.ingresar_user_name("standard_user");
        //loginPage.click_login();

        loginPage.iniciar_sesion("standard_user", "secret_sauce");









        //driver.quit();
    }
}
