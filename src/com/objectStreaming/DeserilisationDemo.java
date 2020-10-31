package com.objectStreaming;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DeserilisationDemo {
    static FileInputStream fip;
    static ObjectInputStream ois;

    public static void main(String[] args) throws IOException {
        try{

            fip = new FileInputStream("./test/mp.ser");
            ois = new ObjectInputStream(fip);
            Object o = ois.readObject();
            EmployeeInfo emp = (EmployeeInfo)o;
            System.out.println("Emp ID = " + emp.empid);
            System.out.println("Emp name = " + emp.name);
            System.out.println("Emp loginpwd = " + emp.loginpwd);

        }catch(Throwable t){

        }finally {
            fip.close();
            ois.close();
            System.out.println("Done");
        }

    }
}
