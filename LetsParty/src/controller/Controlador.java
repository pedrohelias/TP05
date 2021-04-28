package controller;
import java.util.ArrayList;

import javax.swing.JOptionPane;

import model.*;
import view.*;

/**
 * Classe responsavel por controlar o projeto associando os Masters criado em cada package
 * @author Pedro Helias Carlos
 * @version 1.0
 */

public class Controlador {

	PainelLista painelLista = new PainelLista(this); //adicionando painel lista de convidados
	TabelaLista tabelalista = new TabelaLista(this); //adicionando tabela dos convidados 
	PainelListaCompras painelcompras = new PainelListaCompras(this);
	TabelaListaCompras tabelacompras = new TabelaListaCompras(this);
	public MasterModelo servico = new MasterModelo();
	//public Convidado cond = new Convidado();
	
	Master menuPrincipal = new Master(painelLista, tabelalista, painelcompras, tabelacompras);
	
	public void mudarSetVisible() { //criado pois nõa é possivel um panel alterar a visibilidade do Frame Master, sendo necessario chamar o Controle
		menuPrincipal.setVisible(true);
	}
	
	public void alertaErro() {
		
		JOptionPane.showMessageDialog(null, "Digite Tudo!");
	
	}

	public void impossivelExcluir() {
		JOptionPane.showMessageDialog(null, "Impossível Excluir!");
		
	}
	
	public void impossivelAlterar() {
		JOptionPane.showMessageDialog(null, "impossível Alterar!");

	}
	
	public PainelLista getPainelLista() {
		return painelLista;
	}

	public void setPainelLista(PainelLista painelLista) {
		this.painelLista = painelLista;
	}

	public TabelaLista getTabelalista() {
		return tabelalista;
	}

	public void setTabelalista(TabelaLista tabelalista) {
		this.tabelalista = tabelalista;
	}

	public PainelListaCompras getPainelcompras() {
		return painelcompras;
	}

	public void setPainelcompras(PainelListaCompras painelcompras) {
		this.painelcompras = painelcompras;
	}

	public TabelaListaCompras getTabelacompras() {
		return tabelacompras;
	}

	public void setTabelacompras(TabelaListaCompras tabelacompras) {
		this.tabelacompras = tabelacompras;
	}

	public MasterModelo getServico() {
		return servico;
	}

	public void setServico(MasterModelo servico) {
		this.servico = servico;
	}

	public Master getMenuPrincipal() {
		return menuPrincipal;
	}

	public void setMenuPrincipal(Master menuPrincipal) {
		this.menuPrincipal = menuPrincipal;
	}
	
	
	
	
}