package polomorfismoSobrescritaDeMetodos;

public class AnimalTest {
	
	public static void barulho(Animal animal) {
		animal.fazerBarulho();
	}
	
	/*fazer barulho sem polimorfismo:
	 * desvantagem: deixa o código mais complexo e extenso.
	 */
	public static void barulhoSemPolimorfismo(String animal) {
		if(animal.equals("Cachorro")) {
			System.out.println("Au, Au !");
		}else if(animal.equals("Galinha")) {
			System.out.println("Có,có !");
		}
	}

	public static void main(String[] args) {
		
		Animal toto = new Cachorro();

		Animal carijo = new Galinha();

		Animal generico = new Animal(0, null);

		toto.fazerBarulho();
		carijo.fazerBarulho();
		generico.fazerBarulho();
		
		barulho(toto);
		barulho(carijo);
		
		barulhoSemPolimorfismo("Cachorro");
		barulhoSemPolimorfismo("Galinha");
		
		

	}

}
