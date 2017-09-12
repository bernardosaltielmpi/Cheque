package view;

import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

@SuppressWarnings("serial")
public class FrmPrincipal extends JFrame {

	private JPanel contentPane;

	public FrmPrincipal() {
		setTitle("Controle de cheques");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnCadastros = new JMenu("Cadastros");
		menuBar.add(mnCadastros);
		
		JMenuItem mntmCadPessoas = new JMenuItem("Pessoas");
		mntmCadPessoas.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				FrmPessoas f = new FrmPessoas();
				f.setLocationRelativeTo(null);
				f.setVisible(true);
			}
		});
		mnCadastros.add(mntmCadPessoas);
		
		JMenuItem mntmCadCheques = new JMenuItem("Cheques");
		mntmCadCheques.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				FrmCheque c = new FrmCheque();
				c.setVisible(true);
				c.setLocationRelativeTo(null);
			}
		});
		mnCadastros.add(mntmCadCheques);
		
		JMenu mnConsultas = new JMenu("Consultas");
		menuBar.add(mnConsultas);
		
		JMenuItem mntmListaVencimentos = new JMenuItem("Lista Vencimentos");
		mnConsultas.add(mntmListaVencimentos);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
	}
}
