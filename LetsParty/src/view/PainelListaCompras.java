package view;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import controller.Controlador;

/**
 * Classe não mais utilizada! 
 * @author pedro
 * @version 1.0
 */


public class PainelListaCompras extends JFrame {

	private JPanel painelListaCompras;
	
	private JTextField textNome;
	private JTextField custo;
	private JTextField quantidade;
	
	private JLabel labelNome;
	private JLabel labelCusto;
	private JLabel labelQuantidade;
	
	private JButton botaoAdicionar;
	private JButton botaoVoltar;
	private JButton botaoVerLista;
	private Controlador controle;
	private Master master;
	private TabelaListaCompras tabs;
	
	public PainelListaCompras(Controlador controleDireto) {
		
		controle = controleDireto;
		//abaixo as definições sobre o painel e como ele vai se comportar no frame
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("Painel | Lista de Compras");
		setBounds(100, 100, 524, 380);
		painelListaCompras = new JPanel();
		painelListaCompras.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(painelListaCompras);
		painelListaCompras.setLayout(null);
		painelListaCompras.setBackground(Color.WHITE);
		
		
		labelNome = new JLabel("Nome:"); 
		labelNome.setBounds(73, 61, 77, 27); //definindo dimensões
		painelListaCompras.add(labelNome); //adicionar essa label ao painel
		
		textNome = new JTextField();
		textNome.setBounds(273,61,200,27);
		painelListaCompras.add(textNome);
		
		labelCusto = new JLabel("Custo:");
		labelCusto.setBounds(73, 100, 77, 27); //definindo dimensões
		painelListaCompras.add(labelCusto); //adicionar essa label ao painel
		
		custo = new JTextField();
		custo.setBounds(273,100,200,27);
		painelListaCompras.add(custo);
		
		labelQuantidade = new JLabel("ID:");
		labelQuantidade.setBounds(73,139,77,27);
		painelListaCompras.add(labelQuantidade);
		
		quantidade = new JTextField();
		quantidade.setBounds(273,139,200,27);
		painelListaCompras.add(quantidade);
		
		
		botaoAdicionar = new JButton("Add produto");
		botaoAdicionar.setBounds(36,300,140,27);
		painelListaCompras.add(botaoAdicionar);
		
		botaoVerLista = new JButton("Ver a lista");
		botaoVerLista.setBounds(187,300,140,27);
		painelListaCompras.add(botaoVerLista);
		
		
		botaoVoltar = new JButton("Voltar");
		botaoVoltar.setBounds(336, 300, 140,27);
		painelListaCompras.add(botaoVoltar);
		
		botaoVoltar.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent click) {
				controleDireto.mudarSetVisible();
				setVisible(false);
				
				
			}
		});
		
		
		
		
	}
	
}
