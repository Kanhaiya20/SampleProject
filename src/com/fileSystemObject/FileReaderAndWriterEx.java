package com.fileSystemObject;

import java.io.*;

public class FileReaderAndWriterEx {
    static FileReader fr;
    static FileWriter fw;

    public static void main(String[] args) throws IOException {
        try{
            fr = new FileReader("./test/Text.txt");
            fw = new FileWriter("./test/Test_copy2.txt");
            int data;
            while((data=fr.read())!=-1){
                fw.write(data);
            }
        }catch(Throwable t){

        }finally {
            fr.close();
            fw.close();
            System.out.println("Done");
        }
    }
}
