package org.example.clase_4.ejemploCompleto;

import org.example.clase_4.ejemploCompleto.config.DriverManager;
import org.example.clase_4.ejemploCompleto.pages.InventoryServices;
import org.example.clase_4.ejemploCompleto.pages.LoginServices;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestEjemploDos extends BaseTest{

    @Test
    public void login_incorrecto_usuario_bloqueado()
    {
        //Para implementación de page object model
        LoginServices loginServices = new LoginServices();

        InventoryServices inventoryServices = new InventoryServices();

        //Pedimos ir a la pagina principal
        loginServices.irPagina();

        loginServices.iniciar_sesion("locked_out_user", "secret_sauce");

        //Validamos si es visible el carrito cuando inicia sesion
        Assert.assertFalse(
                inventoryServices.esVisibleCarrito(),
                "Validacion carrito no sea visible"
        );
    }

}
