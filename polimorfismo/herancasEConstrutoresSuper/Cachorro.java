package herancasEConstrutoresSuper;

public class Cachorro extends Animal {
	
	double peso;

	// chamando o construtor de uma super classe:
	public Cachorro() {
		super(30, "Carne");// para se referenciar ao construtor da super classe, utilizo o super()

		super.dormir();
		
		
	}

}
