package herancasEConstrutoresSuper;

public class AnimalTest {
	public static void main(String[] args) {
		
		//instanciando toto chamando a classe pai
		Animal toto = new Cachorro();
		
		toto.comida ="Carne";
		toto.dormir();
		
		//instanciando carijo chamando a classe pai
		Animal carijo = new Galinha ();
		carijo.dormir();
		
		//verificar o tipo de classe:
		System.out.println(toto instanceof Cachorro);
		System.out.println(toto instanceof Animal);
		
		/*classe object:
		 * todas as classes são instancias da classe object
		 * exemplos de métodos da classe object:
		 */
		toto.equals(carijo);//esse método compara dois objetos
		carijo.hashCode(); //gera uma espécie de número serial
		toto.getClass();// tipo da classe desse objeto
		carijo.toString(); //representação em string desse objeto
		
		
	}

}
