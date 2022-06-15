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
 * em variaveis: impede a altera��o do valor
 * em classes: impede que eleas sejam extendidas
 * em m�todos: impede que eles sejam sobrescritos
 */
