package excel;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WriteDataByNumber {

	public static void main(String[] args) throws Exception
	{
		File f = new File("C:\\Personal\\Vijay\\Personal_Do_Not_Open\\NIT\\testdata1.xlsx");
		FileInputStream fis = new FileInputStream(f);
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		XSSFSheet sheet = wb.getSheet("login");
		XSSFRow row = sheet.getRow(1);
		XSSFCell cell = row.getCell(4);
		FileOutputStream fos = new FileOutputStream(f);
		cell.setCellValue("Failed");
		
		wb.write(fos);
		wb.close();
		fos.close();
	}

}
