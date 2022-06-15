package polimorfismoClasseFinal;
//se uma classe ou metodo for do tipo final, nenhuma outra classe pode implementar ela.
public abstract class Animal {
	double peso;
	String comida;
	
	/*o metodo dormir pode ser subescrito nas suas subclasses, mas se ele for final nao pode 
	 * final void dormir(){}
	 */
	void dormir() {
		System.out.println("Dormiu");
	}
	abstract void fazerBarulho();

}

/*
 * modificador final:
 * em variaveis: impede a alteração do valor
 * em classes: impede que eleas sejam extendidas
 * em métodos: impede que eles sejam sobrescritos
 */
