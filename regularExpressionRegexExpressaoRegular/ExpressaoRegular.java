package regularExpressionRegexExpressaoRegular;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExpressaoRegular {

	public static void main(String[] args) {

		/*
		 * criando o padrão: se eu vou validar um padrão, entao a outra string tem que
		 * ser igual ao padrão String padrao = "Java"; String texto = "Java"; validar um
		 * padrão: boolean ocorrenciaDePadrao = texto.matches(padrao);
		 * System.out.println(ocorrenciaDePadrao);
		 */

		// forma mais enxuta:
		boolean ocorrenciaDePadrao = "Java".matches("Java");
		System.out.println(ocorrenciaDePadrao);

		// expressoes regulares com letras maiusculas e minusculas:
		boolean ocorrenciaDePadraoLetraMaiusMinu = "Java".matches("java");
		System.out.println(ocorrenciaDePadraoLetraMaiusMinu);// false pq um começa maiuscula e outro minuscula

		/*
		 * utilizando MODIFICADORES:
		 *  obs.: posso colocar quantos modificadores quiser
		 * numa expressão só ex.:boolean b = "Java".matches("(?imxs)java");
		 */

		// (?i), ignora maiusculas e minusculas:
		boolean ocorrenciaDePadraoMaiusMinus = "Java".matches("(?i)java");
		System.out.println(ocorrenciaDePadraoMaiusMinus);

		// (?im), ignora maiusculas e minusculas e avaliar várias linhas:
		boolean ocorrenciaDePadraoMaiusMinusVariasLInhas = "Java".matches("(?im)java");
		System.out.println(ocorrenciaDePadraoMaiusMinusVariasLInhas);
		
		
		//utilizando METACARACTERES:
		
		//um caracter qualquer:
		boolean metac = "@".matches(".");
		System.out.println("um caracter qualquer: " + metac);//true
		//obs. a quantidade de caracteres a serem avaliados tem que ser a mesma dos pontos se não da false:
		 metac = "7@".matches(".");
		System.out.println("dois caracteres e um ponto dá " + metac + " por que são quantidades diferentes");//false
		metac ="2345".matches("....");
		System.out.println("dá " + metac + " por que pontos e caracteres têm a mesma quantidade");//true
		
		
		//ocorrencia de um digito:
		metac ="2".matches("\\d");//usar \\ em vez de \
		System.out.println("ocorrencia de um digito: " + metac);//true
		
		//p encontrar 2 digitos, uso dois metacaracteres de digitos: 
		metac ="22".matches("\\d\\d");
		System.out.println("ocorrencia de dois digitos: " + metac);//true
		
		metac ="a".matches("\\d");
		System.out.println("ocorrencia de um digito: " + metac + " por que a não é número");
		
		//ocorrencia de um letras e números:
		metac ="2".matches("\\w");
		System.out.println("ocorrencia de um letras e números: " + metac);//true
		metac ="a".matches("\\w");
		System.out.println("ocorrencia de um letras e números: " + metac);//true
		metac ="@".matches("\\w");
		System.out.println("ocorrencia de um letras e números: " + metac+ " por que a não é número nem letra");//false
		metac ="#".matches("\\w");
		System.out.println("ocorrencia de um letras e números: " + metac+ " por que a não é número nem letra");//false
		
		//ocorrencia de espaços:
		metac =" ".matches("\\s");
		System.out.println("ocorrencia de espaços: " + metac);//true
		metac ="#".matches("\\s");
		System.out.println("ocorrencia de um espaço: " + metac+ " por que # não é espaço");//false
		
		/*validação de um CEP:
		 * 5 digitos, -, 3 digitos
		 */
		String cep = "\\d\\d\\d\\d\\d-\\d\\d\\d";
		metac = "70294-070".matches(cep);
		System.out.println("Validação de cep: " + metac);
		
		//utilizando QUANTIFICADORES:
		metac = "21".matches("\\d{2}");
		System.out.println("utilizando quantificadores: " + metac);
		
		//quantificador{2,}, pelo menos 2 digitos:
		metac = "12".matches("\\d{2,}");
		System.out.println("utilizando quantificadores, pelo menos 2: " + metac + " por que tem mais de dois ");//true
		metac = "123".matches("\\d{2,}");
		System.out.println("utilizando quantificadores, pelo menos 2: " + metac + " por que tem menos de dois ");//true
		
		//quantificado{n,m}, pelo menos 2 digitos, mas não pode passar de 5:
		metac = "12345".matches("\\d{2,5}");
		System.out.println("utilizando quantificadores, pelo menos 2: " + metac + " por que tem mais de dois e menos de 5 ");//true
		
		//quantificadores:
		metac = "".matches(".?");//0 ou 1
		metac = "ab".matches(".*");//0 ou +
		metac = "ab".matches(".+");//1 ou +
		
		//validar o cep com quantificadores:
		boolean cep2 ="67890-090".matches("\\d{5}-\\d{3}");
		System.out.println(cep2);
		
		//validar uma data:
		boolean data = "12/02/1980".matches("\\d{2}/\\d{2}/\\d{4}");
		System.out.println(data);
		
		//METACARACTER DE FRONTEIRA:
		metac = "Pier21".matches("^Pier.*");//"^=>define se começa com PIer;  .*=> continue com qualquer caracter 0 ou mais vezes;
		System.out.println(metac);
		
		//termina:
		metac = "Pier21".matches(".*21$");// começa "com qualquer coisa", mas termina com 21
		System.out.println(metac);
		
		//no meio do texto:
		metac = "tem java aqui".matches(".*java.*");//começa "com qualquer coisa",avalia se tem java, termina com qualquer coisa;
		System.out.println(metac);
		
		//inicia com um texto e termina com outro:
		metac = "tem java aqui".matches("^tem.*aqui$");
		System.out.println(metac);
		
		//ou:
		metac = "sim".matches("sim|nao");
		System.out.println(metac);
		
		//AGRUPADORES:
		metac = "x".matches("[a-z]");//procurar qualquer letra de a-z, nesse caso x.
		System.out.println(metac);
		metac = "2".matches("[a-z]");//false
		metac = "A".matches("[a-z]");//false
		
		metac = "3".matches("[0-9]");//procurar por numeros
		System.out.println(metac);
		
		metac = "true".matches("[tT]rue");//true True
		metac = "true".matches("[tT]rue| [yY]es");//true True yes Yes
		System.out.println(metac);//true em ambos os casos
		
		//validação de nome:
		metac = "Beatriz".matches("[A-Z][a-zA-Z]*");//Primeira letra maiúscula
		metac = "Beatriz".matches("[A-Z][a-z]*");//Primeira letra maiúscula e outras minúsculas
		System.out.println(metac);//true em ambos os casos
		metac = "olho".matches("[^abc]lho");//restrição, mas terminando com lho, retorna true
		metac = "alho".matches("[^abc]lho");//false
		metac = "crau".matches("cr[ae]u"); //validação no meio da palavra: crau ou creu
		
		/*validação de emails:
		 * 1-todo email começa com letra ou numero ocorrendo 1 ou+ vezes, ou seja: ("\\w+")
		 * 2- ate o momento que eu encontro o @, entao fica:("\\w+@")
		 * 3-após o @ tem letras e numero tambem, logo: ("\\w+@\\w+")
		 * 4- procurar pelo ponto, mas como o . ja é um metacaracter, faço da seguinte forma: \\., logo:("\\w+@\\w+\\.")
		 * 5- final do email, dois ou 3 dígitos: \\w{2,3}, logo:("\\w+@\\w+\\.\\w{2,3}")
		 */
		boolean email = "rh@xtiuniversity.com.br".matches("\\w+@\\w+\\.\\w+\\.\\w{2,3}");//validação simples de email=> true
		
		//encontrar todas as ocorrencias de uma palavra:
		String doce = "Qual é o Doce mais doCe que o doce?";
		
		//classes para a manipulação de expressões regulares:
		Matcher matcher = Pattern.compile("(?i)doce").matcher(doce);//mais performatico do que utilizar .matches("cr[ae]u")
		while(matcher.find()) {
			System.out.println(matcher.group());
		}
		
		//SUBSTITUIÇÕES:(metodo .replace)
		
		//substituir todas as ocorrencias dessa expressão regular, nesse caso, todas as ocorrencias de doce por docinho:
		String x = doce.replaceAll("(?i)doce", "DOCINHO");
		System.out.println(x);
		
		//exemplo 2:substituir todos os ra,re,ro... por x:
		String rato = "O rato roeu a roupa do rei de roma";
		String r = rato.replaceAll("r[aeiou]", "XX");
		System.out.println(r);
		
		//exemplo 3:substituir os espacos por tab:
		r = "Tabular este texto".replaceAll("\\s", "\t");
		System.out.println(r);
		
		//exemplo 4: criar variáveis e utilizar-las para a formatação de um conteúdo:
		String url = "www.xti.com.br/clientes-2011.html";
			//padrao:http://www.xti.com.br/2011/clientes.jsp=> objetivo da reestruturação de links.
		//passos:
		 // 1- construir um padrão que localize esses padroes:www.xti.com.br/clientes-2011.html
		 String re = "www.xti.com.br/\\w{2,}-\\d{4}.html";
		 boolean verificacao = url.matches(re);
		 System.out.println(verificacao);
		 
		 /*2- transformar o www.xti.com.br numa variável pra colocar dentro do novo padrão
		  * para transformar em variável basta colocar entre parenteses: (www.xti.com.br)
		  * 3- recuperar a variável: $1(1 é a posição da variável)
		  * 4-pegar o ano e o nome da página(cliente): tudo isso eu faço colocando parenteses entre as parte que eu quero pegar
		  * pegar essas variáveis é da mesma forma:$2(2 é a segunda posição da variável),$3(3 é a terceira posição da variável)
		  * 
		  */
		 re = "(www.xti.com.br)/\\w{2,})-(\\d{4}).html";
		 
		 r = url.replaceAll(re, "http:// $1/$3/$2.jsp");
		 System.out.println(r);
		 System.out.println(url);
		 
		 
		 
	
	}

}

/*
 * padrão de pesquisas e substituição de textos muito útil para validar dados e
 * assegurar que estejam em determinado formato expressões regulares são um
 * padrão de pesquisa no formato de string utilizado para validar a ocorrencia
 * dele em um texto
 * 
 * 
 * 
 * 
 * utilizando MODIFICADORES:
 *  obs.: posso colocar quantos modificadores quiser
 * numa expressão só ex.:boolean b = "Java".matches("(?imxs)java");
 * (?im), ignora maiusculas e minusculas , encontrado em qualquer linguagem
 * (?x), comentários
 * (?m), multilinhas 
 * (?s), Dottal
 * 
*METACARACTERES:
 * indicam a ocorrencia de número, letra, etc. no seu texto:
 * . qualquer caracter
 * \d digitos [0-9]
 * \D não é digito [^0-9]-> qualquer coisa que nao seja numero
 * \s espaço[ \t\n\x0b\f\r]
 * \S não é espaço[^\s]
 * \w letra \W não é letra[a-zA-z_0-9]
 * 
 * 	QUANTIFICADORES:
 * X{n}     X, exatamente n vezes
 * X{nn}    X, pelo menos n vezes
 * X{n, m}  X, pelo menos n vezes, mas não mais que m vezes
 * X?		X, 0 ou 1 vez
 * X*		X, ) ou + vezes
 * X+		X, 1 ou + vezes
 * 
 * METACARACTER DE FRONTEIRA
 * define se a string comeca ou termina com determinado padrão
 * 
 * ^ inicia;
 * $ finaliza;
 * | ou 
 * 
 * AGRUPADORES:
 * agrupam, subtraem conjuntos de caracteres
 * [...]          agrupamento=> definir um conjuto de letras exemplo:[abc]
 * [a-z]		  alcance	=> caracteres entre a e z com letras minusculas
 * [a-e][i-u]	  união => união de abcde + ij...stu
 * [a-z&&[aeiou]] interseção=> de a a z + todas as vogais
 * [^abc]		  exceção => ^ dentro dos colchetes significa exceção,nesse caso=> tudo o que não for abc;
 * [a-z&&[^m-p]]  subtração=> de a a z menos mnop
 * \x			  fuga literal
 */
 
