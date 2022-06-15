package classesEMetodosAbstratos;

public class AnimalTest {

	public static void main(String[] args) {
		
		/*a classe animal nao pode mais ser instanciada
		 * por que ela é abstrata,
		 */
		//Animal animal = new Animal(0, null);
		Animal cachorro = new Cachorro(0, null);
		Animal galinha = new Galinha(0, null);

	}

}

/*qualquer classe que seja filha da classe animal(abstrata)
 * vai ser obrigada a implementar o método que não foi implementado
 * nesse caso o método fazer barulho=> abstract void fazerBarulho();
 * isso só não vale para subclasses que também sejam abstratas
 */
