package org.example.clase_3.drivermanager;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.example.clase_3.drivermanager.config.DriverManager;
import org.example.clase_3.drivermanager.pages.LoginServices;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class TestEjemplo {

    public static void main(String[] args) throws InterruptedException {
        /*
        //Configuramos el la variable global para Google Chrome
        WebDriverManager.edgedriver().setup();

        //Creamos la instancia del driver
        WebDriver driver = new EdgeDriver();
        //Maximizamos la pantalla
        driver.manage().window().maximize();
        //Navegamos a la URL deseada
        driver.get("https://www.saucedemo.com/");
         */

        //Creamos el driver y sus demas cosas
        //DriverManager.crear(); //Crea por defecto browser Edge
        DriverManager.crear("chrome");

        //Para implementación de page object model
        LoginServices loginServices = new LoginServices();

        //Pedimos ir a la pagina principal
        loginServices.irPagina();

        loginServices.iniciar_sesion("standard_user", "secret_sauce");

        //Solo se usa a nivel didactico
        //RECORDAR QUE NO SE DEBE USAR
        //Thread.sleep(10000);

        //driver.quit();
    }
}
