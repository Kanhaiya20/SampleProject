package com.fileSystemObject;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class BufferReaderToCountWords {
    static FileReader fr;
    static StringTokenizer st;
    static BufferedReader br;
    static int count = 0;

    public static void main(String[] args) throws IOException {
        try{
            fr = new FileReader("./test/Text.txt");
            br = new BufferedReader(fr);
            String data;
            while((data=br.readLine())!=null){
                String readline = data;
                st = new StringTokenizer(readline);
                while (st.hasMoreTokens()){
                    System.out.println(st.nextToken());
                    count++;
                }
            }
            System.out.println("Total number of words " + count);
        }catch(Throwable t){

        }finally {
            fr.close();
            br.close();
        }
    }
}
