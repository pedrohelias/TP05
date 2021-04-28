package model;
/**
 * Define parâmetros a respeito do convidado e como ele irá interagir com outras classes. Nota: Seguindo o front-end, algumas variáveis se tornaram não muito relevantes e foram comentadas ou não adicionadas no front-end. Mantive essas variáveis para ter um histórico interessante de mudança e uma especie de "deprecated"
 * @author pedro
 * @version 1.0
 */

public class Convidado extends Pessoa{
	

	private boolean presenca;
	private String presenteConv;
	
	/**
	 * @param presenca define a presenca do convidado na festa
	 * @param presenteConv define o presente que o convidado trará
	 */
	
	public Convidado(String no, String em, int numero, int ida, int idzao, boolean pres, String presente) {
		super();
		this.nome = no;
		this.email = em;
		this.telefone = numero;
		this.idade = ida;
		this.permissaoMaster = false;
		this.ID = idzao;
		this.presenca = pres;
		this.presenteConv = presente;
		this.papel = "Convidado";
	}
	
	 //sobreescrito pois a classe Pessoa não representa o presente inserido, já a classe Convidado possui associação direta com presente, sendo necessário fazer uma sobreescrição no método status(), original da classe Pessoa.
	
	@Override
	
	public void status() {
		/**
		 * Define um status geral do convidado selecionado, feito para análises de teste, chamadas na main.
		 */
		System.out.println("_____________Status________________");
		System.out.println(getNome());
		System.out.println(getTelefone());
		System.out.println(getID());
		System.out.println(getEmail());
		System.out.println(getIdade());
		System.out.println(getPermissaoMaster());
		System.out.println(getPapel());
		System.out.println(getPresenteConv());
		
		
		
		
	}
	
	public void checkIn() {
		/**
		 * define a presença
		 */
		if(getPresenca()) {
			System.out.println("Vou estar presente!");
		}else {
			System.out.println("Não irei!");
		}
	}

	public boolean getPresenca() {
		return presenca;
	}

	public void setPresenca(boolean presenca) {
		this.presenca = presenca;
	}

	

	public String getPresenteConv() {
		return presenteConv;
	}




	public void setPresenteConv(String presenteConv) {
		this.presenteConv = presenteConv;
	}

	@Override
	public String toString() {
		return " Convidado -> " + nome + ", email=" + email + ", " + telefone + ", idade = " + idade + " anos"
				+ ", permissaoMaster=" + permissaoMaster + ", ID=" + ID + ", papel=" + papel + ", presenca=" + presenca
				+ ", presenteConv = " + presenteConv +  "\n";
	}





	
	
	
}