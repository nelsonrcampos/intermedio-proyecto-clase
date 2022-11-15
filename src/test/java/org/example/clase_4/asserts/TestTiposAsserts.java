package org.example.clase_4.asserts;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class TestTiposAsserts {

    @Test
    public void hardAssert(){
        Assert.assertTrue(true, "1- Validacion True");
        Assert.assertTrue(false, "2- Validacion True");
        Assert.assertTrue(false, "3- Validacion True");
    }

    @Test
    public void softAssert(){
        SoftAssert softAssert = new SoftAssert();

        softAssert.assertTrue(true, "1- Validacion True");
        softAssert.assertTrue(false, "2- Validacion True");
        softAssert.assertTrue(false, "3- Validacion True");

        softAssert.assertAll();
    }

    @Test
    public void mixAssert(){
        SoftAssert softAssert = new SoftAssert();

        softAssert.assertTrue(true, "1- Validacion True");

        //Obligatorio
        Assert.assertTrue(false, "2- Validacion True");


        //No Obligatorio
        softAssert.assertTrue(false, "3- Validacion True");
        softAssert.assertTrue(false, "4- Validacion True");

        softAssert.assertAll();
    }
}
