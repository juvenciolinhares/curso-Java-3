package herancaExtends;

/*super classe(classe que tem atributos comuns a v�rios objetos).
 * classe pai(s� pode ter uma)
 * reaproveitamento de c�digos;
 * por exemplo: atributos em comum, m�todos em comum.
 * cria��o de superclasses.
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
