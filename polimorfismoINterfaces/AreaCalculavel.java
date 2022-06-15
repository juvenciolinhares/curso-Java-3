package polimorfismoINterfaces;

public interface AreaCalculavel {
	
	/*só posso declarar metodos abstratos
	 * não preciso declarar os metodos como abstratos por que ja está implicito
	 */
	double calcularArea();

}

/*diferenca entre intercafes e classes abstratas:
 * interfaces: 100% abstratas
 * classes: posso implementar métodos abstratos ou não
 * 
 * utilização sde uma interfaces:
 * uso a palavra chave: implenets e o nome da interface na classe que eu quero utilizar 
 * 2- utilizo tofdos os metodos da interface
 * 
 * herança multipla:
 * quando ulitizamos uma classe abstrata, extendemos, 
 * mas isso só pode acontecer uma vez(herdar apenas do pai)
 * com a interface posso implementar várias
 *  herdando de todas essas interfaces os seu atributos e métodos
 *  exemplo: interface VolumeCalculavel + classe cubo
 *  
 *  relacionamento de tipos díspares(diferentes)
 *  objetos de classes que implementam a mesma interface
 *  podem responder às mesmas chamadas de métodos.
 *  por exemplo: cubo e quadrado têm uma certa semelhança, 
 *  entao podem herdar métodos e atributos comuns,
 *  mas esses obj não têm semelhança com galinha e cachorro,
 *  porém, mesmo assim eles podem herdar chamadas de metodos comuns
 *  
 *  tipo: unidade fundamental de projetoso OO
 *  
 */

