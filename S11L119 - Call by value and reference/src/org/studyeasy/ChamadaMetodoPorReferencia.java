package org.studyeasy;

public class ChamadaMetodoPorReferencia {
	
	// explicação sobre passagem por parametro e por referencia
	// https://www.youtube.com/watch?v=B2w7bESRZNU
	
	// esse exemplo do curso eh estranho mas basicamente tipos primitivos sao passados por valor
	// se passamos uma instancia e damos um new estamos criando uma outra refencia de memoria, se 
	// fizermos instancia.set estamos alterando o valor
	
	public static void main(String[] args) {

		String[] nomes = { "Joao", "Pedro", "Maria", "Jose" };
		
		ChamadaMetodoPorReferencia mostraNomes = new ChamadaMetodoPorReferencia();
		
		mostraNomes.displayNomes(nomes);
		
		System.out.println(nomes[0]);

	}

	void displayNomes(String[] nomesParam) {
		
		// ira sobre nomesParam e cada iterracao valoriza a variavel do tipo String, nome
		
		for (String nome: nomesParam) {
			System.out.println(nome);
		}
		
		nomesParam[0] = "Novonome";
	}
}
