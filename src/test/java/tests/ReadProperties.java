package tests;

import java.util.Properties;

import utilities.PropUtil;

public class ReadProperties {
	
	public static void main(String[] args) {
		
		Properties prop = PropUtil.readData("config.properties");
		System.out.println(prop.getProperty("APP_URL"));
		System.out.println(prop.getProperty("APP_USER"));
		System.out.println(prop.getProperty("APP_PASS"));

	}

}
