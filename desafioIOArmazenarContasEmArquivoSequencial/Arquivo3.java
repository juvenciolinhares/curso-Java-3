package desafioIOArmazenarContasEmArquivoSequencial;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;

public class Arquivo3 {

		//caminho para o armazenamento:
		private Path path = Paths.get("C:\\ws-eclipse\\cursoJava2\\files\\.contas.txt");
		
		//codficação charset:
		private Charset utf8 = StandardCharsets.UTF_8;
		
		//gravar os valores do arrayList:
		public void armazenarContas(ArrayList<Conta> contas) throws IOException {
		//inicializar um "deposito de dados":
		try(BufferedWriter writer = Files.newBufferedWriter(path, utf8)){
			
			//percorrer e registrar todas as contas do arraylist:
			//for (Conta conta : contas) {
				
				//writer.write(conta.getCliente() + ";" + conta.getSaldo() + "\n");
				
			//}
		}
	}
	
	//metodo para ler as contasutilizando variaveis path e utf8:
	public ArrayList<Conta> recuperarContas () throws IOException{
		ArrayList<Conta> contas = new ArrayList<>();
		try (BufferedReader reader = Files.newBufferedReader(path, utf8)){
			
			//ler o conteúdo:
			String line = null;
			while (( line = reader.readLine())!= null) {
				
				//quebrar os tokens por delimitadores:
				String [] t = line.split(";");
				System.out.println(t[0] + t[1]); 
				Conta conta = new Conta(t[0], Double.parseDouble(t[1]));
				contas.add(conta);
				
			}
			
		}
		return contas;
		
	}

	public static void main(String[] args) throws IOException {
	/*	
		ArrayList<Conta> contas = new ArrayList<>();
		
		//lista de contas que serão armazenadas
		contas.add(new Conta("Ricardo", 12000.23));
		contas.add(new Conta("Lawrence", 11050.32));
		contas.add(new Conta("Sandra", 18000.21));
		contas.add(new Conta("Beatriz", 23200.09));
	*/	
		//armazenar as contas
		Arquivo3 operacao = new Arquivo3();
		//operacao.armazenarContas(contas);
		
		//ler as contas
		ArrayList<Conta> contas2 = operacao.recuperarContas();
		for(Conta conta : contas2) {
			conta.exibirSaldo();
		}
		
		

	}

}
