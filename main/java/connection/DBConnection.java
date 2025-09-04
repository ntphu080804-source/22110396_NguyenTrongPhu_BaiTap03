package connection;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnection {
	private final String serverName = "LAPTOP-PUEORRNE\\SQLEXPRESS05";
	private final String dbName = "QuanLyWeb";
	private final String portNumber = "1433";
	private final String userID = "sa";
	private final String password = "213456789";

	public Connection getConnection() throws Exception {
        String url = "jdbc:sqlserver://" + serverName + ":" + portNumber 
                   + ";databaseName=" + dbName 
                   + ";encrypt=true;trustServerCertificate=true;";
        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        return DriverManager.getConnection(url, userID, password);
	}
	public static void main(String[] args) {
		try {
			System.out.println(new DBConnection().getConnection());
			System.out.println("helloNha");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
