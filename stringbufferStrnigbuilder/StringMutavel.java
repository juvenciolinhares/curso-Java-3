package stringbufferStrnigbuilder;

public class StringMutavel {

	public static void main(String[] args) {
		
		//gerando instancias das classes StringBuffer e StringBuilder
		
		//posso criar com texto vazio();
		StringBuffer string0 = new StringBuffer();
		//posso criar com texto iniciado("texto")
		StringBuilder string1 = new StringBuilder("Java ");
		
		//possuem alguns metodos comuns às strings, por exemplo:
		string0.toString();
		string1.length();
		
		//mas tambem possui metodos diferente das strings:
		
		string0.capacity();//informa a capacidade de armazenamento sem alocar mais memória.
		
		//ver tamanho da string e capacidade da string:
		System.out.println(string1.length());
		System.out.println(string1.capacity());
		
		//metodo reverse:modifica a ordem os caracteres
		System.out.println("Antes da reversão: " +string1);
		System.out.println("Depois da reversão: " +string1.reverse());
		string1.reverse();//para voltar ao normal(sequencia correta);
		
		/*metodo append: concatena novos conteudos ao valor(MAIS UTILIZADO DE TODOS OS MÉTDOS):
		 * pode receber vários tipos: char, int, double, etc.
		 */
		
		string1.append("Trabalhando ");
		System.out.println(string1);
		char[] c = {'c', 'o', 'm'};
		string1.append(c).append(" textos");
		System.out.println("string com a adição de outra string, um char e outra string(textos): " + string1);
		
		/*a virtual machine concatena em tempo de excução utilizando o stringbuilder
		 *portanto as duas proximas linhas são a mesma coisa
		 * a diferença é que na primeira, cada concatenação é um novo objeto,
		 *diferente do stringBuilder que vai concatenando tudo a um objeto só.
		 */
		 
		String s = "oi" + " como " + "vai você?";
		String sb = new StringBuilder("Oi").append(" como ").append("vai você?").toString();
		
		//remover conteúdos:
									//remover os 4 primeiros caracteres:
		String url = new StringBuilder("www.xti.com.br").delete(0, 4).toString();
		System.out.println("url com o www removido: " + url);
		

	}

}

/*MODIFICAÇÃO DE TEXTOS:
 * String nao muda
 * Stringbuffer pode serr alterada
 * String x = "a";
 * 		  x = "b";
 *        x = "c";
*cada operação dessas gera uma nova string
*classes StringBuffer e StringBuilder(respresentam textos):
*foram criadas pra permitir modificações nas strings
*sem atrapalhar a performance da aplicação.
*as classes StringBuffer e StringBuilder TEM OS MESMOS CONJUNTOS DE MÉTODOS.
*a diferença é que os metodos da stringbuffer são sincronizados(ótimos p/ ambientes multiprocessados)
*o stringbuilder não então ele pode não funcionar muito bem se muitas requisições estiverem sendo feitas.
*a virtual machine concatena em tempo de excução utilizando o stringbuilder
* portanto as duas proximas linhas são a mesma coisa
*  a diferença é que na primeira, cada concatenação é um novo objeto,
*diferente do stringBuilder que vai concatenando tudo a um objeto só.
*/