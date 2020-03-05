import java.math.BigDecimal;

public class TesteBigDecimal {

	public static void main(String[] args) {
		
		double x = 1.05;
		double y = 2.55;		
		
		System.out.println(x + y);
		
		// usando os valores entre aspas, os valores são arredondandos 
		
		// converter double para string
		BigDecimal d1 = new BigDecimal(String.valueOf(x));
		
		BigDecimal d2 = new BigDecimal("2.55");
		
		System.out.println(d1.add(d2));
		

	}

}
