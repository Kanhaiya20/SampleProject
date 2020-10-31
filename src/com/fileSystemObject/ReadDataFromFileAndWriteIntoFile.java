package com.fileSystemObject;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ReadDataFromFileAndWriteIntoFile {
    static FileInputStream fip;
    static FileOutputStream fop;

    public static void main(String[] args) throws Throwable {
        try{
//            fip = new FileInputStream("./test/Text.txt");
//            fop = new FileOutputStream("./test/Test_copy.txt");
//            fip = new FileInputStream("./test/Text.png");
//            fop = new FileOutputStream("./test/Test_copy.png");
            fip = new FileInputStream("./test/Text.pdf");
            fop = new FileOutputStream("./test/Test_copy.pdf");
            int data;
            while((data=fip.read())!=-1){
                fop.write(data);
            }
        }catch(Throwable t){

        }finally {
            fip.close();
            fop.close();
            System.out.println("Done");
        }
    }
}
