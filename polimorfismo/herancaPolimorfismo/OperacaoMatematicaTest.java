package herancaPolimorfismo;

public class OperacaoMatematicaTest {

	public static void calcule(OperacaoMatematica operacao, double x, double y) {
		System.out.println(operacao.calcular(x, y));

	}

	/* sem polimorfismo:
	public static void calculeSemPolimorfismo(String operacao, double x, double y) {
		if(operacao.equals("Soma")){
		System.out.println(x + y);
		
	}else if(operacao.equals("Multiplicacao")) {
		System.out.println(x * y);
	}
	*/

	public static void main(String[] args) {
		calcule(new Soma(), 5, 5);
		calcule(new Multiplicacao(), 5, 5);

		/*
		 * executando o mesmo m�todo(calcule) recebemos resultados diferentes por que
		 * cada opera��o tem uma forma diferente(somar, multiplicar) e se comporta de
		 * maneira diferente isso � o polimorfismo.
		 */

	}

}
