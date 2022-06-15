package tratamentoDeExcecoes;

import java.util.InputMismatchException;
import java.util.Scanner;

public class DividePorZero {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		/*
		 * o objetivo é fazer o usuário colocar as informações corretas para isso coloco
		 * meu código dentro de um do while
		 */

		boolean continua = true;// enquanto as informações estiverem erradas
		do {
			try {

				System.out.print("Digite o primeiro número: ");
				int a = sc.nextInt();
				System.out.print("Digite o número diviso: ");
				int b = sc.nextInt();

				System.out.println("O resultado é: " + a / b);

				/*
				 * se meu código consegui passar a divisao, então a variavel continua passa a
				 * ser false pra sair do bloco do while
				 */

				continua = false;// quando as informações estiverem corretas

			}

			catch (InputMismatchException e1) {
				// aqui o erro foi capturado código...exemplo:
				System.err.println("Os números devem ser inteiros");
				sc.nextLine();// descarta a entrada que deu erro e libera novamente p o usuário

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
 * tratamento de exceções:
 * 
 *  try(tente): onde nós colocamos o código que desejamos
 * executar(linha do try), caso esse código gere um erro, posso capturar esse
 * erro(catch) 
 * 
 * catch: captura de erros.
 * 
 * finally: executado indepente de ter tido erro ou não
 * (não precisa, necessariamente ter um catch)
 * o erro vai ser tratado e 
 * o finally sempre vai ser executado
 * ele é utilizado para limpar variáveis, fechar conexões, strings de dados 
 * 
 * linhas 39 e 43
 * System.err.println()=> utilizadop imprimir uma mensagem de erro na tela do sistema(mudar a cor da fonte)
 * 
 * 
 * comentários do código:
 *
 * 1-não é possivel dividir um número por 0 int x = 1 / 0;//apresenta o erro
 * java.lang.ArithmeticException(exceção aritimética)=> catch
 * ArithmeticException
 * 
 * 2- se eu informar texto em vez de numeros, vai dar o erro
 * InputMismatchException(exceção de input)=> catch InputMismatchException
 * 
 * no catch coloco o erro que eu quero tratar: e atributo ele a uma
 * variavel(nesse carro e1: erro 1)
 */
