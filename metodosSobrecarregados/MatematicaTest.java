package metodosSobrecarregados;

public class MatematicaTest {

	public static void main(String[] args) {

		Matematica m = new Matematica();
		
		//sobrecarga de m�todos

		System.out.println(m.media(5, 3));

		System.out.println(m.media("50", "30"));

		System.out.println(m.media(5));
		
		//quantidade aleat�ria de n�meros
		
		System.out.println(m.media(2,3,4,5,6,7,8,8,8,8,8,8,8));

		/*
		 * pela quantidade de parametros 
		 * a jvm identifica qual m�todo deve executar
		 */
	}

}
