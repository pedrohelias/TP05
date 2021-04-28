package view;

import java.awt.BorderLayout;


import java.awt.Color;
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumnModel;
import javax.swing.table.TableModel;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import java.awt.Font;
import java.awt.SystemColor;

import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import controller.*;
import model.*;

/**
 * Classe responsável por definir o painel da Lista de Convidados
 * @author pedro
 * @version 1.0
 */

public class PainelLista extends JFrame  implements ActionListener{
	
	
	private JPanel painelLista;
	private JTextField textNome;
	private JTextField textTelefone;
	private JTextField textIdade;
	private JTextField textEmail;
	private JTextField textPresente;
	private JTextField testeVariavel;
	private JLabel labelNome;
	private JLabel labelTelefone;
	private JLabel labelIdade;
	private JLabel labelEmail;
	private JLabel labelPresente; //false para convidados
	private JLabel labelNomeList;
	private JLabel labelEmailList;
	private JLabel labelIDList;
	private JLabel labelTelefoneList;
	private JLabel labelPermissaoList;
	private JLabel labelSubtotal;
	private JTextField teste;
	private JTextArea area;
	private JButton botaoVoltar;
	private JButton botaoAdicionar;
	private JButton botaoget;
	private JButton botaoRetirar;
	private JButton botaoAlterar;
	private Controlador controle;
	private Master master;
	private Convidado convidado;
	private DefaultListModel listaDeProdutos;
	private JList lista;
	private JList lista2;
	private JList lista3;
	private JList lista4;
	private JList lista5;
	private ArrayList<Convidado> list;
	
	
	public PainelLista(Controlador controleDireto) {
		
		controle = controleDireto;
		//abaixo as definições sobre o painel e como ele vai se comportar no frame
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("Painel | Lista");
		setBounds(100, 100, 880, 460);
		painelLista = new JPanel();
		painelLista.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(painelLista);
		painelLista.setLayout(null);
		painelLista.setBackground(Color.LIGHT_GRAY);
		
//		
		labelNome = new JLabel("Nome:"); //texto da label 
		//labelNome.setHorizontalAlignment(SwingConstants.TRAILING); //definindo a orientacao e formatacao
		//labelnome.setFont(new Font("Arial", Font.PLAIN, 15)); //definindo a fonte do label
		labelNome.setBounds(73, 220, 77, 27); //definindo dimensões
		painelLista.add(labelNome); //adicionar essa label ao painel
		
		textNome = new JTextField();
		//textNome.setHorizontalAlignment(SwingConstants.TRAILING);
		//textNome.setFont(new Font(""))
		textNome.setBounds(145,220,250,27);
		painelLista.add(textNome);
		
		
		labelTelefone = new JLabel("Telefone:"); //texto da label 
		labelTelefone.setBounds(73, 260, 77, 27); //definindo dimensões
		painelLista.add(labelTelefone); //adicionar essa label ao painel
		
		textTelefone = new JTextField();
		//textNome.setHorizontalAlignment(SwingConstants.TRAILING);
		//textNome.setFont(new Font(""))
		textTelefone.setBounds(145,260,250,27);
		painelLista.add(textTelefone);
		
		
		labelIdade = new JLabel("Idade:");
		labelIdade.setBounds(73,300,200,27);
		painelLista.add(labelIdade);
		
		textIdade = new JTextField();
		textIdade.setBounds(145,300,250,27);
		painelLista.add(textIdade);
		
		labelEmail= new JLabel("Email:");
		//labelTelefone.setHorizontalAlignment(SwingConstants.TRAILING);
		labelEmail.setBounds(73, 340, 200, 27);
		painelLista.add(labelEmail);
		
		textEmail = new JTextField();
		textEmail.setBounds(145, 340, 250, 27);
		painelLista.add(textEmail);
		
		labelPresente = new JLabel("Presente:");
		labelPresente.setBounds(73, 380, 200, 27);
		painelLista.add(labelPresente);
		
		textPresente = new JTextField();
		textPresente.setBounds(145, 380, 250, 27);
		painelLista.add(textPresente);
		
//		testeVariavel = new JTextField();
//		testeVariavel.setBounds(580, 300, 150, 27);
//		painelLista.add(testeVariavel);
//		
//		labelSubtotal = new JLabel("Subtotal: ");
//		labelSubtotal.setBounds(500, 300, 200, 27);
//		//labelSubtotal.setForeground(Color.WHITE);
//		painelLista.add(labelSubtotal);
		
		
		
		
		JTable tabela = new JTable();
		
		JScrollPane navegador = new JScrollPane(tabela);
		navegador.setBounds(0, 0,880, 200);
		painelLista.add(navegador);
		
		Object[] coluna = {"Nome", "Telefone", "Idade", "E-mail", "Presente"};
		DefaultTableModel model = new DefaultTableModel();
		model.setColumnIdentifiers(coluna);
		tabela.setModel(model);
		tabela.setBackground(Color.WHITE);
		tabela.setRowHeight(30);

		tabela.setAutoResizeMode(JTable.AUTO_RESIZE_NEXT_COLUMN);
		TableColumnModel colModel=tabela.getColumnModel();
		colModel.getColumn(0).setPreferredWidth(15);
		colModel.getColumn(1).setPreferredWidth(15);    
		colModel.getColumn(2).setPreferredWidth(15);
		colModel.getColumn(3).setPreferredWidth(15);
		colModel.getColumn(4).setPreferredWidth(15);
		
		
	
		botaoVoltar = new JButton("Voltar");
		botaoVoltar.setBounds(750, 380, 120,27);
		//botaoVoltar.setBackground(Color.BLUE);
		painelLista.add(botaoVoltar);
		
		botaoVoltar.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent click) {
				controleDireto.mudarSetVisible();
				setVisible(false);
				
				
			}
		});
		
		/**
		 * vai realizar o retorno ao menu principal
		 */
		

		botaoAdicionar = new JButton("Add.Convidado");
		botaoAdicionar.setBounds(500,220,140,27);
		painelLista.add(botaoAdicionar);
		
		
		Object[] row = new Object[5];
		
		botaoAdicionar.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				row[0] = textNome.getText();
				row[2] = textIdade.getText();
				row[3] = textEmail.getText();
				row[1] = textTelefone.getText();
				row[4] = textPresente.getText();
				
			
				model.addRow(row);
				
			}
		});
		
		/**
		 * Vai realizar a adição de cada convidado e inseri-los na tabela criada
		 */
		
		
		botaoRetirar = new JButton("Retirar");
		botaoRetirar.setBounds(500,260, 140, 27);
		painelLista.add(botaoRetirar);
		
		botaoRetirar.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				int i = tabela.getSelectedRow();
				if(i>= 0) {
					model.removeRow(i);
				}else {
					controleDireto.impossivelExcluir();
					
				}
				
			}
		});
		
		/**
		 * Vai retirar os convidados da Tabela, caso seja pertinente
		 */
		
		tabela.addMouseListener(new MouseAdapter() {
		
		@Override
		
		public void mouseClicked(MouseEvent e) {
			
			int i = tabela.getSelectedRow();
			textNome.setText(model.getValueAt(i, 0).toString());
			textIdade.setText(model.getValueAt(i, 2).toString());
			textEmail.setText(model.getValueAt(i, 3).toString());
			textTelefone.setText(model.getValueAt(i, 1).toString());
			textPresente.setText(model.getValueAt(i, 4).toString());
		
		}
		
		
		
		});
		
		/**
		 * Esssa função é responsável por fazer com que a ultima linha selecionada esteja tida como highlight e além disso reapareça em seu devido lugar nos campos de texto criados 
		 */
		
		
		botaoAlterar = new JButton("Alterar");
		botaoAlterar.setBounds(500,300,140,27);
		painelLista.add(botaoAlterar);
		
		botaoAlterar.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				int i = tabela.getSelectedRow();
				
				if(i >= 0) {
					model.setValueAt(textNome.getText(), i, 0);
					model.setValueAt(textIdade.getText(), i, 2);
					model.setValueAt(textEmail.getText(), i, 3);
					model.setValueAt(textTelefone.getText(), i, 1);
					model.setValueAt(textPresente.getText(), i, 4);
				}else {
					
				}
				
				
			}
		});
		/**
		 * Classe responsável por prover a alteração de algum dado já inserido na tabela. Regras de uso: 1º clicar na linha a ser alterada. A mesma vai se refletir no campo de texto. 2º alterar o campo desejado. 3º clicar em "Alterar" e finalmente verificar a mudança do campo modificado na tabela.
		 */
		
}


	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	
	


	
}	

