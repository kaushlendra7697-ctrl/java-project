package project;

import org.apache.poi.sl.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class excelfile {

    public static void main (String[] args) throws IOException {

        // path excel file
        FileInputStream file = new FileInputStream("E:\\New excel file upload test.xlsx");
        XSSFWorkbook workbook = new XSSFWorkbook(file);

       Sheet sheet = (Sheet) workbook.getSheet("Sheet1");





    }

}
