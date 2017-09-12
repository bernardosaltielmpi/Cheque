package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import controll.Database;
import controll.MySql_Pessoas;
import model.Pessoa;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.awt.event.ActionEvent;

public class FrmPessoas extends JFrame {

	private JPanel contentPane;
	private JTextField txtNome;
	private JTextField txtTelefone;
	public FrmPessoas() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setTitle("Cadastro Pessoas");
		setBounds(100, 100, 389, 218);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNome = new JLabel("Nome:");
		lblNome.setBounds(10, 29, 46, 14);
		contentPane.add(lblNome);
		
		txtNome = new JTextField();
		txtNome.setBounds(72, 26, 283, 20);
		contentPane.add(txtNome);
		txtNome.setColumns(10);
		
		JLabel lblTelefone = new JLabel("Telefone:");
		lblTelefone.setBounds(10, 54, 63, 14);
		contentPane.add(lblTelefone);
		
		txtTelefone = new JTextField();
		txtTelefone.setBounds(72, 51, 283, 20);
		contentPane.add(txtTelefone);
		txtTelefone.setColumns(10);
		
		JLabel lblEndereo = new JLabel("Endere\u00E7o:");
		lblEndereo.setBounds(10, 79, 63, 14);
		contentPane.add(lblEndereo);
		
		JTextArea txtEndereco = new JTextArea();
		txtEndereco.setBounds(72, 74, 283, 63);
		contentPane.add(txtEndereco);
		
		JButton btnGravar = new JButton("Gravar");
		btnGravar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String nome = txtNome.getText();
				
				if (nome.equalsIgnoreCase("")) {
					JOptionPane.showMessageDialog(null, "Nome precisa ser preenchido!");
					return;
				}
				
				String telefone = txtTelefone.getText();
				
				String endereco = txtEndereco.getText();
				
				Pessoa p = new Pessoa();
				
				p.setNome(nome);
				p.setEndereco(endereco);
				p.setTelefone(telefone);
				
				try {
					MySql_Pessoas.getInserePessoa(nome, telefone, endereco);
					JOptionPane.showMessageDialog(null, "Operacao Concluida");
					dispose();
				} catch (SQLException e1) {
					JOptionPane.showMessageDialog(null, "PROBLEMA NA GRAVACAO DO REGISTRO NO BANCO DE DADOS \n"
							+ "VERIFIQUE A CONEXAO COM A INTERNET ");
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
			
				
			}
		});
		btnGravar.setBounds(266, 148, 89, 23);
		contentPane.add(btnGravar);
	}
}
