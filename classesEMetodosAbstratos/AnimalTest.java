package classesEMetodosAbstratos;

public class AnimalTest {

	public static void main(String[] args) {
		
		/*a classe animal nao pode mais ser instanciada
		 * por que ela � abstrata,
		 */
		//Animal animal = new Animal(0, null);
		Animal cachorro = new Cachorro(0, null);
		Animal galinha = new Galinha(0, null);

	}

}

/*qualquer classe que seja filha da classe animal(abstrata)
 * vai ser obrigada a implementar o m�todo que n�o foi implementado
 * nesse caso o m�todo fazer barulho=> abstract void fazerBarulho();
 * isso s� n�o vale para subclasses que tamb�m sejam abstratas
 */
