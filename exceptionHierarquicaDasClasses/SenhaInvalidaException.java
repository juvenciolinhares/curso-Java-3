package exceptionHierarquicaDasClasses;

//criando a classe de exceção:

//toda exceção devem extender de exception:
public class SenhaInvalidaException extends Exception {
	
	public SenhaInvalidaException(String mensagem) {
		
		//cahamar o método construtor que recebe uma string;
		super(mensagem);
	}

}
