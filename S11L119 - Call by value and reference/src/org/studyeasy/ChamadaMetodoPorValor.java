package org.studyeasy;

public class ChamadaMetodoPorValor {

	public static void main(String[] args) {

		int value = 10;
		System.out.println("Valor do variavel value no main " + value);
		// temos que criar uma instancia de App para poder acessar os metodos da classe
		// ja que não sao estaticos
		ChamadaMetodoPorValor app = new ChamadaMetodoPorValor();

		// chamada por valor
		app.displayValue(value);

		System.out.println("Valor do variavel value no main " + value);

	}

	// se esse metodo fosse escrito como static
	// poderia ser acessado no main com displayValue(5)

	void displayValue(int value) {
		System.out.println("Valor do value no metodo " + value);

		value = 20;

		System.out.println("Valor do value no metodo " + value);
	}

}
