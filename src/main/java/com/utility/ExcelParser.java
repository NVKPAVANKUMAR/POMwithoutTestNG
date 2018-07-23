package com.utility;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.IOException;

public class ExcelParser {
    private static XSSFWorkbook workbook;
    private static XSSFSheet sheet;
    private static XSSFRow row;
    private static XSSFCell cell;

    public static void getData() throws IOException {
        String filePath = "Excel/dataSheet.xlsx";
        FileInputStream fis = new FileInputStream(filePath);
        workbook = new XSSFWorkbook(fis);
        sheet = workbook.getSheetAt(0);
        int col = sheet.getRow(0).getLastCellNum();
        int row = sheet.getPhysicalNumberOfRows();
        System.out.println("rows : " + row + " col : " + col);
        Object[][] data = new Object[row][col];
        for (int i = 1; i < row; i++) {
            for (int j = 0; j < col; j++) {
                cell = sheet.getRow(i).getCell(j);
                System.out.println(i + " : " + j + " - " + cell);
                data[i][j] = cell;
            }
        }
        //return data[][]
    }
}
