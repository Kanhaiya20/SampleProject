package com.flowStatements;

public class TwoDiArray {
    public static void main(String[] args) {
//        Object obj[][] = new Object[3][2];
//
//        obj[0][0] = "name1";
//        obj[0][1] = 123;
//        obj[1][0] = "name2";
//        obj[1][1] = "pwd2";
//        obj[2][0] = "name3";
//        obj[2][1] = 12345;

        Object obj[][] = {{"name1", 123},{"name2", "pwd2"},{"name3",12345}};

        System.out.println("row count " + obj.length);
        System.out.println("column count " + obj[0].length);

        for(int i=0; i<obj.length;i++){
            for(int j=0; j<obj[i].length; j++){
                System.out.println(obj[i][j]);
            }
        }
    }
}
