package model.jdbc;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnectionFactory {
	
	static private DBConnectionFactory dbConnectionFactory = null;
	
	private final String URL = "jdbc:mysql://localhost/stocks?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC&useSSL=false&useServerPrepStmts=false&rewriteBatchedStatements=true";
	private final String user = "root";
	private final String pass = "rootpass";
	
	private DBConnectionFactory(){
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	public static DBConnectionFactory get(){
		if (dbConnectionFactory == null) {
		synchronized (DBConnectionFactory.class) {
			if (dbConnectionFactory == null)
				dbConnectionFactory = new DBConnectionFactory();
		}
	}
		return dbConnectionFactory;
	}
	
	public Connection getConnection() throws SQLException {
		return DriverManager.getConnection(URL, user, pass);
	}
	
}
