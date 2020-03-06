package org.study.carro;

public class Fusca extends Carro implements FuncoesCarro {

	@Override
	public String acelerar() {
		// TODO Auto-generated method stub
		return "acelerando a 30km/h";
	}

	@Override
	public String frear() {
		// TODO Auto-generated method stub
		return "freando em 30s";
	}

	@Override
	public String virarEsquerda() {
		// TODO Auto-generated method stub
		return "virando a esquerda com 3 voltas no volante";
	}

}
