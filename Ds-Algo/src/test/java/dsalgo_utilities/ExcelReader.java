package dsalgo_utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelReader {
	
	
	public static List<Map<String, String>> readExcelSheet() throws IOException{
		List<Map<String, String>> arraylist = new ArrayList<Map<String,String>>();
		String path = System.getProperty("user.dir")+"/src/test/resources/TestData/registerUserName.xlsx";
        File Excelfile = new File(path);
		FileInputStream Fis = new FileInputStream(Excelfile);
		XSSFWorkbook workbook = new XSSFWorkbook(Fis);
		XSSFSheet sheet = workbook.getSheet("Sheet1");
		Iterator<Row> rowIterator = sheet.rowIterator();
		 
		while(rowIterator.hasNext()) {
			Row currRow = rowIterator.next();
			HashMap<String, String> row1 = new HashMap<String, String>();
			row1.put("username", currRow.getCell(0).getStringCellValue());
			row1.put("password", currRow.getCell(1).getStringCellValue());
			row1.put("confirm_password", currRow.getCell(2).getStringCellValue());
			
			arraylist.add(row1);
			Iterator<Cell> cell = currRow.cellIterator();
			}
		return arraylist;
		}
		
	public static List<Map<String, String>> readExcelSheet(String SheetName) throws IOException{
		List<Map<String, String>> arraylist = new ArrayList<Map<String,String>>();
		String path = System.getProperty("user.dir")+"/src/test/resources/TestData/registerUserName.xlsx";
        File Excelfile = new File(path);
		FileInputStream Fis = new FileInputStream(Excelfile);
		XSSFWorkbook workbook = new XSSFWorkbook(Fis);
		XSSFSheet sheet = workbook.getSheet(SheetName);
		Iterator<Row> rowIterator = sheet.rowIterator();
		 
		while(rowIterator.hasNext()) {
			Row currRow = rowIterator.next();
			HashMap<String, String> row1 = new HashMap<String, String>();
			row1.put("username", currRow.getCell(0).getStringCellValue());
			row1.put("password", currRow.getCell(1).getStringCellValue());			
			arraylist.add(row1);
//			Iterator<Cell> cell = currRow.cellIterator();
			}
		return arraylist;
		}
public static List<Map<String, String>> readExcelSheetFortexteditor(String SheetName) throws IOException{
		List<Map<String, String>> arraylist = new ArrayList<Map<String,String>>();
		String path = System.getProperty("user.dir")+"/src/test/resources/TestData/registerUserName.xlsx";
        File Excelfile = new File(path);
		FileInputStream Fis = new FileInputStream(Excelfile);
		XSSFWorkbook workbook = new XSSFWorkbook(Fis);
		XSSFSheet sheet = workbook.getSheet(SheetName);
		Iterator<Row> rowIterator = sheet.rowIterator();
		 
		while(rowIterator.hasNext()) {
			Row currRow = rowIterator.next();
			HashMap<String, String> row1 = new HashMap<String, String>();
			row1.put("invalid_text", currRow.getCell(0).getStringCellValue());
			row1.put("valid_text", currRow.getCell(1).getStringCellValue());			
			arraylist.add(row1);
//			Iterator<Cell> cell = currRow.cellIterator();
			}
		return arraylist;
		}
	

}
