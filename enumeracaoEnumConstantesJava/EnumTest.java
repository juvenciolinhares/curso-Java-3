package enumeracaoEnumConstantesJava;

public class EnumTest {
	
	//exemplo de cria��o de constante:
	
	public static final  double PI = 3.14;
	
	public static void andar(Medida medida, int total) {
		if(medida == Medida.M) {
			// c�digo... ex:
			System.out.println("voc� andou " + total + " " + medida.titulo + "s");
		}
	}

	public static void main(String[] args) {
		/*enum: cria��o de constantes static e final
		 * utilizadas dentro da aplica��o, 
		 * � uma forma profissional de criar
		 * conjunto de constantes.
		 */
		
		//para criar Enum: botao direito no package-> new -> Enum.
		
		System.out.println(Pe�asXadrez.BISPO);
		
		//acessar enumera��o de medidas(atributo da medida):
		System.out.println(Medida.M.titulo);
		
		//percorrer e imprimir todas as instancias de medidas
		for(Medida m : Medida.values()) {
			System.out.println(m + ": " + m.titulo );
		}
		
		//aplicacao pr�tica:crio o m�toddo da linha 9
		
		//chamando o m�todo:
		andar(Medida.M, 100);
	}

}
