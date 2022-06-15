package tratamentoDeExcecoesContinuacao;

import java.util.InputMismatchException;
import java.util.Scanner;

public class DividePorZero {

	public static void divide(Scanner sc) throws InputMismatchException, ArithmeticException {
		System.out.print("Digite o primeiro n�mero: ");
		int a = sc.nextInt();
		System.out.print("Digite o n�mero diviso: ");
		int b = sc.nextInt();

		System.out.println("O resultado �: " + a / b);

	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		boolean continua = true;// enquanto as informa��es estiverem erradas
		do {
			try {

				divide(sc);
				/*
				 * se meu c�digo consegui passar a divisao, ent�o a variavel continua passa a
				 * ser false pra sair do bloco do while
				 */

				continua = false;// quando as informa��es estiverem corretas

			}

			// multi catch:
			catch (InputMismatchException | ArithmeticException e1) {
				// aqui o erro foi capturado c�digo...exemplo:
				System.err.println("Numero inv�lido");

				// utilizando stacktrace:
				e1.printStackTrace();
				sc.nextLine();// descarta a entrada que deu erro e libera novamente p o usu�rio

			} finally {
				System.out.println("Finally Executado");
			}
		} while (continua);

	}

}

/*
 * Multi catch: possibiliade de tratar v�rias exce��es no mesmo bloco(java 7 em
 * diante)
 * 
 * c�digo de tratamento individual: catch (InputMismatchException e1) { // aqui
 * o erro foi capturado c�digo...exemplo:
 * System.err.println("Os n�meros devem ser inteiros"); sc.nextLine();//
 * descarta a entrada que deu erro e libera novamente p o usu�rio
 * 
 * } catch (ArithmeticException e2) {
 * System.err.println("O divisor deve ser diferente de 0"); sc.nextLine();
 * 
 * } stackTrace: 
 * pilha de erros:
 * e1.printStackTrace()=> imprime a pilha de erros encontrados
 * e1.getStackTrace()=> recebe um array com os erros identificados
 * e1.getMessage()=> mensagem contendo uma lista de erros no formado string
 * 
 * clausula throws: 
 * sinaliza as possiveis excess�es que o c�digo pode lan�ar
 * isso ajuda um proximo programador a ja fazer um multi catch para tratar essas exce��es
 * c�digo na linha 8 e na linha 26 s� chama o metodo divide recebendo o sc
 * 
 * exce��es comuns:(criada uma nova classe exce��es)
 */
