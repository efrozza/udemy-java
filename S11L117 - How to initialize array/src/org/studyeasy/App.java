package org.studyeasy;

public class App {

	public static void main(String[] args) {
		
		// declarando um array de inteiros		
		int[] arrayDeInteiros;
		
		//definindo quantas posições terá o array
		//vai indexar de 0 a 9
		arrayDeInteiros = new int[10];
		
		//setando valor na posição 5
		arrayDeInteiros[5] = 10;		
		arrayDeInteiros[9] = 99;
		
		// imprimindo posição 5
		System.out.println(arrayDeInteiros[5]);
		
		// essa linha estoura o array, ja q vai de 0 a 9
		System.out.println(arrayDeInteiros[9]);
		
		// essa sysout nao faz sentido
		System.out.println(arrayDeInteiros);
		
		
		

	}

}
