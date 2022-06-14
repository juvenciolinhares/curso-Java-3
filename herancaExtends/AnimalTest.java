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
		 * a classe cachorro não tem nenhum metodo então, se ele nao fosse filha da
		 * classe animal, não teria como chamar nenhum método. mas
		 */

		System.out.println(toto.comida);
		System.out.println(carijo.peso);

		/*
		 * teste do É-UM: o cachorro É UM ANIMAL, então ele vai extender de animal; a
		 * galinha É UMA AVE, entao ela vai extender de ave; ave É UM ANIMAL, então ela
		 * vai extender de animal;
		 */

	}

}
