package stringSplitTokenDelimitadores;

public class StringToken {

	public static void main(String[] args) {
		String tecnologias = "XHTML; CSS; JavaScript; jQuery; Java";
		//quebrar pelo delimitador ;
		String[] tokens = tecnologias.split(";");
		//quantidade de elemntos:
		System.out.println(tokens.length + " tokens");
		//imprimir os tokens percorrendo elementos do array:
		for(String token : tokens) {
			System.out.println(token);
		}
		
		//outro exemplo, usando os pesçaos como delimitador:
		String xti = "Venha trabalhar na XTI";
		String [] tokensxti = xti.split(" ");
		System.out.println(tokensxti.length + " Tokens");
		for(String token : tokensxti) {
			System.out.println(token);
		}
		
		//usando a letra a como delimitador;
		String xtiLetraa = "Venha trabalhar na XTI";
		String [] tokensxtiLetraa = xti.split("a");
		System.out.println(tokensxtiLetraa.length + " Tokens");
		for(String token : tokensxtiLetraa) {
			System.out.println(token);
		}
		
		

	}

}
/*tokenização:
 * pegar grandes pedaços e dividir em pequenos pedaços
 * são compostos de:
 * 1- tokens: pedaços de dados
 * exemplo: "XHTML; CSS; JAVA"(separados por ;)
 * o processo de partir os dados é a tokenização(feita pelo método String.split();)
 * 2- delimitadores: expressões que separam os tokens uns dos outros.
 */
