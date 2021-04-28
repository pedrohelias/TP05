package view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import controller.*;
import model.*;

/**
 * Classe não mais utilizada
 * @author Pedro Helias Carlos 
 * @version 1.0
 */

public class TabelaListaCompras extends JFrame  implements ActionListener{
	
	
	private JPanel painelLista;
	private JTextField textNome;
	private JTextField textEmail;
	private JTextField textID;
	private JTextField textTelefone;
	private JTextField textPermissao;
	private JLabel labelNome;
	private JLabel labelEmail;
	private JLabel labelID;
	private JLabel labelTelefone;
	private JLabel labelPermissao; //false para convidados
	private JLabel labelNomeList;
	private JLabel labelEmailList;
	private JLabel labelIDList;
	private JLabel labelTelefoneList;
	private JLabel labelPermissaoList;
	private JTextField teste;
	private JTextArea area;
	private JButton botaoVoltar;
	private JButton botaoAdicionar;
	private JButton botaoget;
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
	
	
	public TabelaListaCompras(Controlador controleDireto) {
		
		controle = controleDireto;
		//abaixo as definições sobre o painel e como ele vai se comportar no frame
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("Painel | Lista");
		setBounds(100, 100, 800, 600);
		painelLista = new JPanel();
		painelLista.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(painelLista);
		painelLista.setLayout(null);
		painelLista.setBackground(Color.LIGHT_GRAY);
		
		
		labelNome = new JLabel("Nome:"); //texto da label 
		//labelNome.setHorizontalAlignment(SwingConstants.TRAILING); //definindo a orientacao e formatacao
		//labelnome.setFont(new Font("Arial", Font.PLAIN, 15)); //definindo a fonte do label
		labelNome.setBounds(73, 61, 77, 27); //definindo dimensões
		painelLista.add(labelNome); //adicionar essa label ao painel
		
		textNome = new JTextField();
		//textNome.setHorizontalAlignment(SwingConstants.TRAILING);
		//textNome.setFont(new Font(""))
		textNome.setBounds(140,61,200,27);
		painelLista.add(textNome);
		
		
		labelEmail = new JLabel("E-mail:"); //texto da label 
		labelEmail.setBounds(73, 100, 77, 27); //definindo dimensões
		painelLista.add(labelEmail); //adicionar essa label ao painel
		
		textEmail = new JTextField();
		//textNome.setHorizontalAlignment(SwingConstants.TRAILING);
		//textNome.setFont(new Font(""))
		textEmail.setBounds(140,100,200,27);
		painelLista.add(textEmail);
		
		
		labelID = new JLabel("ID:");
		labelID.setBounds(73,139,200,27);
		painelLista.add(labelID);
		
		textID = new JTextField();
		textID.setBounds(140,139,200,27);
		painelLista.add(textID);
		
		labelTelefone = new JLabel("Telefone:");
		labelTelefone.setBounds(400, 61, 200, 27);
		painelLista.add(labelTelefone);
		
		textTelefone = new JTextField();
		textTelefone.setBounds(490, 61, 200, 27);
		painelLista.add(textTelefone);
		
		labelPermissao = new JLabel("Permissão:");
		labelPermissao.setBounds(400, 100, 200, 27);
		painelLista.add(labelPermissao);
		
		textPermissao = new JTextField();
		textPermissao.setBounds(490, 100, 200, 27);
		painelLista.add(textPermissao);
		
		
		lista = new JList();
		lista.setBackground(Color.WHITE);
		lista.setForeground(Color.BLACK);
		lista2 = new JList();
		lista2.setBackground(Color.WHITE);
		lista3 = new JList();
		lista4 = new JList();
		lista5 = new JList();
			
		
		lista.setBounds(73, 250, 120, 200);
		painelLista.add(lista);
		labelNomeList = new JLabel("Nome");
		labelNomeList.setBounds(73, 220, 200, 27);
		painelLista.add(labelNomeList);
		
		lista2.setBounds(203,250,120,200);
		painelLista.add(lista2);
		labelEmailList = new JLabel("Email");
		labelEmailList.setBounds(203, 220, 200, 27);
		painelLista.add(labelEmailList);
		
		
		lista3.setBounds(333, 250, 120, 200);
		painelLista.add(lista3);
		labelIDList = new JLabel("ID");
		labelIDList.setBounds(333, 220, 200, 27);
		painelLista.add(labelIDList);
		
	
		lista4.setBounds(463,250,120,200);
		painelLista.add(lista4);
		labelTelefoneList = new JLabel("Telefone");
		labelTelefoneList.setBounds(463, 220, 200, 27);
		painelLista.add(labelTelefoneList);
	
		
		lista5.setBounds(593, 250, 120, 200);
		painelLista.add(lista5);
		labelPermissaoList = new JLabel("Permissão");
		labelPermissaoList.setBounds(593,220, 200, 27);
		painelLista.add(labelPermissaoList);
		
		
		
		DefaultListModel model = new DefaultListModel();
		DefaultListModel model2 = new DefaultListModel();
		DefaultListModel model3 = new DefaultListModel();
		DefaultListModel model4 = new DefaultListModel();
		DefaultListModel model5 = new DefaultListModel();
		
		
		
		botaoVoltar = new JButton("Voltar");
		botaoVoltar.setBounds(593, 500, 120,27);
		painelLista.add(botaoVoltar);
		
		botaoVoltar.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent click) {
				controleDireto.mudarSetVisible();
				setVisible(false);
				
				
			}
		});
		
		
		

		botaoAdicionar = new JButton("Add convidado");
		botaoAdicionar.setBounds(73,500,140,27);
		painelLista.add(botaoAdicionar);
		
		botaoAdicionar.addActionListener(new ActionListener() {
			
			
			@Override
			public void actionPerformed(ActionEvent click) {
				if(textNome.getText().equals("") || textEmail.getText().equals("") || textID.getText().equals("") || textTelefone.getText().equals("") || textPermissao.getText().equals("")) {
					controleDireto.alertaErro();
					
				}else{
					
					model.addElement(textNome.getText());
					lista.setModel(model);
					
					model2.addElement(textEmail.getText());
					lista2.setModel(model2);
					
					model3.addElement(textID.getText());
					lista3.setModel(model3);
					
					model4.addElement(textTelefone.getText());
					lista4.setModel(model4);
					
					model5.addElement(textPermissao.getText());
					lista5.setModel(model5);
					
					
				}
				
			}
		});

		
		botaoget = new JButton("get!");
		botaoget.setBounds(333,500,140,27);
		painelLista.add(botaoget);

		botaoget.addActionListener(this);

		}


	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		
		if(lista.getSelectedIndex() == 0) {
		JOptionPane.showMessageDialog(this, lista.getSelectedValue());
		JOptionPane.showMessageDialog(this, lista2.getSelectedValue());
		JOptionPane.showMessageDialog(this, lista3.getSelectedValue());
		JOptionPane.showMessageDialog(this, lista4.getSelectedValue());
		JOptionPane.showMessageDialog(this, lista5.getSelectedValue());
		}else {
			JOptionPane.showMessageDialog(this, lista.getSelectedValue());
			JOptionPane.showMessageDialog(this, lista2.getSelectedValue());
			JOptionPane.showMessageDialog(this, lista3.getSelectedValue());
			JOptionPane.showMessageDialog(this, lista4.getSelectedValue());
			JOptionPane.showMessageDialog(this, lista5.getSelectedValue());
		}
		
	}
}	

