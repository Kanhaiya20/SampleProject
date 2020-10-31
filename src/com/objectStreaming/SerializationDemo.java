package com.objectStreaming;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerializationDemo {
    static FileOutputStream fos;
    static ObjectOutputStream oos;

    public static void main(String[] args) throws IOException {
        try{
            fos = new FileOutputStream("./test/mp.ser");
            oos = new ObjectOutputStream(fos);

            EmployeeInfo emp = new EmployeeInfo(12,"Kanha",123456);
            oos.writeObject(emp);
        }catch(Throwable t){

        }finally {
            fos.close();
            oos.close();
            System.out.println("Done");
        }
    }
}
