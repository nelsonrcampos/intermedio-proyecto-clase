package org.example.clase_4.ejemploCompleto.pages;

import org.openqa.selenium.By;

public class InventoryPage {

    private By carrito = By.xpath("//a[@class='shopping_cart_link']");

    public By getCarrito() {
        return carrito;
    }
}
