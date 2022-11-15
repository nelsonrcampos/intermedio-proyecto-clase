package org.example.clase_4.asserts;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestAsserts {


    @Test
    public void testEquals(){
        System.out.println("-- PROBANDO AssertEquals --");

        String actual = "Cadena";
        String esperado = "Cadena";

        Assert.assertEquals(actual, esperado, "Se valido incorrectamente");
    }

    @Test
    public void testTrue(){
        System.out.println("-- PROBANDO AssertTrue --");

        String actual = "Cadena";
        String esperado = "Cadenas";

        Boolean resultado = (1+1 == 2);

        Assert.assertTrue(resultado, "Se valido incorrectamente");
    }

    @Test
    public void testNull(){
        System.out.println("-- PROBANDO AssertNull --");

        String actual = "Cadena";

        Boolean resultado = null;

        Assert.assertNull(resultado, "Se valido incorrectamente");
    }

    @Test
    public void testNotNull(){
        System.out.println("-- PROBANDO AssertNotNull --");

        String actual = "Cadena";

        Boolean resultado = null;

        Assert.assertNotNull(actual, "Se valido incorrectamente");
    }
}
