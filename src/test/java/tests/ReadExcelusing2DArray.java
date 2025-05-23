package tests;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import utilities.ExcelUtil2DArray;

public class ReadExcelusing2DArray {

	public static void main(String[] args) {

		List<Map<String, String>> data = new ArrayList<Map<String, String>>();
		
		System.out.println(data);
		
		for(Map<String, String> row : data) {
			System.out.println(row);
		}
		
		String  [][] testData = ExcelUtil2DArray.readExcelData("Collections Assignment.xlsx", "Sheet1");
		
		System.out.println(testData[1][1]);
	}

}
