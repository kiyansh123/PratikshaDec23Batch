package pack1;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcelData
{
	public static void main(String[] args) throws IOException
	{
		String path="\\D:\\ExcelSheet.xlsx\\";
		FileInputStream file=new FileInputStream(path);     //to let java know about the file path
		XSSFWorkbook wb=new XSSFWorkbook(file);        //load/open the file
	   XSSFSheet sh=wb.getSheet("Sheet1");       //opening the sheet in excel
	   XSSFRow row = sh.getRow(1);        //to get the row
	  XSSFCell cell = row.getCell(1);       //to get the cell
	
//	String data=cell.getStringCellValue();    //to get the data in string forat from cell
//	System.out.println(data);
	double data2 = cell.getNumericCellValue();     //to get the data in numeric from cell
	System.out.println(data2);
	wb.close();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
