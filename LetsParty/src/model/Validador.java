package model;

public class Validador {
	

	
	/**
	 *  Valida se o nome está correto
	 * @param nome representa a variável nome
	 * @return retorna a validação sobre o nome ser possivel
	 */
	public boolean validaNome(String nome) {
		boolean validacao = true;
		String numeros[]= {"0","1", "2", "3", "4", "5", "6","7", "8", "9"};
		if(nome.isEmpty()) {
			validacao = false;
		}
		if(nome.contains(numeros[0]) || nome.contains(numeros[1]) || nome.contains(numeros[2]) || nome.contains(numeros[3]) || nome.contains(numeros[4]) || nome.contains(numeros[5]) || nome.contains(numeros[6]) || nome.contains(numeros[7]) || nome.contains(numeros[8]) ) {
			validacao = false;
			
		}
		return validacao;
	}
	
	
	/**
	 * Valida se o ID de cara usuário está correto
	 * @param ID representa a variável de Identificação
	 * @return retorna a validação sobre o ID ser possível
	 */
	
	public boolean validaID(String ID) {
		boolean validacao;
		String numeros[]= {"0","1", "2", "3", "4", "5", "6","7", "8", "9"};
		if(ID.contains("!") || ID.contains("?") || ID.contains("*")) {
			
			validacao = false;
		}else if(ID.contains(numeros[0]) || ID.contains(numeros[1]) || ID.contains(numeros[2]) || ID.contains(numeros[3]) || ID.contains(numeros[4]) || ID.contains(numeros[5]) || ID.contains(numeros[6]) ||ID.contains(numeros[7]) || ID.contains(numeros[8]) || ID.contains(numeros[9]) || ID.contains("a") || ID.contains("b") || ID.contains("c") || ID.contains("d") || ID.contains("e") || ID.contains("f") || ID.contains("g") || ID.contains("h") || ID.contains("i") || ID.contains("j") || ID.contains("k") || ID.contains("l") || ID.contains("m") || ID.contains("n") || ID.contains("o") || ID.contains("p") || ID.contains("q") || ID.contains("r") || ID.contains("s") || ID.contains("t") || ID.contains("u") || ID.contains("v") || ID.contains("x") || ID.contains("w") || ID.contains("y") || ID.contains("z") ) {
			validacao = true;
		}else  if(ID.isEmpty()){
			validacao = false;
		}else {
			validacao = true;
		}
		
		return validacao;
	}
	
	
	
	/**
	 * Valida se o telefone está correto
	 * @param Telefone representa a variável Telefone
	 * @return retorna a validação se o telefone está correto
	 */
	
	public boolean validaTelefone(String Telefone) {
		boolean validacao;
		String numeros[]= {"0","1", "2", "3", "4", "5", "6","7", "8", "9"};
		
		if(Telefone.isEmpty()) {
			validacao = false;
		}else if(Telefone.contains("a") || Telefone.contains("b") || Telefone.contains("c") || Telefone.contains("d") || Telefone.contains("e") || Telefone.contains("f") || Telefone.contains("g") || Telefone.contains("h") || Telefone.contains("i") || Telefone.contains("j") || Telefone.contains("k") || Telefone.contains("l") || Telefone.contains("m") || Telefone.contains("n") || Telefone.contains("o") || Telefone.contains("p") || Telefone.contains("q") || Telefone.contains("r") || Telefone.contains("s") || Telefone.contains("t") || Telefone.contains("u") || Telefone.contains("v") || Telefone.contains("x") || Telefone.contains("w") || Telefone.contains("y") || Telefone.contains("z")){
			validacao = false;
			
		}else if(Telefone.length() != 8){
			validacao = false;
		}else {
			validacao = true;
		}
		
		return validacao;
	}
	
	
	public boolean validaLista(String Produto) {
		boolean valida;
		String numeros[]= {"0","1", "2", "3", "4", "5", "6","7", "8", "9"};

		if(Produto.isEmpty()) {
			valida = false;
		}else if(Produto.contains(numeros[0]) || Produto.contains(numeros[1]) || Produto.contains(numeros[2]) || Produto.contains(numeros[3]) || Produto.contains(numeros[4]) || Produto.contains(numeros[5]) || Produto.contains(numeros[6]) ||Produto.contains(numeros[7]) || Produto.contains(numeros[8]) || Produto.contains(numeros[9]) ) {
			valida = false;
			
		}
		else {
			valida = true;
		}
		
		return valida;
	}
	
	/**
	 * funcao responsavel por validar a lista de gastos
	 * @param valida confirma se a lista é válida.
	 * 
	 */





}
