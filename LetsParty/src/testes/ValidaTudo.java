package testes;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import model.*;

class ValidaTudo {
	
	private Validador val = new Validador();
	
	@Test
	void validaNome() {
		assertEquals(true, val.validaNome("Pedro")); //tem que retornar TRUE
		assertTrue(val.validaNome("Pedro")); //tem que retornar TRUE
		assertFalse(val.validaNome("Pedro1234")); //tem que retornar TRUE
	}
	
	@Test
	void validaTelefone() {
		assertEquals(true, val.validaTelefone("78946123")); //tem que retornar TRUE
		assertTrue(val.validaTelefone("35634026"));
		assertFalse(val.validaTelefone("aaaaaaaa")); //tem que retornar TRUE
		assertFalse(val.validaTelefone("7456123a")); //tem que retornar TRUE
		assertFalse(val.validaTelefone("")); //tem que retornar TRUE
	}
	
	@Test
	void validaLista() {
		assertEquals(true, val.validaLista("Uva")); //tem que retornar TRUE
		assertFalse(val.validaLista("123Milhas")); //tem que retornar TRUE
		assertFalse(val.validaLista("")); //tem que retornar TRUE
		assertTrue(val.validaLista("Conta")); //tem que retornar TRUE
	}
	
	@Test
	void validaID() {
		assertEquals(true, val.validaID("adifa133jl5n4")); //tem que retornar TRUE
		assertFalse(val.validaID("fhahf!!?*")); //tem que retornar TRUE
		assertFalse(val.validaID("")); //tem que retornar TRUE
		assertTrue(val.validaID("1234abcd")); //tem que retornar TRUE
	}

}
