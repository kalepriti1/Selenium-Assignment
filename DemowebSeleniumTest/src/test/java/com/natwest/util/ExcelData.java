package com.natwest.util;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ExcelData {

    public static String getData(String filepath, String sheetname, int rn, int cn) {
        try{
            FileInputStream file = new FileInputStream(filepath);
            Workbook wb = WorkbookFactory.create(file);
            Row r = wb.getSheet(sheetname).getRow(rn);
            String data = r.getCell(cn).getStringCellValue();
            return data;


        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }catch (Exception  e){
            return "";
        }
    }
}
