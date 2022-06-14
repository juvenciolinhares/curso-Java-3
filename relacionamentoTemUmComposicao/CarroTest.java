package relacionamentoTemUmComposicao;

public class CarroTest {

	public static void main(String[] args) {
		Carro ferrari = new Carro();

		ferrari.modelo = "Ferrazi Enzo";
		ferrari.velocidadeMaxima = 349;
		ferrari.segundosZeroACem = 3.2;

		// criar motor da ferrari(atributos separados):
		Motor v12 = new Motor();
		v12.tipo = "V12";
		v12.potencia = 660;

		// adicionar esse motor a ferrari:

		ferrari.motor = v12;

		Carro k = new Carro("Koenigsegg CCXR", 430, 3.1);

		// criar motor iniciando com os construtores

		Motor v8 = new Motor("V8", 1018);
		k.motor = v8;

		// acessar as propriedades de objetos dentro de objetos:
		System.out.println(k.motor.potencia);

		System.out.println(k.modelo);

		// criar um bugatti:

									// ja crio o motor dentro do construtor do carro
		Carro Bugatti = new Carro("Bugatti Veyron", 430, 2.2, new Motor("W16", 1200));
		
		System.out.println(Bugatti.modelo);
		System.out.println(Bugatti.motor.potencia);

	}

}
