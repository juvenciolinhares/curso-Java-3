package enumeracaoEnumConstantesJava;

public enum Medida {
	
	//criar tipos de medidas:
	MM("Milimetro"), CM("Centímetro"), M("Metro");
	
	//posso incluir atributos especiais:
	
	public String titulo;
	/*
	 * construtor de Medidas:
	 * essas medidas sera colocadas como parametros dos objetos criado na linha 6.
	 */
	Medida(String titulo){
		this.titulo = titulo;
	}

}
