package stringsPrincipaisOrientacoes;

public class StringOperacoes {

	public static void main(String[] args) {
		
		//FORMAS DE CRIAR STRINGS:
		
		//1- literal string:
		String s1 = "Write once";
		System.out.println(s1);
		
		//2-concatenando strings:
		String s2 = s1 + "Run Anywhere";
		System.out.println(s2);
		
		//3-utilizando o m�todo construtor da string:
		String s3 =new String("Java Virtual Machine");
		System.out.println(s3);
		
		/*4- atraves de um array de caracteres
		 *  p utilizar esse array na contru��o da string:
		 *  basta utilizar o construtor que recebe essa string de array:
		 */
		char [] array = {'j','a','v','a'};
		String s4 = new String(array);
		System.out.println(s4);
		
		//OPERA��ES B�SICAS:
		//1-acessar o tamanho (numero de caracteres):
		
		int tamanho = s1.length();
		System.out.println(tamanho);
		
		//2- localizar um determinado caracter:
		char letra = s1.charAt(0);//0 a lenght()-1;
		System.out.println(letra);
		
		//3- toString: retorna o conteudo em forma de texto.
		
		//LOCALIZA��O(de caracteres e strings dentro do meu texto):
		//1- retornar a primeira ocorrencia do caracter ou string:
		int posicao = s3.indexOf('J');
		System.out.println("A posicao do primeiro j �: " +posicao);
		
		int posicao1 = s3.indexOf("Virtual");
		System.out.println("A posicao do primeiro virtual �: " + posicao1);
		
		//2- lastIndexOf: retornar a ultima ocorrencia do caracter ou string:
		int posicao2 = s3.lastIndexOf("A posicao do primeiro a �: " +'a');
		System.out.println(posicao2);
		int posicao3 = s3.lastIndexOf("Machine");
		System.out.println("A posicao do primeiro j �: " + posicao3);
		
		//3-informa se est� vazia(booleran):
		boolean vazia = s3.isEmpty();
		System.out.println("essa String est� vazia? " + vazia);
		
		//COMPARA��O DE STRINGS:
		//1- equals e equalsIgnoreCase:
		String xti = "XTI";
		boolean x =xti.equals("xti");
		System.out.println(x);//vai dar false pq um � maiusculo e outro minusculo
		
		boolean xTrue = xti.equalsIgnoreCase("xti");// da true pq est� ignorando maiusculo e minusculo
		System.out.println(xTrue);
		
		//2-verifica se meu texto come�a com determinado caracter:
		boolean comeca = xti.startsWith("XT");
		System.out.println(comeca);//true
		boolean comecaFalse = xti.startsWith("TI");
		System.out.println(comecaFalse);//false
		
		//3- verifica se termina com determinado valor:
		boolean terminaTrue = xti.endsWith("TI");
		System.out.println(terminaTrue);//true
		boolean terminaFalse= xti.endsWith("XT");
		System.out.println(terminaFalse);//false
		
		//4- comparar o tamanho:(util para ordem alfabetica e sequencia numerica)
		int compararAmorBola = "amor".compareTo("bola");
		System.out.println(compararAmorBola);// amor vem antes, logo retorna um n�mero menor que zero
		int compararBolaAmor = "bola".compareTo("amor");
		System.out.println(compararBolaAmor);//bola vem depois ent�o retorna > 0.
		int compararAmorAmor = "amor".compareTo("amor");
		System.out.println(compararAmorAmor);//retona 0
		int compararNumeros = "123".compareTo("234");
		System.out.println(compararNumeros);//retorna -1
		
		//5-descobrir se determinada string est� dentro de outra:
		String so = "Olhe, olhe!";
		boolean dentroDaoutra = so.regionMatches(6, "Olhe", 0, 4);//posicao, ocorrencia,posicao, caracacter
		System.out.println(dentroDaoutra);// vai ser neg pq ele est� comparando um texto letra maiuscula com minuscula;
		boolean dentroDaoutraIgnoreMaiusMinus = so.regionMatches(true, 6, "Olhe", 0, 4);
		System.out.println(dentroDaoutraIgnoreMaiusMinus);// ignorei maiusculas e minusculas
		
		//EXTRA��O DE DADOS:
		//1- encontrar um peda�o de texto dentro do texto maior:
		String texto = "O Brasil � lindo";
		String subTexto = texto.substring(11);// subtexto a partir da posi��o 11;
		System.out.println(subTexto);
		
		//2- metodo sobrecarregado de String
		String sobrecarregado = texto.substring(2, 8);//defino inicio e fim pelos indices;
		System.out.println(sobrecarregado);
		
		//MODIFICA��O DE STRINGS:
		//1- concatenar outra string:
		String concatenar = texto.concat(", que maravilha");//equivalente a: texto += ", que maravilha";
		System.out.println(concatenar);
		
		//2- trocar caracteres:
		String trocarCaracteres = texto.replace('s', 'z'); //escolho a letra a ser trocada e a nova letra
		System.out.println(trocarCaracteres);
		//3- trocar espa�o em braco por x:
		String trocarCaracteresPrimeiraOcorrencia = texto.replaceFirst(" ", "X"); //troco o 1� espa�o em branco por X
		System.out.println(trocarCaracteresPrimeiraOcorrencia);
		//4- trocar todos os espa�os em branco por x:
		String trocarCaracteresTodasAsOcorrencias = texto.replaceAll(" ", "X"); //troco todos  os espa�os em branco por X
		System.out.println(trocarCaracteresTodasAsOcorrencias);
		//5- converter para letras mai�sculas:
		String letrasMaiusculas = texto.toUpperCase();
		System.out.println(letrasMaiusculas);
		//6- converter para letras minusculas:
		String letrasMinusculas = texto.toLowerCase();
		System.out.println(letrasMinusculas);
		//7- limpa os caracteres(espa�os antes e depois da string):
		System.out.println("    espacos    ");
		System.out.println("    espa cos    ".trim());//remove os espa�os, mas n�o remove os espa�os no meio da string
		
		
		
		
		
		
	}
}
