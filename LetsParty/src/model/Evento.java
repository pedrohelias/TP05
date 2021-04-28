package model;


import java.util.ArrayList;
/** Define parâmetros e outras dependências a respeito do evento e como ele vai se definir. Acompanha nome, a lista de convidados, entre outros. É importante citar que uma antiga classe de lista de convidados foi suprimida e encaixada em Evento pois faz mais sentido o evento conter uma lista.
 * @author Pedro Helias Carlos 
 * @version 1.0
 * 
 */
public class Evento {
	
	
	private ArrayList<Convidado> listaDePresenca = new ArrayList<Convidado>();
	private String nomeDoEvento;
	private Convidado conv;
	private String tempo;
	private boolean statusDoEvento;
	
	/**
	 * 
	 * @param nomeDoEvento define o nome do evento
	 * @param tempo define o tempo do evento - na forma de texto para acompanhar uma definição completa
	 * @statusDoEvento define se um evento está acontecendo 
	 */
	
	public Evento(String nomeDoEvento) {
		this.nomeDoEvento = nomeDoEvento;
	}

	public ArrayList<Convidado> getListaDePresenca() {
		return listaDePresenca;
	}


	public void setListaDePresenca(ArrayList<Convidado> listaDePresenca) {
		this.listaDePresenca = listaDePresenca;
	}


	public String getNomeDoEvento() {
		return nomeDoEvento;
	}


	public void setNomeDoEvento(String nomeDoEvento) {
		this.nomeDoEvento = nomeDoEvento;
	}



	public String getTempo() {
		return tempo;
	}


	public void setTempo(String tempo) {
		this.tempo = tempo;
	}


	public boolean isStatusDoEvento() {
		return statusDoEvento;
	}


	public void setStatusDoEvento(boolean statusDoEvento) {
		this.statusDoEvento = statusDoEvento;
	}
	
	//Adicoes e retirada de convidados para eventos
	
	public void addConvidado(Convidado conv) {
		this.listaDePresenca.add(conv);
	}
	/**
	 * Vai adicionar o convidado a lista de presença
	 * @param conv Variável responsável por representar o convidado
	 */

	public void retirarConvidado(Convidado conv) {
		this.listaDePresenca.remove(conv);
	}
	/**
	 * Vai retirar o convidado da lista de presença
	 * @param conv Variável responsável por representar o convidado
	 * 
	 */

	//FIM ADICAO E RETIRADA DO EVENTO
	
	
	
	@Override
	public String toString() {
		return "Evento [listaDePresenca=" + listaDePresenca + ", nomeDoEvento=" + nomeDoEvento + ", tempo=" + tempo
				+ ", statusDoEvento=" + statusDoEvento + "]";
	}
	
	//fim de adicoes e retiradas de convidados
	
	
	
	
	
	
	
	
	
	
		
	
	

	
	
	
}