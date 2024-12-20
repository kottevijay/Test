package excel;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadDataByNumber {

	public static void main(String[] args) throws Exception 
	{
		File f = new File ("C:\\Personal\\Vijay\\Personal_Do_Not_Open\\NIT\\testdata1.xlsx");
		FileInputStream fis = new FileInputStream(f);
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		XSSFSheet sheet = wb.getSheet("login");
		XSSFRow row = sheet.getRow(4);
		XSSFCell cell = row.getCell(2);
		String val = cell.getStringCellValue();
		System.out.println(val);
		wb.close();
		fis.close();
	}

}
