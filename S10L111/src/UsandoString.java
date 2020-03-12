
public class UsandoString {

	public static void main(String[] args) {
		
		String nome = "Everton";
		String sobrenome = "Frozza";
		
		String nomeCompleto = nome.concat(" ").concat(sobrenome);
		
		nomeCompleto = nomeCompleto.replace("Everton", "Evertinho");
		
		System.out.println(nomeCompleto);
		
		if (nomeCompleto.equals("Everton Frozza")) {
			System.out.println("autorizado");
		} else {
			System.out.println("não autorizado");
		}

	}

}
