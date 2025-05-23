package utilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtil {
	
	public static List<Map<String, String>> readData(String fileName, String sheetName){
		
		List<Map<String, String >> data = new ArrayList<Map<String, String >>();
		
		//read the excel file using java
		try {
			FileInputStream fis = new FileInputStream(System.getProperty("user.dir")+"\\TestData\\"+fileName);
			
			//load the file into excel class
			XSSFWorkbook wb = new XSSFWorkbook(fis);
			
			//read the data from a specific sheet
			XSSFSheet sh = wb.getSheet(sheetName);
			
			//get the total rows and colomns having data
			int totalRows = sh.getPhysicalNumberOfRows();
			
			int totalColmns = sh.getRow(0).getPhysicalNumberOfCells();
			
			//create a loop and load row wise data (Colomn name = colomn data) into maps and store them into list
			
			//loop to iterate over rows
			for(int  r= 1; r < totalRows ; r++) {
				
				Map<String, String> rowData = new HashMap<String, String>();
				
				//Loop to iterate over colomns
				for(int c=0; c < totalColmns ; c++) {
					
					String colomnName = sh.getRow(0).getCell(c).getStringCellValue();
					String ColomnValue = sh.getRow(r).getCell(c).getStringCellValue();
					
					rowData.put(colomnName, ColomnValue);
				}
				
				data.add(rowData);
			}
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		return data;
		
	}


}
