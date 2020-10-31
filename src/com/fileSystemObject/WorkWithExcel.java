package com.fileSystemObject;

import xls.ShineXlsReader;

public class WorkWithExcel {
    public static void main(String[] args) {
        ShineXlsReader xls = new ShineXlsReader("./test/TestData.xlsx");
        int rowcount = xls.getRowCount("Sheet1");
        int colcount = xls.getColumnCount("Sheet1");
        System.out.println("Row count " + rowcount);
        System.out.println("Col count " + colcount);

        xls.addSheet("Sheet4");
        xls.addColumn("Sheet4", "EmpName");
        xls.setCellData("Sheet4", "EmpName", 2, "Kanha");
        System.out.println("Done");

//        for(int i=2; i<=rowcount; i++){
//            for(int j=0;j<colcount; j++){
//                String celldata = xls.getCellData("Sheet1", j , i);
//                System.out.println(celldata);
//            }
//        }

    }
}
