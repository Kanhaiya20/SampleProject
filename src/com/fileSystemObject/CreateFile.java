package com.fileSystemObject;

import java.io.File;
import java.io.IOException;

public class CreateFile {
    public static void main(String[] args) throws IOException {
        //File f = new File("/Users/kanhaiyaagarwal/IntelliJ/test/Text.txt");
        //File f = new File("/Users/kanhaiyaagarwal/IntelliJ/test/Text.pdf");
        File f = new File("/Users/kanhaiyaagarwal/IntelliJ/test/Text.json");
        f.createNewFile();
        System.out.println("Done");
    }
}
