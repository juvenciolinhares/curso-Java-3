package stringbufferStrnigbuilder;

public class StringMutavel {

	public static void main(String[] args) {
		
		//gerando instancias das classes StringBuffer e StringBuilder
		
		//posso criar com texto vazio();
		StringBuffer string0 = new StringBuffer();
		//posso criar com texto iniciado("texto")
		StringBuilder string1 = new StringBuilder("Java ");
		
		//possuem alguns metodos comuns �s strings, por exemplo:
		string0.toString();
		string1.length();
		
		//mas tambem possui metodos diferente das strings:
		
		string0.capacity();//informa a capacidade de armazenamento sem alocar mais mem�ria.
		
		//ver tamanho da string e capacidade da string:
		System.out.println(string1.length());
		System.out.println(string1.capacity());
		
		//metodo reverse:modifica a ordem os caracteres
		System.out.println("Antes da revers�o: " +string1);
		System.out.println("Depois da revers�o: " +string1.reverse());
		string1.reverse();//para voltar ao normal(sequencia correta);
		
		/*metodo append: concatena novos conteudos ao valor(MAIS UTILIZADO DE TODOS OS M�TDOS):
		 * pode receber v�rios tipos: char, int, double, etc.
		 */
		
		string1.append("Trabalhando ");
		System.out.println(string1);
		char[] c = {'c', 'o', 'm'};
		string1.append(c).append(" textos");
		System.out.println("string com a adi��o de outra string, um char e outra string(textos): " + string1);
		
		/*a virtual machine concatena em tempo de excu��o utilizando o stringbuilder
		 *portanto as duas proximas linhas s�o a mesma coisa
		 * a diferen�a � que na primeira, cada concatena��o � um novo objeto,
		 *diferente do stringBuilder que vai concatenando tudo a um objeto s�.
		 */
		 
		String s = "oi" + " como " + "vai voc�?";
		String sb = new StringBuilder("Oi").append(" como ").append("vai voc�?").toString();
		
		//remover conte�dos:
									//remover os 4 primeiros caracteres:
		String url = new StringBuilder("www.xti.com.br").delete(0, 4).toString();
		System.out.println("url com o www removido: " + url);
		

	}

}

/*MODIFICA��O DE TEXTOS:
 * String nao muda
 * Stringbuffer pode serr alterada
 * String x = "a";
 * 		  x = "b";
 *        x = "c";
*cada opera��o dessas gera uma nova string
*classes StringBuffer e StringBuilder(respresentam textos):
*foram criadas pra permitir modifica��es nas strings
*sem atrapalhar a performance da aplica��o.
*as classes StringBuffer e StringBuilder TEM OS MESMOS CONJUNTOS DE M�TODOS.
*a diferen�a � que os metodos da stringbuffer s�o sincronizados(�timos p/ ambientes multiprocessados)
*o stringbuilder n�o ent�o ele pode n�o funcionar muito bem se muitas requisi��es estiverem sendo feitas.
*a virtual machine concatena em tempo de excu��o utilizando o stringbuilder
* portanto as duas proximas linhas s�o a mesma coisa
*  a diferen�a � que na primeira, cada concatena��o � um novo objeto,
*diferente do stringBuilder que vai concatenando tudo a um objeto s�.
*/