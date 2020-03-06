package org.studyeasy;

public class Hello {

	public static void main(String[] args) {
		
		
		// declaração ok pq short cabe no int
		// feito um casting implicito
		short x = 5;
		int y =  x;
		
		System.out.println(y);
		
		// se tentarmos colocar um int em um short o java nao consegue
		
		// fezer um casting implicito
		// para o jova conseguir fazer o casting as variaveis deve ter tipos compativeis, ou seja, Integer com Integer, float com float
		
		int y2 =  10;
		short x2 = (short) y2;
		
		System.out.println(y2);		
		int y3 = 10;
		short x3 = (byte) y3;
		
		System.out.println(y3);		
		// casting entre float em double		
		
		double v2 = 20.0d;
		float v1 = (float) v2;		
		System.out.println(v2);
		
		double v3 = 20.0123456789d;
		float v4 = (float) v3;
		System.out.println(v4);
		
		// casting pontos decimais x int
		
		float a = 10.0f;
		int b = (int) a;
		
		System.out.println(b);
		
		// casting float e load
		
		float f1 = 10.0f;
		long l1 = (long) f1;
		
		System.out.println(l1);
		
		// casting float e load
		
		float f2 = 10.532f;
		long l2 = (long) f2;
		
		System.out.println(l2);
		
		
		
		

	}

}
