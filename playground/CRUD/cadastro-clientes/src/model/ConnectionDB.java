package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionDB implements DataBase {

	@Override
	public Connection testeConnect() throws SQLException {

		Connection conn = null;

		try {
			conn = (Connection) DriverManager.getConnection(
					"jdbc:mysql://" + host + "/" + dataBaseName + "?" + "user=" + user + "&password=" + password);

			return conn;
		} catch (SQLException e) {
			return conn;
		}
	}
}
