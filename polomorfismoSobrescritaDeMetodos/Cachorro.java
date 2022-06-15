package polomorfismoSobrescritaDeMetodos;

public class Cachorro extends Animal {

	double peso;
	
	public Cachorro() {
		super(30, "Carne");
		
	}
	
	/*sobrescrever o metodo fazer baralho
	 * para fazer o barulho especifico do cachorro: 
	 */
	
	void fazerBarulho() {
		System.out.println("AU, AU!");
	}
	

}
