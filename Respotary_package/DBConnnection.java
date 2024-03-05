package Respotary_package;

import java.sql.*;
import java.util.Properties;

import Helper_package.PathHelper;

public class DBConnnection {

	protected PreparedStatement stmt;
	protected ResultSet rs;
	protected Connection con;

	public DBConnnection() {
		// Properties p = new Properties();
		PathHelper path = new PathHelper();

		try {
			Class.forName(path.p.getProperty("Driver"));
			con = DriverManager.getConnection(path.p.getProperty("Url"), path.p.getProperty("User"),
					path.p.getProperty("Pass"));

			// con = DriverManager.getConnection("jdbc:mysql://localhost:3306/MessManagementSystem","root","[mysql9175]");
			
			if (con != null) {
				System.out.println("Connection have built succesfully ....");
			}
		} catch (Exception ex) {
			System.out.println("Exception is in DBConnection: " + ex);
		}

	}

}
