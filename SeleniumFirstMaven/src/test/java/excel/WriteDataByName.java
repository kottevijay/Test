package excel;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WriteDataByName {

	public static void main(String[] args) throws Exception
	
	{
		File f = new File("C:\\Personal\\Vijay\\Personal_Do_Not_Open\\NIT\\testdata1.xlsx");
		FileInputStream fis = new FileInputStream(f);
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		XSSFSheet sheet = wb.getSheet("login");
		XSSFRow row = sheet.getRow(0);
		XSSFCell cell = null;
		
		int cellindex= -1;
		for (int c=0; c<row.getLastCellNum(); c++)
		{
			if (row.getCell(c).getStringCellValue().trim().equals("Result"))
			{
				cellindex = c;
			}
		}
		
		row = sheet.getRow(4);
		cell = row.getCell(cellindex);
		cell.setCellValue("Passed");
		
		FileOutputStream fos = new FileOutputStream(f);
		String val = cell.getStringCellValue();
		System.out.println(val);
		wb.write(fos);
		wb.close();
		fis.close();
	}

}
