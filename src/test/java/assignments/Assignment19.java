//package assignments;
//
//import java.io.FileInputStream;
//
//import org.apache.poi.xssf.usermodel.XSSFSheet;
//import org.apache.poi.xssf.usermodel.XSSFWorkbook;
//
//public class Assignment19 {
//
//	public static String[][] readData(String fileName, String sheetName){
//		
//		String[][] data = null;
//		
//		try {
//		
//		FileInputStream fis = new FileInputStream(System.getProperty("user.dir")+"\\TestData\\"+fileName);
//		
//		XSSFWorkbook wb = new XSSFWorkbook(fis);
//		
//		XSSFSheet sh = wb.getSheet(sheetName);
//		
//		int totalRows = sh.getPhysicalNumberOfRows();
//		int totalColomns = sh.getRow(0).getPhysicalNumberOfCells();
//		
//		//creating 2d array to store the data
//		data = new String [totalRows][totalColomns];
//		
//		for(int r = 0 ;r <totalRows ; r++) {
//
//			for(int c= 0; c<totalColomns ; c++) {
//				
//				data[r][c] = sh.getRow(r).getCell(c).getStringCellValue(); 
//			}
//		}
//		
//		}catch(Exception e) {
//			e.printStackTrace();
//		}
//		
//		
//		return data;
//		
//	}
//}
