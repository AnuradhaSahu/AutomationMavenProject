package utilities;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DBUtil {

	//common method to connect with DB- postgresql and get the raw data
	public static ResultSet getData( String query ) throws SQLException {
		
		ResultSet dataSet = null;
		
		String db_url = "jdbc:postgresql://localhost:5432/dvdshop";//localhost:5432/dvdshop
		String db_user = "postgres";		
		String db_password = "admin";		
		
		//connection is established
		Connection connection = DriverManager.getConnection(db_url , db_user, db_password);
		
		//create the query and execute the query 
		dataSet = connection.createStatement().executeQuery(query); // raw data in xml format
			
		return dataSet;
		
	}
	
	//common method to convert the data into hashmap
	public static List<Map<String, String>> readData(String query) throws SQLException{
		
		List<Map<String, String>> datalist = new ArrayList<Map<String, String>>();
			
			//get the raw data from Db
			ResultSet dataSet = getData(query);
			
			//copy the raw data into list of hashmap
			while(dataSet.next()) {
				
				Map< String, String > rowData = new HashMap<String, String>();
				for(int c=1; c <= dataSet.getMetaData().getColumnCount(); c++ ) {
				
					String colomnName = dataSet.getMetaData().getColumnName(c);
					String colomnValue = dataSet.getString(c);
					rowData.put(colomnName, colomnValue);
				}
				datalist.add(rowData);
			}
				
		return datalist;
		
	}
}
