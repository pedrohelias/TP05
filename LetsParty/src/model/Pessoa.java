package model;

import java.util.*;

/**
 * Classe responsavel pela definição de Pessoa - que gerou 2 filhos, Anfitrião e Convidado.
 * @author pedro
 * @version 1.0
 */

public abstract class Pessoa {
	protected String nome;
	protected String email;
	protected int telefone;
	protected int idade;
	protected boolean permissaoMaster;
	protected int ID;
	protected String papel;
	
	/**
	 * 
	 * @param nome vai definir o nome da Pessoa
	 * @param email vai definir o email da Pessoa
	 * @param telefone vai definir o numero de telefone da Pessoa
	 * @param idade vai definir a idade da Pessoa
	 * @param permissaoMaster vai definir a permissao para alterar a lista de presença - futuramente foi suprimido pela irrelevância quanto a proposta
	 * @param ID vai definir a identificação única para cada pessoa
	 * @param papel vai definir o papel da pessoa, Convidado ou Anfitrião - futuramente foi suprimido pela irrelevância.
	 */

	public void Pessoa(String no, String em, int tel, int ida, int idzao, String funcao) {
		
		this.nome = no;
		this.email = em;
		this.telefone = tel;
		this.idade = ida;
		this.permissaoMaster = false;
		ID = idzao;
		this.papel = funcao;
	}
	
	
	public void status() {
		System.out.println("_____________Status________________");
		System.out.println(getNome());
		System.out.println(getTelefone());
		System.out.println(getID());
		System.out.println(getEmail());
		System.out.println(getIdade());
		System.out.println(getPermissaoMaster());
		System.out.println(getPapel());
		
		
	}

	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	
	
	public int getIdade() {
		return idade;
	}
	
	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	public boolean getPermissaoMaster() {
		return permissaoMaster;
	}
	
	public void setPermissaoMaster(boolean permissaoMaster) {
		this.permissaoMaster = permissaoMaster;
	}
	
	public int getID() {
		return ID;
	}
	
	public void setID(int iD) {
		ID = iD;
	}
	
	

	public String getPapel() {
		return papel;
	}


	public void setPapel(String papel) {
		this.papel = papel;
	}


	public int getTelefone() {
		return telefone;
	}


	public void setTelefone(int telefone) {
		this.telefone = telefone;
	}

	
	
	
	@Override
	public String toString() {
		return "Pessoa [nome=" + nome + ", email=" + email + ", telefone=" + telefone + ", idade=" + idade
				+ ", permissaoMaster=" + permissaoMaster + ", ID=" + ID + ", papel=" + papel + "]";
	}




	


	
	
	
	
}