package Pages;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.IOException;

public class readFromExcel {
    public String[][] read() throws IOException, InvalidFormatException {
        //pass file location
        File myFile=new File("TestData/Guru99-Login-Data.xlsx");
        //define the file as excel file
        XSSFWorkbook wb=new XSSFWorkbook(myFile);
        //define the sheet name in hte excel file
        XSSFSheet sh= wb.getSheet("Sheet1");
        //set variables for the number of column and rows
        int raw_count=sh.getPhysicalNumberOfRows();
        int column_count=sh.getRow(0).getPhysicalNumberOfCells();
        //create array which will store the test data from an excel file
        String[][] mydata=new String[raw_count-1][column_count];
        //loop to get into excel file
        for(int i=1;i<raw_count;i++){
            for (int j=0;j<column_count;j++){
                XSSFRow row=sh.getRow(i);
                mydata[i-1][j]=row.getCell(j).getStringCellValue();

            }
        }
        return mydata;
    }
}
