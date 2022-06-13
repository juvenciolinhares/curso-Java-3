package variaveisEMetodosEstaticos;

public class Galinha {

	/*
	 * criar uma variavel global: variaveis globais s�o criadas uma unica vez,
	 * diferente de variavel local que � criada v�rias vezes.
	 */
	public static int ovosDaGranja;

	public int ovos; // total de ovos da galinha(objeto)

	public Galinha botar() {
		this.ovos++;

		/*
		 * para chamar uma variavel est�tica usamos: classe.varest�tica(diferente de
		 * chamar: obj.var)
		 */
		Galinha.ovosDaGranja++;

		// para que eu possa chamar ele mesmo quantas vezes eu quiser:

		return this;

	}

	// criar m�todos est�ticos:

	public static double mediaDeOvos(int galinhas) {

		return ovosDaGranja / galinhas;
	}

}
