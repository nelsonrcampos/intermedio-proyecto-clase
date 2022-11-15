package org.example.clase_3.testngselenium.config;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class DriverManager {

    private static WebDriver driver;

    private static WebDriverWait wait;

    public static void crear(){
        //Configuramos el la variable global para Google Chrome
        WebDriverManager.edgedriver().setup();

        //Creamos la instancia del driver
        driver = new EdgeDriver();
        //Maximizamos la pantalla
        driver.manage().window().maximize();
    }

    public static void crear(String browser){
        //Creamos el driver con el browser deseado
        driver = WebDriverManager.getInstance(browser).create();

        //Maximizamos la pantalla
        driver.manage().window().maximize();

        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    public static void crear(String browser, Integer segundos){
        //Creamos el driver con el browser deseado
        driver = WebDriverManager.getInstance(browser).create();

        //Maximizamos la pantalla
        driver.manage().window().maximize();

        wait = new WebDriverWait(driver, Duration.ofSeconds(segundos));
    }


    public static void click(By elemento){
        driver.findElement(elemento).click();
    }

    public static void click(WebElement elemento){
        elemento.click();
    }

    public static WebDriver getDriver(){
        return driver;
    }

    public static WebDriverWait getWait(){
        return wait;
    }

    public static void ingresarTexto(WebElement elemento, String texto) {
        elemento.sendKeys(texto);
    }
}
