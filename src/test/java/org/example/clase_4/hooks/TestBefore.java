package org.example.clase_4.hooks;

import org.testng.annotations.*;

public class TestBefore {

    @BeforeSuite
    public void beforeSuite(){
        System.out.println("Ejecucion @BeforeSuite");
    }



    @BeforeClass
    public void beforeClass(){
        System.out.println("Ejecucion @BeforeClass");
    }

    @BeforeMethod
    public void beforeMethod(){
        System.out.println("Ejecucion @BeforeMethod");
    }

    @Test
    public void test_uno(){
        System.out.println(" ---- Ejecucion @Test ---- ");
    }

    @Test
    public void test_dos(){
        System.out.println(" ---- Ejecucion @Test ---- ");
    }

    @BeforeTest
    public void beforeTest(){
        System.out.println("Ejecucion @BeforeTest");
    }
}
