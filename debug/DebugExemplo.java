package debug;

public class DebugExemplo {
	
	int resultado;
	
	public int raiz(int numero) {
		int raiz = 0, impar = 1;
		while(numero >= impar) {
			numero -= impar;
			impar +=2;
			++raiz;
		}
		return raiz;
	}
	
	public static void main(String[] args) {
		
		int numero = 16;
		DebugExemplo exemplo = new DebugExemplo();
		int raiz = exemplo.raiz(numero);
		
		if(raiz == 4) {
			System.out.println("Raiz correta");
		}
		
	}

}

/*criando um breakpoint(ponto de partida):
 * clico 2x na linha que quero inicializar o debug(aparece uma boilinha azul)
 * para executar o debug clico no besouro;
 * 
 * abas:
 * variables: apresenta a relação de variaveis no metodo que estou analisando.
 * brerakpoints:visualizo, marco e desmarco os breakpoints
 * expressions: utilizada para a avaliação de expressoes dentro da aplicação.
 * sem necessidade de incluir novo código no programa.
 * step into(entra dentro do metodo)
 * step over passa por linhas
 * 
 * navegação:
 * f5 step into
 * f6 step over
 * f7, f8
 * 
 * posso configurar o breakpoint
 *  para executar a linha apenas da segunda vez:
 *  botao direito no breakpoint
 *  breakpoint properties
 *  hit count(quantas vezes que que execute antes de entrar)
 *  
 *  colocar uma condição p ficar vinculada ao breakpoint
 *  
 *  watch point:
 *  utilizado  para monitorar variaveis de instancia(variavel do objeto)
 *  clico 2x na frente da variavel que quero monitorar
 *  esse watchpoint pode ser configurado no
 *  breakpoint properties nas opcoes:
 *  access(quando for acessada)
 *  e modification(quando for modificada)
 *  
 *  exception breakpoint:
 *  monitora uma excessão específica
 *  vou na aba bereakpoints
 *  botao j! do lado das abas
 *  informo o tipo de exceção a ser monitorada:
 *  exemplo: NullPointerException;
 *  
 *  class breakpoint
 *  vou em run
 *  
 *  add class load breakpoint
 *  monitoro uma classe especifica(quando inicializei ela.)
 *  
 */
	


