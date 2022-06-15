package assertion;

import java.util.Scanner;

public class Assertions {

	public static void main(String[] args) {
		//criando e utilizando assertions-> p criar: crio uma classe chamada assertions
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Entre um numero de 0 a 10 ");
		int numero = sc.nextInt();
		
		//utilizando o assert para verificar a respota do usuário:
		assert (numero >= 0 && numero <=10) : "Numero inválido " + numero;
		
		System.out.println("voce digitou: " + numero);

	}

}
/*
 * por padrão o programa não executa o assert
 * por default as asserts estão desligadas por que 
 * quando o programa vai para produção elas não devem funcionar.
 * o papel das asserts é auxiliar o programador enquanto ele cria o programa.
 * para habilitar a execução das asserts no eclipse
 * 1- vou na execução da aplicação
 * 2- run configurations
 * 3-Aba argumentos
 * 4- coloco o argumento -ea no campo da vm arguments(virtual machine)
 * 5-clico em run
 * quiando eu rodar o programa e digitar um numero errado 
 * aparece o erro:AssertionError
 */
