package view;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import controller.ClienteController;

@SuppressWarnings("serial")
public class CadastroClienteView extends JFrame {

	private JPanel contentPane;
	private JTextField txtNome;
	private JTextField txtCpf;
	private JTextField txtProfissao;
	private JTextField txtNacionalidade;
	private JTextField txtEndereco;
	

	@SuppressWarnings("unused")
	private void flushFields() {
		txtNome.setText("");
		txtProfissao.setText("");
		txtCpf.setText("");
		txtEndereco.setText("");
		txtNacionalidade.setText("");
	}

	public CadastroClienteView(ClienteController clienteController) {
		
		setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		
		setBounds(100, 100, 403, 414);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		txtNome = new JTextField();
		txtNome.setFont(new Font("Dialog", Font.PLAIN, 13));
		txtNome.setBounds(164, 36, 197, 25);
		contentPane.add(txtNome);
		txtNome.setColumns(10);

		txtCpf = new JTextField();
		txtCpf.setBounds(164, 96, 197, 25);
		contentPane.add(txtCpf);
		txtCpf.setColumns(10);

		txtProfissao = new JTextField();
		txtProfissao.setBounds(164, 153, 197, 25);
		contentPane.add(txtProfissao);
		txtProfissao.setColumns(10);

		JLabel lblNome = new JLabel("Nome");
		lblNome.setFont(new Font("Droid Sans", Font.BOLD, 14));
		lblNome.setBounds(46, 48, 70, 15);
		contentPane.add(lblNome);

		JLabel lblProfissao = new JLabel("Profissão");
		lblProfissao.setFont(new Font("Droid Sans", Font.BOLD, 14));
		lblProfissao.setBounds(46, 101, 70, 15);
		contentPane.add(lblProfissao);

		JLabel lblCpf = new JLabel("CPF");
		lblCpf.setFont(new Font("Droid Sans", Font.BOLD, 14));
		lblCpf.setBounds(46, 158, 70, 15);
		contentPane.add(lblCpf);

		JButton btnCadastrar = new JButton("Cadastrar");
		btnCadastrar.setFont(new Font("Droid Sans", Font.BOLD, 14));
		btnCadastrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {

					if (txtNome.getText().trim().equals("") || txtProfissao.getText().trim().equals("")
							|| txtCpf.getText().trim().equals("") || txtEndereco.getText().trim().equals("")
							|| txtNacionalidade.getText().trim().equals("")) {
						JOptionPane.showMessageDialog(null, "Todos os campos devem ser preenchidos");
					} else {
						clienteController.cadastraCliente(txtNome.getText(), txtProfissao.getText(), txtCpf.getText(),
								txtEndereco.getText(), txtNacionalidade.getText());
						JOptionPane.showMessageDialog(null, "Os dados foram cadastrados com sucesso!");
						int chose = JOptionPane.showConfirmDialog(null, "Cadastrar novamente ?",
								"Deseja realizar outros cadastros ?", JOptionPane.YES_NO_OPTION);

						if (chose == JOptionPane.YES_OPTION) {
							flushFields();
						} else {
							setVisible(false);
						}
					}

				} catch (SQLException e1) {
					JOptionPane.showMessageDialog(null, "Erro ao tentar realizar conexão com banco de dados");
				}
			}
		});
		btnCadastrar.setBounds(138, 338, 117, 25);
		contentPane.add(btnCadastrar);

		JLabel lblNacionalidade = new JLabel("Nacionalidade");
		lblNacionalidade.setFont(new Font("Droid Sans", Font.BOLD, 14));
		lblNacionalidade.setBounds(46, 254, 117, 15);
		contentPane.add(lblNacionalidade);

		JLabel lblEndereo = new JLabel("Endereço");
		lblEndereo.setFont(new Font("Droid Sans", Font.BOLD, 14));
		lblEndereo.setBounds(46, 205, 70, 15);
		contentPane.add(lblEndereo);

		txtNacionalidade = new JTextField();
		txtNacionalidade.setBounds(164, 249, 197, 25);
		contentPane.add(txtNacionalidade);
		txtNacionalidade.setColumns(10);

		txtEndereco = new JTextField();
		txtEndereco.setBounds(164, 200, 197, 25);
		contentPane.add(txtEndereco);
		txtEndereco.setColumns(10);
	}
}
