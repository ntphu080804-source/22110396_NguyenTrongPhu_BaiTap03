package connection;
import java.sql.Connection;
import java.sql.DriverManager;
public class DBConnection {
	public Connection getConnection() throws Exception {
		String serverName = "localhost";
		String dbName = "ServletCRUDMVC";
		String portNumber = "1433";
		String instance = "";  
		String userID = "sa";
		String password = "123456";

		String url = "jdbc:sqlserver://" + serverName + ":" + portNumber;
		if (instance != null && !instance.trim().isEmpty()) {
			url += "\\" + instance;
		}
		url += ";databaseName=" + dbName;

		Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
		return DriverManager.getConnection(url, userID, password);
	}
}
