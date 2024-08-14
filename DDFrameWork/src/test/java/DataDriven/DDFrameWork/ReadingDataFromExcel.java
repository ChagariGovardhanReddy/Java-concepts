package DataDriven.DDFrameWork;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadingDataFromExcel {

	public static void main(String[] args) throws IOException {
		FileInputStream file= new FileInputStream(System.getProperty("user.dir")+"\\testData\\data.xlsx");
		XSSFWorkbook workbook=new XSSFWorkbook(file);
        XSSFSheet sheet=workbook.getSheet("Sheet1");
        int totalRows=sheet.getLastRowNum();
        int totalColumns=sheet.getRow(1).getLastCellNum();
       for(int r=0;r<=totalRows;r++) {
    	  XSSFRow currentRow=sheet.getRow(r);
    	   for(int c=0;c<totalColumns;c++) {
    		   XSSFCell cell = currentRow.getCell(c);
    		   System.out.print(cell.toString()+"\t");
    	   }
    	   System.out.println();
       }
       workbook.close();
       file.close();
        
		

	}

}
