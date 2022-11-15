package org.example.clase_2.webdrivermanager;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class TestDriverManager {

    public static void main(String[] args) {
        //Configuramos el la variable global para Google Chrome
        WebDriverManager.edgedriver().setup();


        //Creamos la instancia del driver
        WebDriver driver = new EdgeDriver();
        //Maximizamos la pantalla
        driver.manage().window().maximize();
        //Navegamos a la URL deseada
        driver.get("https://www.saucedemo.com/");

        driver.findElement(By.cssSelector("#user-name")).sendKeys("standard_user");
        driver.findElement(By.cssSelector("#password")).sendKeys("secret_sauce");
        driver.findElement(By.cssSelector("#login-button")).click();

        driver.quit();
    }
}
