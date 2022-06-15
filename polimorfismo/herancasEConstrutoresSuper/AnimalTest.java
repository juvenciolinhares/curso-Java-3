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
		 * todas as classes s�o instancias da classe object
		 * exemplos de m�todos da classe object:
		 */
		toto.equals(carijo);//esse m�todo compara dois objetos
		carijo.hashCode(); //gera uma esp�cie de n�mero serial
		toto.getClass();// tipo da classe desse objeto
		carijo.toString(); //representa��o em string desse objeto
		
		
	}

}
