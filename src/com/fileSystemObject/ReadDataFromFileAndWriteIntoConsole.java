package com.fileSystemObject;

import java.io.FileInputStream;
import java.io.IOException;

public class ReadDataFromFileAndWriteIntoConsole {
    static FileInputStream fip;

    public static void main(String[] args) throws IOException {
        try{
            fip = new FileInputStream("./test/Text.txt");
            int data;
            while((data=fip.read())!=-1){
                System.out.print((char)data);
            }
        }catch(Throwable t){

        }finally {
            fip.close();
        }
    }
}
