import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class CalculadoraTest {

	// quando executamos o junit busca os metodos anotados como Test e faz a
	// execução

	@Test
	void testSoma() {
		Calculadora calculadora = new Calculadora();
		int resultadoEsperado = 10;

		int resultado = calculadora.soma(4, 6);

		// verifica se o retorno de uma condição for verdadeiro para passar o teste
		// senão retorna falho
		// assertTrue(resultado == resultadoEsperado);

		// compara se as variaveis tem o mesmo valor
		assertEquals(resultadoEsperado, resultado);

	}

	@Test
	void testaAritmeticException() {
		Calculadora calc = new Calculadora();

		// caso nossa classe testada possa lançar uma exceção 
		Assertions.assertThrows(ArithmeticException.class, () -> {
			calc.divide(2, 0);
		});

	}

}
