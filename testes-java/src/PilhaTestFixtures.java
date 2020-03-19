import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PilhaTestFixtures {

	private static Pilha pilha;

	@BeforeAll
	static void setUpBeforeClass() throws Exception {

		System.out.println("Before all");
		pilha = new Pilha();

	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
		System.out.println("After all");
		pilha = null;
	}

	@BeforeEach
	void setUp() throws Exception {
		Livro livro1 = new Livro("A Livro 1");
		Livro livro2 = new Livro("A Livro 2");
		Livro livro3 = new Livro("A Livro 3");
		Livro livro4 = new Livro("A Livro 4");
		Livro livro5 = new Livro("A Livro 5");

		pilha.push(livro1);
		pilha.push(livro2);
		pilha.push(livro3);
		pilha.push(livro4);
		pilha.push(livro5);
	}

	@AfterEach
	void tearDown() throws Exception {
		int tamanho = pilha.count();

		while (tamanho > 0) {
			pilha.pop();
			tamanho--;
		}
	}

	@Test
	void testNaoAdicionaAlemLimite() {

		Livro livro6 = new Livro("max cavalera");
		try {
			pilha.push(livro6);
			fail();
		} catch (ArrayStoreException e) {

			assertTrue(true);
		}

		Livro livroRetornado = pilha.pop();

		assertEquals("A Livro 5", livroRetornado.getTitulo());
		System.out.println("executou o teste de adiconar alem do limite");

	}

	@Test
	void testNaoAdicionaAlemLimiteComException() {

		Livro livro6 = new Livro("max cavalera");

		Assertions.assertThrows(ArrayStoreException.class, () -> {
			pilha.push(livro6);
		});

		System.out.println("executou o teste de adiconar alem do limite com exception");

	}

	@Test
	void testNaoAdicionaForaPadraoNome() {

		pilha.pop();

		pilha.push(new Livro("A Livro"));

		Livro livroRetornado = pilha.pop();

		assertEquals("A Livro", livroRetornado.getTitulo());
		System.out.println("executou o teste de nome fora do padrao");

	}
}
