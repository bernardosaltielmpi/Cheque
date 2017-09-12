package view;

import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;

@SuppressWarnings("serial")
public class FrmCheque extends JFrame {

	private JPanel contentPane;
	private JTextField txtNome;
	private JTextField txtValor;
	private JTextField txtData;
	private JTextField txtBomPara;
	private JTextField txtBanco;
	private JTextField txtRecebidoEm;
	private JTextField txtRepassadoEm;
	private JLabel lblTitular;
	private JTextField txtDescricao;
	private JTextField txtAgencia;
	private JTextField txtConta;

	
	public FrmCheque() {
		setTitle("Cadastro Cheques");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 513, 401);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNumero = new JLabel("Numero:");
		lblNumero.setBounds(10, 11, 86, 14);
		contentPane.add(lblNumero);
		
		txtNome = new JTextField();
		txtNome.setBounds(89, 8, 150, 20);
		contentPane.add(txtNome);
		txtNome.setColumns(10);
		
		JLabel lblValorR = new JLabel("Valor R$");
		lblValorR.setBounds(275, 11, 79, 14);
		contentPane.add(lblValorR);
		
		txtValor = new JTextField();
		txtValor.setBounds(364, 8, 123, 20);
		contentPane.add(txtValor);
		txtValor.setColumns(10);
		
		JLabel lblData = new JLabel("Data:");
		lblData.setBounds(10, 39, 69, 14);
		contentPane.add(lblData);
		
		txtData = new JTextField();
		txtData.setBounds(89, 36, 150, 20);
		contentPane.add(txtData);
		txtData.setColumns(10);
		
		JLabel lblBomPara = new JLabel("Bom para");
		lblBomPara.setBounds(275, 39, 100, 14);
		contentPane.add(lblBomPara);
		
		txtBomPara = new JTextField();
		txtBomPara.setBounds(364, 36, 123, 20);
		contentPane.add(txtBomPara);
		txtBomPara.setColumns(10);
		
		JLabel lblBanco = new JLabel("Banco:");
		lblBanco.setBounds(10, 70, 69, 14);
		contentPane.add(lblBanco);
		
		txtBanco = new JTextField();
		txtBanco.setBounds(74, 67, 108, 20);
		contentPane.add(txtBanco);
		txtBanco.setColumns(10);
		
		JLabel lblRecebidoEm = new JLabel("Recebido em:");
		lblRecebidoEm.setBounds(305, 154, 86, 14);
		contentPane.add(lblRecebidoEm);
		
		txtRecebidoEm = new JTextField();
		txtRecebidoEm.setBounds(401, 151, 86, 20);
		contentPane.add(txtRecebidoEm);
		txtRecebidoEm.setColumns(10);
		
		JLabel lblRepassadoEm = new JLabel("Repassado em:");
		lblRepassadoEm.setBounds(10, 209, 114, 14);
		contentPane.add(lblRepassadoEm);
		
		txtRepassadoEm = new JTextField();
		txtRepassadoEm.setBounds(134, 206, 86, 20);
		contentPane.add(txtRepassadoEm);
		txtRepassadoEm.setColumns(10);
		
		lblTitular = new JLabel("Titular:");
		lblTitular.setBounds(10, 98, 66, 14);
		contentPane.add(lblTitular);
		
		JComboBox comboTitular = new JComboBox();
		comboTitular.setBounds(74, 95, 413, 20);
		contentPane.add(comboTitular);
		
		JLabel lblRecebidoDe = new JLabel("Recebido de:");
		lblRecebidoDe.setBounds(10, 123, 100, 14);
		contentPane.add(lblRecebidoDe);
		
		JComboBox comboRecebidoDe = new JComboBox();
		comboRecebidoDe.setBounds(106, 120, 381, 20);
		contentPane.add(comboRecebidoDe);
		
		JLabel lblStatus = new JLabel("Status ");
		lblStatus.setBounds(10, 278, 46, 14);
		contentPane.add(lblStatus);
		
		JComboBox comboStatus = new JComboBox();
		comboStatus.setModel(new DefaultComboBoxModel(new String[] {"Selecione...", "AGUARDANDO DEPOSITO", "COMPENSADO", "REPASSADO", "DEVOLVIDO", "Motivo 11:  sem fundos \u2013 primeira apresenta\u00E7\u00E3o", "Motivo 12:  sem fundos \u2013 segunda apresenta\u00E7\u00E3o", "Motivo 13: Conta encerrada", "Motivo 14: Pr\u00E1tica esp\u00FAria", "Motivo 20:  sustado ou revogado por motivo de perda, furto ou roubo.", "Motivo 21:  sustado ou revogado", "Motivo 22: Diverg\u00EAncia ou insufici\u00EAncia da assinatura", "Motivo 23: emitidos por entidades e \u00F3rg\u00E3os da administra\u00E7\u00E3o p\u00FAblica", "Motivo 24: Bloqueio judicial ou determina\u00E7\u00E3o do Banco Central do Brasil", "Motivo 25: Cancelamento do talon\u00E1rio pelo banco", "Motivo 26: Inoper\u00E2ncia tempor\u00E1ria de transporte", "Motivo 27: Feriado municipal n\u00E3o previsto, fora do calend\u00E1rio", "Motivo 28:  sustado ou cancelado em virtude de furto, roubo ou extravio.", "Motivo 29:  bloqueado ", "Motivo 30: Furto ou roubo de malotes", "Motivo 70: Susta\u00E7\u00E3o ou revoga\u00E7\u00E3o provis\u00F3ria3. Em caso de  com irregularidade:", "Motivo 31: Erro formal ", "Motivo 33: Diverg\u00EAncia de endosso", "Motivo 34:  sem o endosso-mandato.", "Motivo 35:  fraudado, com adultera\u00E7\u00E3o da pra\u00E7a sacada", "Motivo 37: Registro inconsistente", "Motivo 38: Assinatura digital ausente ou inv\u00E1lida", "Motivo 39: Imagem fora do padr\u00E3o", "Motivo 40: Moeda inv\u00E1lida", "Motivo 41:  apresentado a participante que n\u00E3o o destinat\u00E1rio", "Motivo 42:  n\u00E3o compens\u00E1vel na sess\u00E3o ou sistema de compensa\u00E7\u00E3o em que apresentado", "Motivo 43:  devolvido anteriormente", "Motivo 44:  prescrito ", "Motivo 45:  emitido por entidade ", "Motivo 48:  acima de R$ 100,00 sem a indica\u00E7\u00E3o do favorecido", "Motivo 49: Remessa nula,", "Motivo 59: Informa\u00E7\u00E3o essencial faltante ou inconsistente ", "Motivo 60: Padr\u00E3o monet\u00E1rio n\u00E3o definido", "Motivo 61: Documento n\u00E3o compens\u00E1vel, podendo sua devolu\u00E7\u00E3o ocorrer a qualquer tempo", "Motivo 64: Arquivo l\u00F3gico n\u00E3o processado ou processado parcialmente.", "Motivo 70: Susta\u00E7\u00E3o ou revoga\u00E7\u00E3o provis\u00F3ria"}));
		comboStatus.setBounds(66, 275, 421, 20);
		contentPane.add(comboStatus);
		
		JLabel lblDescrio = new JLabel("Descri\u00E7\u00E3o:");
		lblDescrio.setBounds(10, 148, 86, 14);
		contentPane.add(lblDescrio);
		
		txtDescricao = new JTextField();
		txtDescricao.setBounds(89, 148, 206, 20);
		contentPane.add(txtDescricao);
		txtDescricao.setColumns(10);
		
		JLabel lblAgencia = new JLabel("Agencia");
		lblAgencia.setBounds(192, 70, 69, 14);
		contentPane.add(lblAgencia);
		
		txtAgencia = new JTextField();
		txtAgencia.setBounds(249, 67, 99, 20);
		contentPane.add(txtAgencia);
		txtAgencia.setColumns(10);
		
		JLabel lblConta = new JLabel("Conta");
		lblConta.setBounds(359, 70, 65, 14);
		contentPane.add(lblConta);
		
		txtConta = new JTextField();
		txtConta.setBounds(401, 67, 86, 20);
		contentPane.add(txtConta);
		txtConta.setColumns(10);
		
		JButton btnGravar = new JButton("Gravar");
		btnGravar.setBounds(398, 328, 89, 23);
		contentPane.add(btnGravar);
		
		JLabel lblRepassadoPara = new JLabel("Repassado Para:");
		lblRepassadoPara.setBounds(10, 234, 114, 14);
		contentPane.add(lblRepassadoPara);
		
		JComboBox comboRepassadoPara = new JComboBox();
		comboRepassadoPara.setBounds(123, 231, 364, 20);
		contentPane.add(comboRepassadoPara);
	}
}
