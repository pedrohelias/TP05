package model;

import java.util.Arrays;

/**
 * Classe responsavel pela definição de produto, com suas variáveis e, por fim, envia as variáveis responsaveis para o calculo do subtotal de produtos para a Lista de Gastos
 * @author pedro
 * @version 1.0
 */

public class Produto {
	
	private String nome;
	private double custo;
	private int quantidade;
	//private String[] tipo = new String[] {"Alimentos", "Bebidas", "Padaria", "Frutas, Legumes e Verduras", "Carnes", "Frios e Laticíneos", "Higiene e Limpeza" };
	
	/**
	 * 
	 * @param nome vai definir o nome do produto
	 * @param custo vai definir o custo do produto
	 * @param quantidade vai definir a quantidade de produto a ser adicionada 
	 */
	
	public Produto(String nome, double custo, int quantidade) {
		super();
		this.nome = nome;
		this.custo = custo;
		this.quantidade = quantidade;
		//this.tipo = tipo;
	}
	
	

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getCusto() {
		return custo;
	}

	public void setCusto(int custo) {
		this.custo = custo;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

//	public String[] getTipo() {
//		return tipo;
//	}
//
//	public void setTipo(String[] tipo) {
//		this.tipo = tipo;
//	}
//


	@Override
	public String toString() {
		return "Produto -> nome: " + nome + ", custo = " + custo + ", quantidade = " + quantidade + " item(ns)" +  "\n";
	}
	
	
	
	
	
	

}