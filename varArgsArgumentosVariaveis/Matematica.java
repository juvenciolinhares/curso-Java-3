package varArgsArgumentosVariaveis;

public class Matematica {

	// soma de n n�meros:
	double soma(double... numeros) {
		double total = 0;
		for (double n : numeros) {
			total += n;
		}
		return total;
	}
	
	//posso ainda "misturar os argumentos"
	double somaEArgumento( String titulo, double... numeros) {
		System.out.println(titulo);
		double total = 0;
		for (double n : numeros) {
			total += n;
		}
		return total;
	}

}

/*
 * outra op��o de sintaxe: double soma (double [] numeros) { double total = 0;
 * for(double n : numeros) { total += n; } return total; } essa sintaxe �
 * aplicada nas linhas 13 e 14 da classe test
 */
