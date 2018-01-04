package controller;

import java.sql.SQLException;

import javax.swing.JOptionPane;

import view.CadastroClienteView;

public class MenuController {

	ClienteController clienteController;
	public CadastroClienteView cadastroCliente;

	public MenuController() {

		try {
			clienteController = new ClienteController();
		} catch (SQLException e) {
			JOptionPane.showMessageDialog(null, "Erro ao iniciar a comunicação com o banco de dados");
		}
		cadastroCliente = new CadastroClienteView(clienteController);

	}
}
