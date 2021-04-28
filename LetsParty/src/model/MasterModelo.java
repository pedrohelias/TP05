package model;

import java.util.ArrayList;

/**
 * Classe responsavel por unir todos os métodos relevantes para o pacote model. Serve de ligaçao direta quando é invocado  o model na classe Controlador, presente em controller. Isso facilita para que não tenah que ser inicilizada todas as clases com os parâmetros necessários para tal toda vez que for inicializar o controlador.
 * @author pedro
 * @version 1.0
 */

public class MasterModelo {
	
	private ArrayList<Convidado> convidados = new ArrayList<Convidado>();
	private ArrayList<Evento> eventos = new ArrayList<Evento>();
	private ArrayList<Produto> prod = new ArrayList<Produto>();
	//private ArrayList<ListaDeGastos> lista = new ArrayList<ListaDeGastos>();
	private Convidado convs;
	private Produto produto;
	private boolean variavelDeConfirmacao;
	private Pessoa pessoa;
	
	/**
	 * @param convidados vai definir uma lista de presenca baseada em convidados
	 * @param eventos vai definir a inicialização do evento
	 * @param prod vai definir a inicialização do produto
	 * @param convs vai inicializar a classe Convidados
	 * @param produto vai inicializar a classe Produto
	 * @param variavelDeConfirmacao representa uma variavel para inicializacao da chamada da classe no controlador
	 * @param pessoa inicializa a classe pessoa
	 */
	public MasterModelo() {
		super();
	}
	
	public ArrayList<Convidado> getConvidados() {
		return convidados;
	}
	public void setConvidados(ArrayList<Convidado> convidados) {
		this.convidados = convidados;
	}
	public ArrayList<Evento> getEventos() {
		return eventos;
	}
	public void setEventos(ArrayList<Evento> eventos) {
		this.eventos = eventos;
	}
	public ArrayList<Produto> getProd() {
		return prod;
	}
	public void setProd(ArrayList<Produto> prod) {
		this.prod = prod;
	}
//	public ArrayList<ListaDeGastos> getLista() {
//		return this.lista;
//	}
//	public void setLista(ArrayList<ListaDeGastos> lista) {
//		this.lista = lista;
//	}
	public Convidado getConvs() {
		return convs;
	}
	public void setConvs(Convidado convs) {
		this.convs = convs;
	}
	public Produto getProduto() {
		return produto;
	}
	public void setProduto(Produto produto) {
		this.produto = produto;
	}
	
	public void addConvidado(Convidado convidado) {
		this.convidados.add(convidado);
	}
	
	public void retiraConvidado(Convidado convidado) {
		this.convidados.remove(convidado);
	}
	
	public void addProduto(Produto prod) {
		this.prod.add(prod);
	}
	
	public void retiraProduto(Produto prod) {
		this.prod.remove(prod);
	}
	
	
	

}
