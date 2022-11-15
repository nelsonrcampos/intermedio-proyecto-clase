package org.example.clase_5.pagefactory;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.example.clase_5.pagefactory.pages.LoginServices;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class TestEjemplo {

    public static void main(String[] args) {
        //Configuramos el la variable global para Google Chrome
        WebDriverManager.chromedriver().setup();

        //Creamos la instancia del driver
        WebDriver driver = new ChromeDriver();
        //Maximizamos la pantalla
        driver.manage().window().maximize();
        //Navegamos a la URL deseada
        driver.get("https://www.saucedemo.com/");

        //Para implementación de page object model
        LoginServices loginServices = new LoginServices(driver);
        loginServices.iniciar_sesion("standard_user", "secret_sauce");

        driver.quit();
    }
}
