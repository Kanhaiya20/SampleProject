package com.propertiesFile;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Properties;

public class WorkWithPropertiesFile {
    public static void main(String[] args) throws Throwable {
        Properties prop = new Properties();
        prop.load(new FileReader("./src/com/propertiesFile/Global.properties"));

        System.out.println(prop.getProperty("Browsertype"));
        System.out.println(prop.getProperty("username"));
        System.out.println(prop.getProperty("TestEnvi"));

        prop.setProperty("url", "www.google.com");
        System.out.println(prop.getProperty("url"));
    }
}
