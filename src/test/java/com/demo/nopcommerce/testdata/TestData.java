package com.demo.nopcommerce.testdata;

import org.testng.annotations.DataProvider;

public class TestData {

    @DataProvider(name = "credentials")
    public Object[][] getData(){
        return new Object[][]{
                {"test1@gmail.com","test123"},
                {"test2@gmail.com","test123"},
                {"test3@gmail.com","test123"}

        };
    }

}


