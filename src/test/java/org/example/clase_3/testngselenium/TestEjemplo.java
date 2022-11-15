package org.example.clase_3.testngselenium;

import org.example.clase_3.testngselenium.config.DriverManager;
import org.example.clase_3.testngselenium.pages.LoginServices;
import org.testng.annotations.Test;

public class TestEjemplo {

    @Test(testName = "TC - Primera implementacion")
    public void primer_ejemplo() {
        //DriverManager.crear(); //Crea por defecto browser Edge
        DriverManager.crear("chrome");

        //Para implementación de page object model
        LoginServices loginServices = new LoginServices();

        //Pedimos ir a la pagina principal
        loginServices.irPagina();

        loginServices.iniciar_sesion("standard_user", "secret_sauce");
    }

    @Test(testName = "TC - Segunda implementacion")
    public void segundo_ejemplo() {
        DriverManager.crear(); //Crea por defecto browser Edge
        //DriverManager.crear("chrome");

        //Para implementación de page object model
        LoginServices loginServices = new LoginServices();

        //Pedimos ir a la pagina principal
        loginServices.irPagina();

        loginServices.iniciar_sesion("standard_user", "secret_sauce");
    }

    @Test(testName = "TC - tercera implementacion")
    public void tercer_ejemplo() {
        DriverManager.crear(); //Crea por defecto browser Edge
        //DriverManager.crear("chrome");

        //Para implementación de page object model
        LoginServices loginServices = new LoginServices();

        //Pedimos ir a la pagina principal
        loginServices.irPagina();

        loginServices.iniciar_sesion("standard_user", "secret_sauce");
    }
}
