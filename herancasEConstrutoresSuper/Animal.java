package herancasEConstrutoresSuper;

public class Animal {

	String comida;
	double peso;
	
	//controle de acesso(private):
	private int serial;
	
	//visto apenas pelas subclasses:
	protected int id;

	/*construtor chamando outro
	public Animal() {
		this (0, null);
	}
	 */

	public Animal(double peso, String comida) {
		this.peso = peso;
		this.comida = comida;
	}

	void dormir() {
		System.out.println("ZzZzzzzz... Dormiu");
	}
	void fazerBarulho() {
		System.out.println("Fazer barulho");
	}

}
