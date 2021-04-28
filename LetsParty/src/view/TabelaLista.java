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
import javax.swing.border.TitledBorder;
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
import javax.swing.BorderFactory;
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
 * Classe responsavel por determinar a tabela com as listas de gastos
 * @author Pedro Helias Carlos 
 * @version 1.0
 */
public class TabelaLista extends JFrame  implements ActionListener{
	
	
	private JPanel painelLista;
	private JTextField textNome;
	private JTextField textCusto;
	private JTextField textTipo;
	private JTextField textQuantidade;
	private JTextField textPermissao;
	private JTextField testeVariavel;
	private JLabel labelNome;
	private JLabel labelCusto;
	private JLabel labelTipo;
	private JLabel labelQuantidade;
	private JLabel labelPermissao; //false para convidados
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
	
	
	public TabelaLista(Controlador controleDireto) {
		
		controle = controleDireto;
		//abaixo as definições sobre o painel e como ele vai se comportar no frame
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("Painel | Lista");
		setBounds(100, 100, 880, 450);
		painelLista = new JPanel();
		//painelLista.setBorder(new EmptyBorder(5, 5, 5, 5));
		//painelLista.setBorder(BorderFactory.createTitledBorder(BorderFactory.createEtchedBorder(), "My Demo Table", TitledBorder.LEFT,TitledBorder.TOP));
		setContentPane(painelLista);
		painelLista.setLayout(null);
		painelLista.setBackground(Color.LIGHT_GRAY);
		
		
		labelNome = new JLabel("Nome:"); //texto da label 
		//labelNome.setHorizontalAlignment(SwingConstants.TRAILING); //definindo a orientacao e formatacao
		//labelnome.setFont(new Font("Arial", Font.PLAIN, 15)); //definindo a fonte do label
		labelNome.setBounds(73, 220, 77, 27); //definindo dimensões
		painelLista.add(labelNome); //adicionar essa label ao painel
		
		textNome = new JTextField();
		//textNome.setHorizontalAlignment(SwingConstants.TRAILING);
		//textNome.setFont(new Font(""))
		textNome.setBounds(140,220,200,27);
		painelLista.add(textNome);
		
		
		labelCusto = new JLabel("Custo:"); //texto da label 
		labelCusto.setBounds(73, 260, 77, 27); //definindo dimensões
		painelLista.add(labelCusto); //adicionar essa label ao painel
		
		textCusto = new JTextField();
		//textNome.setHorizontalAlignment(SwingConstants.TRAILING);
		//textNome.setFont(new Font(""))
		textCusto.setBounds(140,260,200,27);
		painelLista.add(textCusto);
		
		
		labelTipo = new JLabel("Tipo:");
		labelTipo.setBounds(73,300,200,27);
		painelLista.add(labelTipo);
		
		textTipo = new JTextField();
		textTipo.setBounds(140,300,200,27);
		painelLista.add(textTipo);
		
		labelQuantidade= new JLabel("Qnt.:");
		//labelTelefone.setHorizontalAlignment(SwingConstants.TRAILING);
		labelQuantidade.setBounds(73, 340, 200, 27);
		painelLista.add(labelQuantidade);
		
		textQuantidade = new JTextField();
		textQuantidade.setBounds(140, 340, 200, 27);
		painelLista.add(textQuantidade);
		
//		labelPermissao = new JLabel("Permissão:");
//		labelPermissao.setBounds(500, 289, 200, 27);
//		painelLista.add(labelPermissao);
//		
//		textPermissao = new JTextField();
//		textPermissao.setBounds(590, 289, 200, 27);
//		painelLista.add(textPermissao);
		
		testeVariavel = new JTextField();
		testeVariavel.setBounds(580, 300, 150, 27);
		painelLista.add(testeVariavel);
		
		labelSubtotal = new JLabel("Subtotal: ");
		labelSubtotal.setBounds(500, 300, 200, 27);
		//labelSubtotal.setForeground(Color.WHITE);
		painelLista.add(labelSubtotal);
		
		
		
		
		JTable tabela = new JTable();
		painelLista.setBorder(BorderFactory.createTitledBorder(
		        BorderFactory.createEtchedBorder(), "Table Title", TitledBorder.CENTER,
		        TitledBorder.TOP));
		
		JScrollPane navegador = new JScrollPane(tabela);
		navegador.setBounds(0, 0,880, 200);
		painelLista.add(navegador);
		
		Object[] coluna = {"Nome", "Tipo", "Custo", "Quantidade"};
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
		//colModel.getColumn(4).setPreferredWidth(15);
		
		
	
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
		
		botaoAdicionar = new JButton("Add.Produto");
		botaoAdicionar.setBounds(500,220,140,27);
		painelLista.add(botaoAdicionar);
		
		
		Object[] row = new Object[5];
		
		botaoAdicionar.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				row[0] = textNome.getText();
				row[1] = textTipo.getText();
				row[2] = textCusto.getText();
				row[3] = textQuantidade.getText();
				//row[4] = textPermissao.getText();
			
				model.addRow(row);
				
			}
		});
		
		/**
		 * Vai realizar a adição de cada produto e inseri-los na tabela criada
		 */
		
	
		
		
		botaoget = new JButton("Faturamento");
		botaoget.setBounds(680,260,140,27);
		painelLista.add(botaoget);
		
		botaoget.addActionListener(new ActionListener() {
			
			public double soma() {
				
				int rowsCount = tabela.getRowCount();
				double resultado = 0;
				for(int i = 0; i < rowsCount; i++) {
					resultado = resultado + Double.parseDouble(tabela.getValueAt(i, 2).toString()) * Double.parseDouble(tabela.getValueAt(i, 3).toString());
				}
				
				
				return resultado;
			}
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				String var = Double.toString(soma());
				
				testeVariavel.setText(var);
				
				if(Double.parseDouble(testeVariavel.getText()) <= 0) {
					labelSubtotal.setForeground(Color.RED);
				}else {
					labelSubtotal.setForeground(Color.BLUE);
				}
				
				testeVariavel.setText("R$ " + var);
				
				//System.out.println((sumRow(model,3)));
				
			}
		});
		
		/**
		 * Vai realizar o faturamento baseado no que foi colocado na tabela. A tabela foi criada para adição de qualquer produto, seja ele uma despesa ou seja ele uma entrada de capital
		 * Regra para ser utilizado:
		 * 1º Adicionar todos os dados na tabela, referentes ao produto
		 * Gastos exigem sinal negativo antes do valor do produto/despesa
		 * Entrada de capital exige sinal positivo antes do valor do produto/entrada de capital
		 * Há alterações da cor da Label Subtotal quando o saldo é negativo ou positivo. 
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
		 * Vai retirar um produto da tabela 
		 */
		
		tabela.addMouseListener(new MouseAdapter() {
		
		@Override
		
		public void mouseClicked(MouseEvent e) {
			
			int i = tabela.getSelectedRow();
			textNome.setText(model.getValueAt(i, 0).toString());
			textTipo.setText(model.getValueAt(i, 1).toString());
			textCusto.setText(model.getValueAt(i, 2).toString());
			textQuantidade.setText(model.getValueAt(i, 3).toString());
		
		
		}
		
		
		
		});
		
		/**
		 * Esssa função é responsável por fazer com que a ultima linha selecionada esteja tida como highlight e além disso reapareça em seu devido lugar nos campos de texto criados 
		 */
		
		
		
		botaoAlterar = new JButton("Alterar");
		botaoAlterar.setBounds(680,220,140,27);
		painelLista.add(botaoAlterar);
		
		botaoAlterar.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				int i = tabela.getSelectedRow();
				
				if(i >= 0) {
					model.setValueAt(textNome.getText(), i, 0);
					model.setValueAt(textTipo.getText(), i, 1);
					model.setValueAt(textCusto.getText(), i, 2);
					model.setValueAt(textQuantidade.getText(), i, 3);
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


