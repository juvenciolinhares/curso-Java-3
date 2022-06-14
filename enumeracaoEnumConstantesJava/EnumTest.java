package enumeracaoEnumConstantesJava;

public class EnumTest {
	
	//exemplo de criação de constante:
	
	public static final  double PI = 3.14;
	
	public static void andar(Medida medida, int total) {
		if(medida == Medida.M) {
			// código... ex:
			System.out.println("você andou " + total + " " + medida.titulo + "s");
		}
	}

	public static void main(String[] args) {
		/*enum: criação de constantes static e final
		 * utilizadas dentro da aplicação, 
		 * é uma forma profissional de criar
		 * conjunto de constantes.
		 */
		
		//para criar Enum: botao direito no package-> new -> Enum.
		
		System.out.println(PeçasXadrez.BISPO);
		
		//acessar enumeração de medidas(atributo da medida):
		System.out.println(Medida.M.titulo);
		
		//percorrer e imprimir todas as instancias de medidas
		for(Medida m : Medida.values()) {
			System.out.println(m + ": " + m.titulo );
		}
		
		//aplicacao prática:crio o métoddo da linha 9
		
		//chamando o método:
		andar(Medida.M, 100);
	}

}
