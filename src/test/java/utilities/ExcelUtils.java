package utilities;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtils {

    public static Object[][] getExcelData() throws IOException {

        FileInputStream file =
                new FileInputStream("testdata.xlsx");

        Workbook workbook = new XSSFWorkbook(file);

        Sheet sheet = workbook.getSheet("Users");

        int rowCount = sheet.getLastRowNum();

        int colCount = sheet.getRow(0).getLastCellNum();

        Object[][] data = new Object[rowCount][colCount];

        for (int i = 1; i <= rowCount; i++) {

            Row row = sheet.getRow(i);

            for (int j = 0; j < colCount; j++) {

                data[i - 1][j] =
                        row.getCell(j).toString();
            }
        }

        workbook.close();

        return data;
    }
}