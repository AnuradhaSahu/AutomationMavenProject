package utilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class PropUtil {
	
	public static Properties readData(String fileName) {
		
		//Properties prop = null; This is also fine  or we can create object directy
		Properties prop = new Properties();
		
		//read the file using java
		try {
			FileInputStream fis = new FileInputStream(System.getProperty("user.dir")+"\\config\\"+fileName);
			//load all the properties available into the property variable
			prop = new Properties();			
			prop.load(fis);
			
		}catch(FileNotFoundException e) {// when we dont get file 
			e.printStackTrace();
		}
		catch (IOException e) {// when ever we are reading the data and performing input output operations in java then we might get this exception
				e.printStackTrace();
		}		
		return prop;
		
	}

}
