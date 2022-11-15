package org.example.clase_4.ejemploCompleto;

import org.example.clase_4.ejemploCompleto.config.DriverManager;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest {

    @BeforeMethod
    public void setup(){
        DriverManager.crear("chrome");
    }

    @AfterMethod
    public void tearDown(){
        DriverManager.getDriver().quit();
    }

}
