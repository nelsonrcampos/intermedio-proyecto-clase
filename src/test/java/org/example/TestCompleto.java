package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestCompleto {

    public static void main(String[] args) {
        //Configuramos el la variable global para Google Chrome
        System.setProperty("webdriver.chrome.driver",
               System.getProperty("user.dir") + "/src/test/resources/drivers/chromedriver.exe");


        //Creamos la instancia del driver
        WebDriver driver = new ChromeDriver();
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
