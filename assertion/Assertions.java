package assertion;

import java.util.Scanner;

public class Assertions {

	public static void main(String[] args) {
		//criando e utilizando assertions-> p criar: crio uma classe chamada assertions
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Entre um numero de 0 a 10 ");
		int numero = sc.nextInt();
		
		//utilizando o assert para verificar a respota do usu�rio:
		assert (numero >= 0 && numero <=10) : "Numero inv�lido " + numero;
		
		System.out.println("voce digitou: " + numero);

	}

}
/*
 * por padr�o o programa n�o executa o assert
 * por default as asserts est�o desligadas por que 
 * quando o programa vai para produ��o elas n�o devem funcionar.
 * o papel das asserts � auxiliar o programador enquanto ele cria o programa.
 * para habilitar a execu��o das asserts no eclipse
 * 1- vou na execu��o da aplica��o
 * 2- run configurations
 * 3-Aba argumentos
 * 4- coloco o argumento -ea no campo da vm arguments(virtual machine)
 * 5-clico em run
 * quiando eu rodar o programa e digitar um numero errado 
 * aparece o erro:AssertionError
 */
