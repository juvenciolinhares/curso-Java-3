package herancaExtends;

/*super classe(classe que tem atributos comuns a vários objetos).
 * classe pai(só pode ter uma)
 * reaproveitamento de códigos;
 * por exemplo: atributos em comum, métodos em comum.
 * criação de superclasses.
 */

public class Animal {

	// atributos:
	double peso;
	String comida;

	// metodos:
	void dormir() {
		System.out.println("ZzZzZzzz...dormiu");
	}

	void fazerBarulho() {
		System.out.println("Fazer Barulho");
	}

}
