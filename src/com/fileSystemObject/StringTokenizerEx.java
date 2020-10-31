package com.fileSystemObject;

import java.util.StringTokenizer;

public class StringTokenizerEx {

    public static void main(String[] args) {
        String str = "Bangalore is too cold nowadays";
      //  StringTokenizer st = new StringTokenizer(str);
      //  StringTokenizer st = new StringTokenizer(str,"a");
        StringTokenizer st = new StringTokenizer(str,"a",true);


        while(st.hasMoreTokens()){
            System.out.println(st.nextToken());
        }
    }
}
