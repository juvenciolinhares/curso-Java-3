package exceptionHierarquicaDasClasses;

//criando a classe de exce��o:

//toda exce��o devem extender de exception:
public class SenhaInvalidaException extends Exception {
	
	public SenhaInvalidaException(String mensagem) {
		
		//cahamar o m�todo construtor que recebe uma string;
		super(mensagem);
	}

}
