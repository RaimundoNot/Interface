package aula7_gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Tela_Pessoa implements ActionListener {

	JFrame tela = new JFrame("Cadastrar Pessoa");

	JPanel painel = new JPanel();

//labels

	JLabel lbnome = new JLabel("Nome: ");

	JLabel lbidade = new JLabel("Idade: ");

	JLabel lbsal = new JLabel("Salário: ");

//campo texto

	JTextField txtnome = new JTextField();

	JTextField txtidade = new JTextField();

	JTextField txtsal = new JTextField();

// botões

	JButton btsalvar = new JButton("Salvar");

	JButton btlistar = new JButton("Listar");

	JButton btcancelar = new JButton("Cancelar");

	String nome = "";

	Double sal = 0.0;

	Integer idade = 0;

	Pessoa pessoa = new Pessoa();

	void criarTela() {

		tela.setSize(400, 300); // tamanho da tela

		painel.setLayout(null);

		tela.setLocation(300, 300);

		lbnome.setBounds(20, 10, 100, 30);

		txtnome.setBounds(100, 10, 150, 30);

		lbidade.setBounds(20, 60, 100, 30);

		txtidade.setBounds(100, 60, 150, 30);

		lbsal.setBounds(20, 110, 100, 30);

		txtsal.setBounds(100, 110, 150, 30);

		btsalvar.setBounds(20, 180, 100, 30);

		btsalvar.addActionListener(this);// ação botão

		btlistar.setBounds(130, 180, 100, 30);

		btlistar.addActionListener(this);

		btcancelar.setBounds(240, 180, 100, 30);

		btcancelar.addActionListener(this);

		painel.add(lbnome);

		painel.add(txtnome);

		painel.add(lbidade);

		painel.add(txtidade);

		painel.add(lbsal);

		painel.add(txtsal);

		painel.add(btsalvar);

		painel.add(btlistar);

		painel.add(btcancelar);

		tela.getContentPane().add(painel);

		tela.setVisible(true);

	}// Fim do criar Tela

	public static void main(String[] args) {

		Tela_Pessoa tp = new Tela_Pessoa();

		tp.criarTela();

	}// Fim main

	@Override

	public void actionPerformed(ActionEvent e) {

		if (e.getSource() == btsalvar) {

			nome = txtnome.getText();

			idade = Integer.parseInt(txtidade.getText());

			sal = Double.parseDouble(txtsal.getText());

			pessoa.setNome(nome);

			pessoa.setIdade(idade);

			pessoa.setSalario(sal);

			JOptionPane.showMessageDialog(null, "Objeto Cadastrado com sucesso !");

			txtnome.setText("");

			txtidade.setText("");

			txtsal.setText("");

		} // fim do if salvar

		if (e.getSource() == btlistar) {

			JOptionPane.showMessageDialog(null, "## Listar Dados ##\n"

					+ "Nome: " + pessoa.getNome()

					+ "\nIdade: " + pessoa.getIdade()

					+ "\nSalário: R$ " + pessoa.getSalario());

		} // fim do if listar

		if (e.getSource() == btcancelar) {

			tela.dispose();

		} // fim do if cancelar

	}

}// Fim class