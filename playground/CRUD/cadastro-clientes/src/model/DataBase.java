package model;

import java.sql.Connection;
import java.sql.SQLException;

public interface DataBase {

	String host = "127.0.0.1";
	String port = "3306";
	String dataBaseName = "cliente_prod";
	String user = "root";
	String password = "123";

	Connection testeConnect() throws SQLException;
}
