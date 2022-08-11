package dbmanager;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import dbmanager.DBConnectionManager;

public class DBManager {

	/*
	 * Database: db_autofrat Username: akashdktyagi Email: akashdktyagi@gmail.com
	 * The host name to access the server is db4free.net and the port is 3306. You
	 * can use phpMyAdmin on our website to log in to the server.
	 * https://www.db4free.net/
	 * 
	 */

	public static void FetchDataFromDB(String query) throws Exception {
		 
		//String url = "jdbc:ucanaccess://E:\\_AkashStuff\\Automation\\EclipseWorkspace\\AutomationPoCCucumber\\src\\test\\resources\\dbtable\\mySQL.accdb";
		String url = "jdbc:mysql://db4free.net:3306/db_autofrat?user=akashdktyagi&password=akashdktyagi";
		DBConnectionManager DBInstance = DBConnectionManager.getInstance(url);
		Connection conn = DBInstance.getConnection();
		Statement stat = conn.createStatement();
		ResultSet rs = stat.executeQuery(query);
 
		
		ResultSetMetaData rsmd = rs.getMetaData();
		int columnsNumber = rsmd.getColumnCount();
		while (rs.next()) {
		    for (int i = 1; i <= columnsNumber; i++) {
		        if (i > 1) System.out.print(",  ");
		        String columnValue = rs.getString(i);
		        System.out.print(columnValue + " " + rsmd.getColumnName(i));
		    }
		    System.out.println("");
		}
}
}
