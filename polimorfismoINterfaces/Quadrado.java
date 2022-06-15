package polimorfismoINterfaces;

/*utilização sde uma interfaces:
 * 1-uso a palavra chave: implenets e o nome da interface na classe que eu quero utilizar 
 * 2- utilizo tofdos os metodos da interface
 */

public class Quadrado implements AreaCalculavel {

	double lado;

	public Quadrado(double lado) {
		this.lado = lado;
	}

	@Override
	public double calcularArea() {

		return lado * lado;
	}

}
