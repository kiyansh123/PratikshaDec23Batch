package utilities;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelOperations
{
	public static String readData(String path,String sheetName,int rowIndex, int cellIndex) throws IOException
	{
	//	String path="\\D:\\ExcelSheet.xlsx\\";
		FileInputStream file=new FileInputStream(path);     //to let java know about the file path
		XSSFWorkbook wb=new XSSFWorkbook(file);        //load/open the file
	   XSSFSheet sh=wb.getSheet(sheetName);       //opening the sheet in excel
	   XSSFRow row = sh.getRow(rowIndex);        //to get the row
	  XSSFCell cell = row.getCell(cellIndex);       //to get the cell
	
	String data=cell.getStringCellValue();    //to get the data in string forat from cell
    System.out.println(data);
//	double data2 = cell.getNumericCellValue();     //to get the data in numeric from cell
	//System.out.println(data2);
	wb.close();
		return data;
	}
}
