package tests;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;

import utilities.DBUtil;

public class ReadDB {

	public static void main(String[] args) throws SQLException {

		List<Map<String, String>> data = DBUtil.readData(DBQueries.HORROR_MOVIE_LIST);
		
		System.out.println(data);
		
		//System.out.println(data.get(1).get("Movie_Name"));
	}

}
