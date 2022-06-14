package metodosSobrecarregados;

public class MatematicaTest {

	public static void main(String[] args) {

		Matematica m = new Matematica();
		
		//sobrecarga de métodos

		System.out.println(m.media(5, 3));

		System.out.println(m.media("50", "30"));

		System.out.println(m.media(5));
		
		//quantidade aleatória de números
		
		System.out.println(m.media(2,3,4,5,6,7,8,8,8,8,8,8,8));

		/*
		 * pela quantidade de parametros 
		 * a jvm identifica qual método deve executar
		 */
	}

}
