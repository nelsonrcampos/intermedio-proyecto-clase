package org.example.clase_3.testng;

import org.testng.annotations.Test;

public class AnotacionTest {

    @Test(
            priority = 0,
            testName = "Ejemplo 1"
    )
    public void ejemplo_uno(){
        System.out.println("Hola mundo TestNG");
    }

    @Test(
            priority = 1,
            testName = "Ejemplo 2"
    )
    public void ejemplo_dos(){
        System.out.println("Hola mundo TestNG por dos");
    }

    @Test(
            priority = 2,
            testName = "Ejemplo 3"
    )
    public void ejemplo_tres(){
        System.out.println("Hola mundo TestNG por tres");
    }
}
