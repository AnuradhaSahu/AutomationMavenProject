package utilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtil2DArray {

	public static String[][] readExcelData(String fileName, String sheetName){
		
		String[][] data = null;
		
		try {
			FileInputStream fis = new FileInputStream(System.getProperty("user.dir")+"\\config\\"+fileName);
			
			XSSFWorkbook wb = new XSSFWorkbook(fis);
			
			XSSFSheet sh = wb.getSheet(sheetName);
			
			int totalRows = sh.getPhysicalNumberOfRows();
			int totalColomns = sh.getRow(0).getPhysicalNumberOfCells();
			
			//create a 2D array to store the data
			data = new String[totalRows][totalColomns];
			
			//loop to iterate over rows
			
			for(int r = 0 ; r < totalRows ;r++) {
				
				//loop to iterate over colomns
				
				for(int c = 0; c <totalColomns ; c++ ) {
					
					data[r][c] = sh.getRow(0).getCell(c).getStringCellValue(); 
				}

			}
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		return data;
		
	}
}
