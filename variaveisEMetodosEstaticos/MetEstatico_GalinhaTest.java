package variaveisEMetodosEstaticos;

public class MetEstatico_GalinhaTest {

	public static void main(String[] args) {

		Galinha g1 = new Galinha();

		// o metodo retorna ele mesmo quantas vezes for necessário
		g1.botar().botar().botar();

		System.out.println(g1.ovos);

		Galinha g2 = new Galinha();

		g2.botar().botar();

		System.out.println("Primeira galinha: " + g1.ovos + " ovos");
		System.out.println("Segunda galinha: " + g2.ovos + " ovos");

		// print da variavel estática(soma de todas as galinhas da granja):
		System.out.println("Quantidade de ovos da granja: " + Galinha.ovosDaGranja + " ovos");

		System.out.println("A média de ovos da granja é: " + Galinha.mediaDeOvos(2) + " ovos");
	}

}
