package pack1;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WriteExcelDataBlankCells 
{
	public static void main(String[] args) throws IOException, InvalidFormatException
	{
		String path="D:\\ExcelSheet.xlsx";
	//	File f=new File(path);
		FileInputStream file=new FileInputStream(path);   //to write the data into excel
		XSSFWorkbook wb=new XSSFWorkbook(file);
		XSSFSheet sh1=wb.getSheet("Sheet1");
		
		
		XSSFRow row = sh1.createRow(4);
		XSSFCell cell = row.createCell(0);
		
		FileOutputStream file2=new FileOutputStream(path);
	
		int dataToSend=456;
		String stringDataToSend="Data in new cell";
		cell.setCellValue(dataToSend);
		wb.write(file2);
		
		wb.close();
		
		System.out.println("Completed");
		
		
	}
	
}
