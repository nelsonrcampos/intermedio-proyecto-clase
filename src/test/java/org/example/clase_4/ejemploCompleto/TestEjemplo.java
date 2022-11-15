package org.example.clase_4.ejemploCompleto;

import org.example.clase_4.ejemploCompleto.config.DriverManager;
import org.example.clase_4.ejemploCompleto.pages.InventoryServices;
import org.example.clase_4.ejemploCompleto.pages.LoginServices;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestEjemplo extends BaseTest{

    @BeforeMethod
    public void setupPropio(){
        System.out.println("SETUP PROPIO DE LOS TEST DE LA CLASE TestEjemplo");
    }

    @Test
    public void login_correcto()
    {
        //Para implementación de page object model
        LoginServices loginServices = new LoginServices();

        InventoryServices inventoryServices = new InventoryServices();


        //Pedimos ir a la pagina principal
        loginServices.irPagina();

        loginServices.iniciar_sesion("standard_user", "secret_sauce");

        //Validamos si es visible el carrito cuando inicia sesion
        Assert.assertTrue(
                inventoryServices.esVisibleCarrito(),
                "Validacion carrito visible"
        );
    }

    @Test
    public void login_incorrecto()
    {
        //Para implementación de page object model
        LoginServices loginServices = new LoginServices();

        InventoryServices inventoryServices = new InventoryServices();

        //Pedimos ir a la pagina principal
        loginServices.irPagina();

        loginServices.iniciar_sesion("nelson", "secret_sauce");

        //Validamos si es visible el carrito cuando inicia sesion
        Assert.assertTrue(
                inventoryServices.esVisibleCarrito(),
                "Validacion carrito visible"
        );
    }

}
