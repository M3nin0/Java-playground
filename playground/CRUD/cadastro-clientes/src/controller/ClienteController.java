package controller;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import model.ConnectionDB;

public class ClienteController {

	ConnectionDB connDB;
	Connection conn;

	public ClienteController() throws SQLException {
		connDB = new ConnectionDB();
		conn = this.connDB.testeConnect();
	}

	public void cadastraCliente(String nome, String profissao, String cpf, String endereco, String nacionalidade)
			throws SQLException {

		String sqlQuery = "INSERT INTO clientes (nome, profissao, cpf, endereco, nacionalidade)"
				+ " VALUES (?, ?, ?, ?, ?)";

		PreparedStatement stmt = conn.prepareStatement(sqlQuery);
		stmt.setString(1, nome);
		stmt.setString(2, profissao);
		stmt.setString(3, cpf);
		stmt.setString(4, endereco);
		stmt.setString(5, nacionalidade);

		stmt.execute();
	}

	public List<String> recuperaClientes() throws SQLException {

		List<String> users = new ArrayList<>();

		String sqlQuery = "SELECT *  FROM clientes";

		PreparedStatement stmt = conn.prepareStatement(sqlQuery);

		ResultSet rs = stmt.executeQuery();

		while (rs.next()) {
			users.add(rs.toString());
		}

		return users;
	}
}
