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
		
		//outro exemplo, usando os pes�aos como delimitador:
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
/*tokeniza��o:
 * pegar grandes peda�os e dividir em pequenos peda�os
 * s�o compostos de:
 * 1- tokens: peda�os de dados
 * exemplo: "XHTML; CSS; JAVA"(separados por ;)
 * o processo de partir os dados � a tokeniza��o(feita pelo m�todo String.split();)
 * 2- delimitadores: express�es que separam os tokens uns dos outros.
 */
