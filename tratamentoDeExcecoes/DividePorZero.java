package tratamentoDeExcecoes;

import java.util.InputMismatchException;
import java.util.Scanner;

public class DividePorZero {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		/*
		 * o objetivo � fazer o usu�rio colocar as informa��es corretas para isso coloco
		 * meu c�digo dentro de um do while
		 */

		boolean continua = true;// enquanto as informa��es estiverem erradas
		do {
			try {

				System.out.print("Digite o primeiro n�mero: ");
				int a = sc.nextInt();
				System.out.print("Digite o n�mero diviso: ");
				int b = sc.nextInt();

				System.out.println("O resultado �: " + a / b);

				/*
				 * se meu c�digo consegui passar a divisao, ent�o a variavel continua passa a
				 * ser false pra sair do bloco do while
				 */

				continua = false;// quando as informa��es estiverem corretas

			}

			catch (InputMismatchException e1) {
				// aqui o erro foi capturado c�digo...exemplo:
				System.err.println("Os n�meros devem ser inteiros");
				sc.nextLine();// descarta a entrada que deu erro e libera novamente p o usu�rio

			} catch (ArithmeticException e2) {
				System.err.println("O divisor deve ser diferente de 0");
				sc.nextLine();

			}
			finally {
				System.out.println("Finally Executado");
			}
		} while (continua);

	}

}

/*
 * tratamento de exce��es:
 * 
 *  try(tente): onde n�s colocamos o c�digo que desejamos
 * executar(linha do try), caso esse c�digo gere um erro, posso capturar esse
 * erro(catch) 
 * 
 * catch: captura de erros.
 * 
 * finally: executado indepente de ter tido erro ou n�o
 * (n�o precisa, necessariamente ter um catch)
 * o erro vai ser tratado e 
 * o finally sempre vai ser executado
 * ele � utilizado para limpar vari�veis, fechar conex�es, strings de dados 
 * 
 * linhas 39 e 43
 * System.err.println()=> utilizadop imprimir uma mensagem de erro na tela do sistema(mudar a cor da fonte)
 * 
 * 
 * coment�rios do c�digo:
 *
 * 1-n�o � possivel dividir um n�mero por 0 int x = 1 / 0;//apresenta o erro
 * java.lang.ArithmeticException(exce��o aritim�tica)=> catch
 * ArithmeticException
 * 
 * 2- se eu informar texto em vez de numeros, vai dar o erro
 * InputMismatchException(exce��o de input)=> catch InputMismatchException
 * 
 * no catch coloco o erro que eu quero tratar: e atributo ele a uma
 * variavel(nesse carro e1: erro 1)
 */
