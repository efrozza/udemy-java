package org.studyeasy;

import org.study.carro.Ferrari;
import org.study.carro.Fusca;

public class TesteCarro {

	public static void main(String[] args) {
		
		Ferrari ferrari = new Ferrari();
		ferrari.setAno(2020);
		ferrari.setMarca("Ferrari");
		ferrari.setModelo("Maranelo");
		
		System.out.println(ferrari.acelerar());
		System.out.println(ferrari.frear());
		
		Fusca fusca = new Fusca();
		ferrari.setAno(1970);
		ferrari.setMarca("Volks");
		ferrari.setModelo("fucao");
		
		System.out.println(fusca.acelerar());
		

	}

}
