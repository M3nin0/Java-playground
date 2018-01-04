package view;

import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPopupMenu;

import controller.MenuController;

public class MenuView {

	public JFrame frame;
	private MenuController menuController;
	

	public MenuView(MenuController menuController) {
		this.menuController = menuController;
		initialize();
	}

	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 538, 194);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		JButton btnVisualizarClientesCadastrados = new JButton("Visualizar clientes cadastrados");
		btnVisualizarClientesCadastrados.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnVisualizarClientesCadastrados.setBounds(122, 94, 285, 25);
		frame.getContentPane().add(btnVisualizarClientesCadastrados);

		JButton btnCadastrarClientes = new JButton("Cadastrar clientes");
		btnCadastrarClientes.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				menuController.cadastroCliente.setVisible(true);
			}
		});
		btnCadastrarClientes.setBounds(122, 57, 285, 25);
		frame.getContentPane().add(btnCadastrarClientes);
	}

	private static void addPopup(Component component, final JPopupMenu popup) {
		component.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				if (e.isPopupTrigger()) {
					showMenu(e);
				}
			}

			public void mouseReleased(MouseEvent e) {
				if (e.isPopupTrigger()) {
					showMenu(e);
				}
			}

			private void showMenu(MouseEvent e) {
				popup.show(e.getComponent(), e.getX(), e.getY());
			}
		});
	}
}
