package org.example.clase_5.anotacionparameters;

import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestParameters {


    @Test
    @Parameters({"valor_uno", "valor_dos"})
    public void sumar(int a, int b){
        //int a = 1;
        //int b = 2;

        int suma = a+b;

        System.out.println("La suma es: " + suma);
    }

    @Test
    @Parameters({"valor_uno", "valor_dos"})
    public void suma_opcional(@Optional("0") int a, int b){
        //int a = 1;
        //int b = 2;

        int suma = a+b;

        System.out.println("La suma es: " + suma);
    }
}
