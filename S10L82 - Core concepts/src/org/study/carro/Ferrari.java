package org.study.carro;

public class Ferrari extends Carro implements FuncoesCarro {
	
	private String acionarABS () {
		return "acionar o ABS";
	}

	@Override
	public String acelerar() {
		// TODO Auto-generated method stub
		return "acelerando a 200km/h";
	}

	@Override
	public String frear() {
		// TODO Auto-generated method stub
		System.out.println(acionarABS());
		return "freando em 5s";
	}

	@Override
	public String virarEsquerda() {
		// TODO Auto-generated method stub
		return "virando a esquerda com leve toque no volante";
	}

	
	
}
