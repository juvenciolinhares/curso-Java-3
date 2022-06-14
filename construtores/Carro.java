package construtores;

public class Carro {
	
	/*construtores não retornam valor
	 * apenas discriminam os atributos
	 * na instanciação do objeto.
	 */
	String modelo;
	int velocidadeMaxima;
	double segundosZeroACem;
	
	/*criando os construtores:
	 * 1-definir um modificador de acesso;
	 * 2- nome da classe(o construtor tem o mesmo nome da classe);
	 * 3-parametros que eu quero que sejam iniciados na instancia; 
	 */
	public Carro(String modelo,int velocidadeMaxima,double segundosZeroACem ) {
		this.modelo = modelo;
		this.velocidadeMaxima = velocidadeMaxima;
		this.segundosZeroACem = segundosZeroACem;
	}
	
	//construtor vazio
	public Carro() {
		
	}
	
	

}
