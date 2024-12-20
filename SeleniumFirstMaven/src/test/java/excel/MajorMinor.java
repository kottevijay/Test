package excel;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class MajorMinor {

	public static void main(String[] args) throws Exception 
	
	{
		File f = new File ("C:\\Personal\\Vijay\\Personal_Do_Not_Open\\NIT\\data.xlsx");
		FileInputStream fis = new FileInputStream(f);
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		XSSFSheet sheet = wb.getSheet("people");
		int rowCount = sheet.getLastRowNum();
		System.out.println(rowCount);
		//short colCount = sheet.getRow(0).getLastCellNum();
		//System.out.println(colCount);
		XSSFRow row = sheet.getRow(0);
		XSSFCell Val = null;
		
		String cellindex = null;
		
		for (int c=1; c<=rowCount; c++)
		{
						
			int colCount = sheet.getRow(c).getLastCellNum();
				
				if (row.getCell(colCount).getNumericCellValue()<18)
				{
					cellindex = "Minor";
					Val = row.getCell(colCount);
					Val.setCellValue(cellindex);
				}
				else cellindex = "Major";
				Val = row.getCell(colCount);
				Val.setCellValue(cellindex);
			}
					
		
			
			
	}

}
