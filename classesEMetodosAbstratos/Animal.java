package classesEMetodosAbstratos;

//ver comentario da linha 16
public abstract class Animal {
	double peso;
	String comida;
	
	public Animal(double peso,String comida ) {
		this.peso = peso;
		this.comida = comida;
	}
	void dormir() {
		System.out.println("Dormiu");
	}
	
	/*os metodos abstratos só podem existir numa classe que nao foi criada(instanciada)
	 * eles são metodos que as {}
	 */
	abstract void fazerBarulho();

}

/*classes abstratas podem ter métodos implementados(linha 12)
 * e metodos por implementar(linha 19)
 */
