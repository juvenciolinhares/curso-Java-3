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
		
		//3-utilizando o método construtor da string:
		String s3 =new String("Java Virtual Machine");
		System.out.println(s3);
		
		/*4- atraves de um array de caracteres
		 *  p utilizar esse array na contrução da string:
		 *  basta utilizar o construtor que recebe essa string de array:
		 */
		char [] array = {'j','a','v','a'};
		String s4 = new String(array);
		System.out.println(s4);
		
		//OPERAÇÕES BÁSICAS:
		//1-acessar o tamanho (numero de caracteres):
		
		int tamanho = s1.length();
		System.out.println(tamanho);
		
		//2- localizar um determinado caracter:
		char letra = s1.charAt(0);//0 a lenght()-1;
		System.out.println(letra);
		
		//3- toString: retorna o conteudo em forma de texto.
		
		//LOCALIZAÇÃO(de caracteres e strings dentro do meu texto):
		//1- retornar a primeira ocorrencia do caracter ou string:
		int posicao = s3.indexOf('J');
		System.out.println("A posicao do primeiro j é: " +posicao);
		
		int posicao1 = s3.indexOf("Virtual");
		System.out.println("A posicao do primeiro virtual é: " + posicao1);
		
		//2- lastIndexOf: retornar a ultima ocorrencia do caracter ou string:
		int posicao2 = s3.lastIndexOf("A posicao do primeiro a é: " +'a');
		System.out.println(posicao2);
		int posicao3 = s3.lastIndexOf("Machine");
		System.out.println("A posicao do primeiro j é: " + posicao3);
		
		//3-informa se está vazia(booleran):
		boolean vazia = s3.isEmpty();
		System.out.println("essa String está vazia? " + vazia);
		
		//COMPARAÇÃO DE STRINGS:
		//1- equals e equalsIgnoreCase:
		String xti = "XTI";
		boolean x =xti.equals("xti");
		System.out.println(x);//vai dar false pq um é maiusculo e outro minusculo
		
		boolean xTrue = xti.equalsIgnoreCase("xti");// da true pq está ignorando maiusculo e minusculo
		System.out.println(xTrue);
		
		//2-verifica se meu texto começa com determinado caracter:
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
		System.out.println(compararAmorBola);// amor vem antes, logo retorna um número menor que zero
		int compararBolaAmor = "bola".compareTo("amor");
		System.out.println(compararBolaAmor);//bola vem depois então retorna > 0.
		int compararAmorAmor = "amor".compareTo("amor");
		System.out.println(compararAmorAmor);//retona 0
		int compararNumeros = "123".compareTo("234");
		System.out.println(compararNumeros);//retorna -1
		
		//5-descobrir se determinada string está dentro de outra:
		String so = "Olhe, olhe!";
		boolean dentroDaoutra = so.regionMatches(6, "Olhe", 0, 4);//posicao, ocorrencia,posicao, caracacter
		System.out.println(dentroDaoutra);// vai ser neg pq ele está comparando um texto letra maiuscula com minuscula;
		boolean dentroDaoutraIgnoreMaiusMinus = so.regionMatches(true, 6, "Olhe", 0, 4);
		System.out.println(dentroDaoutraIgnoreMaiusMinus);// ignorei maiusculas e minusculas
		
		//EXTRAÇÃO DE DADOS:
		//1- encontrar um pedaço de texto dentro do texto maior:
		String texto = "O Brasil é lindo";
		String subTexto = texto.substring(11);// subtexto a partir da posição 11;
		System.out.println(subTexto);
		
		//2- metodo sobrecarregado de String
		String sobrecarregado = texto.substring(2, 8);//defino inicio e fim pelos indices;
		System.out.println(sobrecarregado);
		
		//MODIFICAÇÃO DE STRINGS:
		//1- concatenar outra string:
		String concatenar = texto.concat(", que maravilha");//equivalente a: texto += ", que maravilha";
		System.out.println(concatenar);
		
		//2- trocar caracteres:
		String trocarCaracteres = texto.replace('s', 'z'); //escolho a letra a ser trocada e a nova letra
		System.out.println(trocarCaracteres);
		//3- trocar espaço em braco por x:
		String trocarCaracteresPrimeiraOcorrencia = texto.replaceFirst(" ", "X"); //troco o 1º espaço em branco por X
		System.out.println(trocarCaracteresPrimeiraOcorrencia);
		//4- trocar todos os espaços em branco por x:
		String trocarCaracteresTodasAsOcorrencias = texto.replaceAll(" ", "X"); //troco todos  os espaços em branco por X
		System.out.println(trocarCaracteresTodasAsOcorrencias);
		//5- converter para letras maiúsculas:
		String letrasMaiusculas = texto.toUpperCase();
		System.out.println(letrasMaiusculas);
		//6- converter para letras minusculas:
		String letrasMinusculas = texto.toLowerCase();
		System.out.println(letrasMinusculas);
		//7- limpa os caracteres(espaços antes e depois da string):
		System.out.println("    espacos    ");
		System.out.println("    espa cos    ".trim());//remove os espaços, mas não remove os espaços no meio da string
		
		
		
		
		
		
	}
}
