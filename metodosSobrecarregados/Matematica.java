package metodosSobrecarregados;

public class Matematica {

	// calculo da m�dia e assinatura do m�todo

	double media(int x) {
		System.out.print("media(int x): ");
		return x;
	}

	double media(int x, int y) {
		System.out.print("media(int x, int y): ");
		return (x + y) / 2;
	}

	// media de strings:
	double media(String x, String y) {
		System.out.print("media(String x, String y): ");

		// converter string em n�mero:
		int ix = Integer.parseInt(x);
		int iy = Integer.parseInt(y);

		return (ix + iy) / 2;
	}

	/*
	 * numero ilimitado de n�meros: 
	 * crio um m�todo que realiza a soma:
	 */
	double soma(int... numeros) {
		System.out.println("soma(int... numeros): ");
		double total = 0;
		for (double n : numeros) {
			total += n;
		}
		return total;
	}

	double media(int... numeros) {
		System.out.println("media(int... numeros): ");

		return this.soma(numeros)/numeros.length;

	}

}
