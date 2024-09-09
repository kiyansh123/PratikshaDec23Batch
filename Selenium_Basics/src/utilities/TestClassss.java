package utilities;

import java.io.IOException;
import utilities.ExcelOperations;

public class TestClassss
{
	public static void main(String[] args) throws IOException
	{
	    String path=System.getProperty("user.dir") + "\\TestData\\ExcelSheet.xlsx";
		//String path="\\\\D:\\\\ExcelSheet.xlsx\\\\";
		String sheetName="Sheet1";
		int row=4;
		int cell=0;
		
		String dataFromExcel = ExcelOperations.readData(path, "sheetName", row, cell);
	 
		System.out.println(dataFromExcel);
	}
}
