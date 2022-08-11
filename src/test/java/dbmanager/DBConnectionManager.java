package dbmanager;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnectionManager {
	public static DBConnectionManager instance;
	private Connection conn;
	
	private DBConnectionManager(String url) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			this.conn = DriverManager.getConnection(url);
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public Connection getConnection() {
		return this.conn;
	}

	public static DBConnectionManager getInstance(String url) throws Exception {
		if(instance == null) {
			instance = new DBConnectionManager(url);
		}else if (instance.getConnection().isClosed()) {
			instance = new DBConnectionManager(url);
		}
	return instance;
	}
}
