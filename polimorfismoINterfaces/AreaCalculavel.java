package polimorfismoINterfaces;

public interface AreaCalculavel {
	
	/*s� posso declarar metodos abstratos
	 * n�o preciso declarar os metodos como abstratos por que ja est� implicito
	 */
	double calcularArea();

}

/*diferenca entre intercafes e classes abstratas:
 * interfaces: 100% abstratas
 * classes: posso implementar m�todos abstratos ou n�o
 * 
 * utiliza��o sde uma interfaces:
 * uso a palavra chave: implenets e o nome da interface na classe que eu quero utilizar 
 * 2- utilizo tofdos os metodos da interface
 * 
 * heran�a multipla:
 * quando ulitizamos uma classe abstrata, extendemos, 
 * mas isso s� pode acontecer uma vez(herdar apenas do pai)
 * com a interface posso implementar v�rias
 *  herdando de todas essas interfaces os seu atributos e m�todos
 *  exemplo: interface VolumeCalculavel + classe cubo
 *  
 *  relacionamento de tipos d�spares(diferentes)
 *  objetos de classes que implementam a mesma interface
 *  podem responder �s mesmas chamadas de m�todos.
 *  por exemplo: cubo e quadrado t�m uma certa semelhan�a, 
 *  entao podem herdar m�todos e atributos comuns,
 *  mas esses obj n�o t�m semelhan�a com galinha e cachorro,
 *  por�m, mesmo assim eles podem herdar chamadas de metodos comuns
 *  
 *  tipo: unidade fundamental de projetoso OO
 *  
 */

