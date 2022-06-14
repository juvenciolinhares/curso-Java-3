package relacionamentoTemUmComposicao;

public class Carro {
	String modelo;
	int velocidadeMaxima;
	double segundosZeroACem;
	Motor motor; 
	
	public Carro() {
		
	}
	
	public Carro(String modelo,int velocidadeMaxima,double segundosZeroACem ) {
		this.modelo =modelo;
		this.velocidadeMaxima = velocidadeMaxima;
		this.segundosZeroACem = segundosZeroACem;
		
	}
	
	//metodo que permite inicializar o motor do veiculo:
	public Carro(String modelo,int velocidadeMaxima,double segundosZeroACem, Motor motor ) {
		this.modelo =modelo;
		this.velocidadeMaxima = velocidadeMaxima;
		this.segundosZeroACem = segundosZeroACem;
		this.motor = motor;
		
		
	}
	

}


