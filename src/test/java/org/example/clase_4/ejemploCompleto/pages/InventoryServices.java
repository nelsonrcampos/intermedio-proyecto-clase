package org.example.clase_4.ejemploCompleto.pages;

import org.example.clase_4.ejemploCompleto.config.DriverManager;
import org.openqa.selenium.NoSuchElementException;

public class InventoryServices {

    private InventoryPage inventoryPage;

    public InventoryServices(){
        this.inventoryPage = new InventoryPage();
    }

    public boolean esVisibleCarrito(){
        Boolean resultado = false;

        //Usamos try-catch ya que posiblemente largue una exception
        //haciendo que nuestro test no se valide, sino, muestre la exception
        try{
            //Código con posible exception
            resultado = DriverManager.getDriver().findElement(this.inventoryPage.getCarrito()).isDisplayed();
        }
        catch (NoSuchElementException ex){
            //Tratamos cada exception por separado
            resultado = false;
        }

        //Retornamos el resultado final
        return resultado;
    }
}
