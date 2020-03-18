import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CalculadoraTest {
	
	// quando executamos o junit busca os metodos anotados como Test e faz a execu��o

	@Test
	void testSoma() {
		Calculadora calculadora = new Calculadora();
		int resultadoEsperado = 10;
		
		int resultado = calculadora.soma(4, 6);
		
		// verifica se o retorno de uma condi��o for verdadeiro para passar o teste sen�o retorna falho
		//assertTrue(resultado == resultadoEsperado);
		
		// compara se as variaveis tem o mesmo valor
		assertEquals(resultadoEsperado, resultado);
		
		
	}
	

}
