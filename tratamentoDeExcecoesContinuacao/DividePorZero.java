package tratamentoDeExcecoesContinuacao;

import java.util.InputMismatchException;
import java.util.Scanner;

public class DividePorZero {

	public static void divide(Scanner sc) throws InputMismatchException, ArithmeticException {
		System.out.print("Digite o primeiro número: ");
		int a = sc.nextInt();
		System.out.print("Digite o número diviso: ");
		int b = sc.nextInt();

		System.out.println("O resultado é: " + a / b);

	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		boolean continua = true;// enquanto as informações estiverem erradas
		do {
			try {

				divide(sc);
				/*
				 * se meu código consegui passar a divisao, então a variavel continua passa a
				 * ser false pra sair do bloco do while
				 */

				continua = false;// quando as informações estiverem corretas

			}

			// multi catch:
			catch (InputMismatchException | ArithmeticException e1) {
				// aqui o erro foi capturado código...exemplo:
				System.err.println("Numero inválido");

				// utilizando stacktrace:
				e1.printStackTrace();
				sc.nextLine();// descarta a entrada que deu erro e libera novamente p o usuário

			} finally {
				System.out.println("Finally Executado");
			}
		} while (continua);

	}

}

/*
 * Multi catch: possibiliade de tratar várias exceções no mesmo bloco(java 7 em
 * diante)
 * 
 * código de tratamento individual: catch (InputMismatchException e1) { // aqui
 * o erro foi capturado código...exemplo:
 * System.err.println("Os números devem ser inteiros"); sc.nextLine();//
 * descarta a entrada que deu erro e libera novamente p o usuário
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
 * sinaliza as possiveis excessões que o código pode lançar
 * isso ajuda um proximo programador a ja fazer um multi catch para tratar essas exceções
 * código na linha 8 e na linha 26 só chama o metodo divide recebendo o sc
 * 
 * exceções comuns:(criada uma nova classe exceções)
 */
