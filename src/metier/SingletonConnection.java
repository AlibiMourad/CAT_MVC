package metier;

import java.sql.Connection;
import java.sql.DriverManager;

public class SingletonConnection {

	private static Connection connection;

	static {
		try {
			Class.forName("com.jdbc.mysql.Driver");
			connection = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/CAT_PROD", "root", "");
		} catch (Exception e) {

			e.printStackTrace();
		}
	}

	public static Connection getConnection() {
		return connection;
	}

}
