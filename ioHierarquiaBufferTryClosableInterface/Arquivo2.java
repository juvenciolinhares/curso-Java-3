package ioHierarquiaBufferTryClosableInterface;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Arquivo2 {

	public static void main(String[] args) throws IOException   {
	
		Path path = Paths.get("C:\\ws-eclipse\\cursoJava2\\files\\texto.txt");//incio de tudo: path para dizer o caminho que eu quero manipular.
		
		//escritor: de arquivo(writer):
		
		Charset utf8 = StandardCharsets.UTF_8;//variavel com a condição charset
	
		
		//usar o try{}catch:   // utilizando esse objeto podemos escrever textos nesses arqvuio
		try(BufferedWriter w = Files.newBufferedWriter(path, utf8)) {
			
			//escrever textos:
			w.write("Outro Texto\n");//posso manter esse arquivo aberto e escrever quantas vezes eu quiser.
			w.write("Outro Texto\n");
			w.flush();//gravar no disco rígico:
			
			}catch(IOException e) {
				e.printStackTrace();
			}
		
		//ler um arquivo:
		//inicializar um obj de leitura:
		try(BufferedReader reader = Files.newBufferedReader(path, utf8)){
			//ler o arqvui linha por linha:
			String line = null;
			while((line = reader.readLine()) != null) {
				System.out.println(line);
			}
		}catch(IOException e) {
			e.printStackTrace();
		}
	
	}

}
/*
 * Streams biblioteca IO:
 *  Streams de bytes:
 * input: FileinputStream; FilterInputStream
 * 
 * outputStream: FileOutputStream;FiltyerOutputStream
 * 
 * Streams de caracteres:
 * Reade:BuffuerReader;InputStreamReader
 * 
 * Writer: BufferWriter; PrintWQriter; OutputStreamWriter
 * 
 * paths
 * files
 * 
 * codificação utf8: StandardCharsets.UTF_8
 * 
 * buffer:deposito
 * writer: escritor
 * BufferedWriter: deposito de dados, armazena os textos 
 * método flush: grava tudo no disco rígico do computador
 */
 
