package herancaExtends;

public class AnimalTest {

	public static void main(String[] args) {
		Cachorro toto = new Cachorro();
		Galinha carijo = new Galinha();

		toto.comida = "Carne";
		toto.dormir();
		carijo.dormir();
		carijo.peso = 2.5;
		/*
		 * a classe cachorro n�o tem nenhum metodo ent�o, se ele nao fosse filha da
		 * classe animal, n�o teria como chamar nenhum m�todo. mas
		 */

		System.out.println(toto.comida);
		System.out.println(carijo.peso);

		/*
		 * teste do �-UM: o cachorro � UM ANIMAL, ent�o ele vai extender de animal; a
		 * galinha � UMA AVE, entao ela vai extender de ave; ave � UM ANIMAL, ent�o ela
		 * vai extender de animal;
		 */

	}

}
