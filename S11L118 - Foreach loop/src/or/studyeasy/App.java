package or.studyeasy;

public class App {
	
	public static void main(String[] args) {
		
		String[] timesDeFutebol = { "Inter", "Flamengo", "S�o Paulo", "Corinthians", "Botafogo" };
		
		for (int i=0; i < timesDeFutebol.length; i++) {
			System.out.println(timesDeFutebol[i]);
		}
		
		// usando forEach ao inves de for
		
		for(String nomeDotime: timesDeFutebol) {
			System.out.println("times do forEach " + nomeDotime);
		}
		
		System.out.println("S�o " + timesDeFutebol.length + "times");
		
		
	}


	

}
