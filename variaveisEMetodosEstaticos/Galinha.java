package variaveisEMetodosEstaticos;

public class Galinha {

	/*
	 * criar uma variavel global: variaveis globais são criadas uma unica vez,
	 * diferente de variavel local que é criada várias vezes.
	 */
	public static int ovosDaGranja;

	public int ovos; // total de ovos da galinha(objeto)

	public Galinha botar() {
		this.ovos++;

		/*
		 * para chamar uma variavel estática usamos: classe.varestática(diferente de
		 * chamar: obj.var)
		 */
		Galinha.ovosDaGranja++;

		// para que eu possa chamar ele mesmo quantas vezes eu quiser:

		return this;

	}

	// criar métodos estáticos:

	public static double mediaDeOvos(int galinhas) {

		return ovosDaGranja / galinhas;
	}

}
