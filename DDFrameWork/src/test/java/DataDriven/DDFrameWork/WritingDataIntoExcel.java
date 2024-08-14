package DataDriven.DDFrameWork;

import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WritingDataIntoExcel {

	public static void main(String[] args) throws IOException {
		FileOutputStream file=new FileOutputStream(System.getProperty("user.dir")+"\\testData\\WritingDataIntoExcekl.xlsx");
		XSSFWorkbook workbook=new XSSFWorkbook();
		XSSFSheet sheet=workbook.createSheet("sheet1");
		XSSFRow row =sheet.createRow(0);
		row.createCell(0).setCellValue("gorre");
		row.createCell(1).setCellValue("ganga");
		row.createCell(2).setCellValue("kukka");
		XSSFRow row1 =sheet.createRow( 1);
		row1.createCell(0).setCellValue("gorre");
		row1.createCell(1).setCellValue("ganga");
		row1.createCell(2).setCellValue("kukka");
		XSSFRow row2 =sheet.createRow(2);
		row2.createCell(0).setCellValue("gorre");
		row2.createCell(1).setCellValue("ganga");
		row2.createCell(2).setCellValue("kukka");
		
		XSSFRow row7 =sheet.createRow(10);
		row2.createCell(12).setCellValue("gorreGova");
		
      workbook.write(file);
      workbook.close();
     file.close();
  System.out.println("file is created");
	}

}
