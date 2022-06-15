package tratamentoDeExcecoesContinuacao;


import herancaExtends.Animal;
import herancaExtends.Galinha;

public class ExcecoesComuns {

	static int[] arrayNull;
	
	static int[] arrayNull1 = new int[0];

	public static void main(String[] args) {
		
		/*NullPointerException
		*System.out.println(arrayNull.length);//tentando acessar o obj do tipo nulo
		*/
		
		/*ArithmeticException:
		* int x = 5 / 0;
		*/
		
		/*ArrayIndexOutOfBoundsException
		*System.out.println(arrayNull1[1]);
		*/
		
		/*criando um animal galinha a 
		 * e uma galinha g que recebe a galinha a. 
		 * isso é perfeitamente possivel
		 */
		Animal a = new Galinha();
		Galinha g = (Galinha) a;
		
		/*mas se eu tentar colocar a galinha dentro
		 * de uma variavel do tipo cachorro vou ter erro:ClassCastException
		 */
		
		/*ClassCastException:
		*Animal a = new Galinha();
		*Cachorro c = (Cachorro) a;
		*/
		
		/*NumberFormatException:
		*int inteiro = Integer.parseInt("x");
		*System.out.println(inteiro);
		*/

	}

}

/*
 * possíveis erros:
 *  1-NullPOinterException:acessar um obj do tipo nulo(nao existe);
 * 2-ArithmeticException: tentar dividir um numero por 0;
 * 3- ArrayIndexOutOfBoundsException: tentar acessar uma posição do array que não existe
 * quando tent realizar um teste de um 
 * 4-ClassCastExceptio: erro de cast, de conversão de tipos de uma forma explicita
 * 5-NumberFormatException: tentar converter string em número, mas essa string está num formato desconhecido
 */
