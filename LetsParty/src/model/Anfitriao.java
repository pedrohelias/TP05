package model;
/**
 * Define parâmetros para o anfitrião, sendo definido como uma "classe pobre", por conter apenas seus parâmetros herdados
 * @author Pedro Helias Carlos 
 * @version 1.0
 */


public class Anfitriao extends Pessoa{
	/**
	 * Define parâmetros para o anfitrião, sendo definido como uma "classe pobre", por conter apenas seus parâmetros herdados
	 * @param no define o nome
	 * @param em define o email
	 * @param numero define o telefone
	 * @param ida define a idade 
	 * @param idzao define o código de identificação
	 */



	public Anfitriao(String no, String em, int numero, int ida, int idzao) {
		super();
		this.nome = no;
		this.email = em;
		this.telefone = numero;
		this.idade = ida;
		this.permissaoMaster = true;
		this.ID = idzao;
		this.papel = "Anfitriao";
	}

	
	
	
	


}