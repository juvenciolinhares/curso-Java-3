package construtores;

public class CarroTest {

	public static void main(String[] args) {

		// posso inicializar mesmo sem o metodo construtor

		Carro ferrari = new Carro();
		
		//definir os atributos separadamente.
		ferrari.modelo = "Ferrazi Enzo";
		ferrari.velocidadeMaxima = 349;
		ferrari.segundosZeroACem = 3.2;
		
		//iniciando um carro ja com os construtores:
		Carro koenigsegg = new Carro("koenigsegg", 430, 3.1);
		
		System.out.println(koenigsegg.modelo);

	}

}
