package exceptionHierarquicaDasClasses;

//testar a exceção senhaInvalidaException
public class SenhaTest {

	/*
	 * 1- crio um metodo autenticar que recebe uma senha 2- declaro na assintatura
	 * do metodo que ele pode lancar uma SenhaInvalidaException declaração: throws
	 * SenhaInvalidaException;
	 */
	static void autenticar(String senha) throws SenhaInvalidaException {
		// esse metodo verifica se a senha informada = correta;
		if ("123".equals(senha)) {
			// se for correta o usuário está autenticado
			System.out.println("Autenticado");
		} else {
			// senha incorreta, lanço uma exceção de senhaInvalidaException:
			throw new SenhaInvalidaException("Senha incorreta");
		}
	}

	public static void main(String[] args) {
		// testar o método:try catch:
		try {
			/*
			 * chamar metodo de autenticação informando a senha: se a senha for correta vou
			 * receber a msg autenticado, se nao vou receber senha incorreta
			 */
			autenticar("1234");

			// no catch capturo uma SenhaInvalidaException e capturo a mensagem informada no
			// else.
		} catch (SenhaInvalidaException erro) {

			System.out.println(erro.getMessage());
			
			//nossa exceção também suporta o printStackTrace:(pilha de execução onde encontrou o erro)
			erro.printStackTrace();

		}

	}

}
