import java.util.ArrayList;

public class Pilha {

	int limite = 5;

	ArrayList<Livro> pilha = new ArrayList<Livro>();

	public void push(Livro livro) {

		// RN1 - A pilha de livros nao pode exceder o limite
		if (pilha.size() >= limite) {
			throw new ArrayStoreException();
		}

		if (!livro.getTitulo().startsWith("A") && !livro.getTitulo().startsWith("O")) {
			return;
		}

		pilha.add(livro);
	}

	public Livro pop() {
		
		if  (pilha.size() == 0 ) {
			return null;
		}
		
		Livro livroRemovido = (pilha.get(pilha.size()-1));
				
		pilha.remove(pilha.size()-1);
		
		return livroRemovido;
	}

	public int count() {
		return pilha.size();
	}

}
