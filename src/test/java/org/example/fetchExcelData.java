package org.example;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.IOException;

public class fetchExcelData {
    public static void main(String[] args) throws IOException {
        FileInputStream file =
                new FileInputStream(
                        "src/test/java/testData/SurathPlannedCompletedStoryPoint.xlsx");
        XSSFWorkbook workbook = new XSSFWorkbook(file);
        Sheet sh = workbook.getSheet("Sheet1");
        int rowCount = sh.getLastRowNum()-sh.getFirstRowNum();
        for (int i = 0; i < rowCount+1; i++) {
            Row row = sh.getRow(i);
            for (int j = 0; j < row.getLastCellNum(); j++) {
                System.out.print(row.getCell(j).getStringCellValue()+"|| ");
            }
            System.out.println();
        }
    }
}
