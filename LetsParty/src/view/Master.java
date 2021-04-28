package view;

import javax.swing.*;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import controller.*;

/**
 * Classe responsavel por conectar todas as partes do Front-End e unificar os painéis para que os mesmos possam se conectar com o controlador. Realiza também o controle de alteração de tela.
 * @author Pedro Helias Carlos 
 * @version 1.0
 */
public class Master extends JFrame{
	
	private JButton botaoListaConv;
	private JButton botaoTabelaCompras;
	private JButton botaoTabelaComprasPreenchida;
	private JButton botaoListaConvidadosPreenchida;
	private JLabel titulo;
	private JLabel descricaoBottLista;
	private JLabel descricaoBottTabela;
	private JLabel descricaoBottListaPreenchida;
	private JLabel descricaoBottTabelaPreenchida;
	private JLabel L1;
	
	/**
	 * 
	 * @param painellista inicializa a classe PainelLista
	 * @param tabelalista inicializa a classe TabelaLista
	 * @param painellistacompras inicializa a classe PainelListaCompras
	 * @param tabelalistacompras inicializa a classe TabelaListaCompras
	 */
	
	public Master(PainelLista painellista, TabelaLista tabelalista, PainelListaCompras painellistacompras, TabelaListaCompras tabelalistacompras)
	{
		getContentPane().setBackground(Color.WHITE);
		JLabel background;
		
		setBounds(100, 100, 400, 300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setLayout(null);
		setTitle("Menu Inicial");
		setResizable(true);
		setLocationRelativeTo(null); //centralizar a tela
//		
//		setLayout(new BorderLayout());
//		setContentPane(new JLabel(new ImageIcon("/home/pedro/Área de Trabalho/eclipse_codes/tp05/LetsParty/balao.jpg")));
//		setLayout(new FlowLayout());
//		L1 = new JLabel();
//		add(L1);
//		setSize(284,178);
		
		
		
//		
//		ImageIcon img = new ImageIcon("/home/pedro/Área de Trabalho/eclipse_codes/tp05/LetsParty/images.jpeg");
//		background = new JLabel("",img,JLabel.CENTER);
//		getContentPane().add(background);
		//setVisible(true);
		
		
		titulo = new JLabel("Let's Party!");
		titulo.setHorizontalAlignment(SwingConstants.CENTER);
		titulo.setForeground(Color.BLACK);
		titulo.setFont(new Font("null", Font.BOLD, 20));
		titulo.setBounds(75, 10, 245, 150);
		getContentPane().add(titulo);
		
		
		botaoListaConv = new JButton("Lista de Convidados");
		botaoListaConv.setBounds(100, 150, 200, 27);
		getContentPane().add(botaoListaConv);
		
		botaoListaConv.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent Click) {
				painellista.setLocationRelativeTo(null); //centralizar a tela
				painellista.setVisible(true);
				setVisible(false);
				
			}
		});
		
		/**
		 * vai realizar alteraão de pagina
		 */
		
		
//		botaoTabelaCompras = new JButton("Lista de Compras");
//		botaoTabelaCompras.setBounds(50, 300, 180, 180);
//		getContentPane().add(botaoTabelaCompras);
//		
//		botaoTabelaCompras.addActionListener(new ActionListener() {
//			
//			@Override
//			public void actionPerformed(ActionEvent Click) {
//				painellistacompras.setLocationRelativeTo(null); //centralizar a tela
//				painellistacompras.setVisible(true);
//				setVisible(false);
//				
//			}
//		});
		
		botaoTabelaComprasPreenchida = new JButton("Lista de Gastos");
		botaoTabelaComprasPreenchida.setBounds(100, 200, 200, 27);
		getContentPane().add(botaoTabelaComprasPreenchida);
		
		botaoTabelaComprasPreenchida.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent Click) {
				tabelalista.setLocationRelativeTo(null); //centralizar a tela
				
				tabelalista.setVisible(true);
				setVisible(false);
				
			}
		});
		
		/**
		 * vai realizar alteraão de pagina
		 */
		
		
		
//		botaoListaConvidadosPreenchida= new JButton("ListaConv preenchida");
//		botaoListaConvidadosPreenchida.setBounds(550, 50, 180, 180);
//		getContentPane().add(botaoListaConvidadosPreenchida);
//		
//		botaoListaConvidadosPreenchida.addActionListener(new ActionListener() {
//			
//			@Override
//			public void actionPerformed(ActionEvent Click) {
//				tabelalistacompras.setLocationRelativeTo(null); //centralizar a tela
//				tabelalistacompras.setVisible(true);
//				setVisible(false);
//				
//			}
//		});
//		
		
		//painellista.setVisible(false); //teste!!!
		//tabelalista.setVisible(false);
		setVisible(true);
		
	}
}
