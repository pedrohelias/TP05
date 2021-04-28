package model;
import java.util.ArrayList;

/**
 * Classe responsável por organizar uma lista de gastos. Em comparação a evento, faz sentido existir uma classe apenas para a lista de gastos, visto que não há um evento que comporte uma lista de gastos - representando o contrário quando se trata da ligação entre Evento e Convidado
 * @author pedro
 * @version 1.0
 */

public class ListaDeGastos {
	
	private ArrayList<Produto> listaDeGastos = new ArrayList<Produto>();
	private String nomeDaLista;
	private double total;
	private Produto prod;
	
	/**
	 *
	 * @param listaDeGastos define uma lista baseada em produtos e na forma como os mesmos são representados, separando-os por suas propriedades
	 * @param nomeDaLista define o nome da lista
	 * @param total define um sub-total de gastos a serem desenvolvidos mais a frente
	 */
	
	
	public ListaDeGastos(String nomeDaLista) {
		this.nomeDaLista = nomeDaLista;
	}

	/**
	 * Funcao construtora, vai chamar e iniciar a classe
	 * @return não tem retorno
	 */
	
	public ArrayList<Produto> getListaDeGastos() {
		return listaDeGastos;
	}

	public void setListaDeGastos(ArrayList<Produto> listaDeGastos) {
		this.listaDeGastos = listaDeGastos;
	}

	public String getNomeDaLista() {
		return nomeDaLista;
	}


	public void setNomeDaLista(String nomeDaLista) {
		this.nomeDaLista = nomeDaLista;
	}

	public double getTotal() {
		return total;
	}
	


	public void setTotal(int total) {
		this.total = total;
	}

	public void addProduto(Produto prod) {
		int quantidade = prod.getQuantidade();
		this.listaDeGastos.add(prod);
		total = total + (prod.getCusto() * quantidade);
		
	}
	/**
	 * Classe responsavel por adicionar produtos a lista. Também vai atualizar as quantidades e atualizar o subtotal dos gastos
	 * @param prod Variável responsavel por representar o produto 
	 * @param quantidadeARetirar Variável responsável por definir a quantidade a ser calculada após adição
	 */
	
	public void retirarProduto(Produto prod, int quantidadeARetirar) {
		int quantidade = quantidadeARetirar;
		int antigaQuantidade = prod.getQuantidade();
		int novaQuantidade = prod.getQuantidade() - quantidade;
	
		
		if(novaQuantidade <= 0) {
			prod.setQuantidade(novaQuantidade);
				
			total = total - (prod.getCusto() * quantidade);
			this.listaDeGastos.remove(prod);
			
		}else {
		
		prod.setQuantidade(novaQuantidade);
		
		total = total - (prod.getCusto() * quantidade);
		
		}
	}
	
	/**
	 * funcao responsavel por retirar um produto e calcula a quantidade
	 * @param quantidade Variável responsavel por definir o valor a ser retirado após o calculo de quantidade, além de definir o valor em reais depois da alteração
	 * @param antigaQuantidade Variável responsável por definir a quantidade anterior ao cálculo
	 * @param novaQuantidade Variável responsável por definir a quantidade após o cálculo
	 * 
	 */
	

	@Override
	public String toString() {
		return "ListaDeGastos [listaDeGastos=" + listaDeGastos + ", nomeDaLista=" + nomeDaLista + ", total=" + total
				+ "]";
	}
	
	
	
	

	
	
	
	

}