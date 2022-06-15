package polimorfismoClasseFinal;

//se uma classe ou metodo for do tipo final, nenhuma outra classe pode implementar ela.

public  class Cachorro extends Animal {
	@Override
	final void fazerBarulho() {
		System.out.println("Au, Au! ");
	}
	

}
/*
 * modificador final:
 * em variaveis: impede a alteração do valor
 * em classes: impede que eleas sejam extendidas
 * em métodos: impede que eles sejam sobrescritos
 */
