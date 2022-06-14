package varArgsArgumentosVariaveis;

public class MatematicaTest {

	public static void main(String[] args) {

		Matematica m = new Matematica();
		// a quantidade de parametros é indefinida
		double total = m.soma(2, 3, 4, 5, 6, 7, 8, 9, 10);
		System.out.println("Total = " + total);

		/*
		 * outra sitaxe para a mesma situação: double [] numeros = {98, 90,86, 95};
		 * double total = m.soma(numeros);
		 */
		
		//posso ainda "misturar os argumentos"
		double totalETitulo = m.somaEArgumento("Numeros", 123, 456, 789);
		System.out.println(totalETitulo);

	}

}
