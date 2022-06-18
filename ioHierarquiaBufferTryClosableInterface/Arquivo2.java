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

	public static void main(String[] args)  {
		//na manipulação de arquivos tudo começa com o Path(caminho):
		Path path = Paths.get("C:\\Users\\jlinhares\\Desktop\\prints");
		
		//utilizar um escritor de arquivos(writer), posso escrever vários textos
		Charset utf8 = StandardCharsets.UTF_8;
		
		//Escrita de arquivos:
		
		//usando o tratamento de exceções(try{}catch)
		try(BufferedWriter w = Files.newBufferedWriter(path, utf8)) {
		//bufferWriter = deposito de dados(escritos)
		
		//escrever:
		w.write("texto");
		w.write("Texto");
		
		}catch(IOException e) {
			e.printStackTrace();//imprimir o erro
		} 
		
		//leitura:
		try(BufferedReader reader = Files.newBufferedReader(path, utf8)){
			
			//ler linha por linha os arquivos:
			
			String line = null;
			while((line = reader.readLine()) != null) {
				System.out.println(line);
			}
			
		}catch (IOException e) {
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
 * Reade:BeffuerReader;InputStreamReader
 * 
 * Writer: BufferWriter; PrintWQriter; OutputStreamWriter
 * 
 * paths
 * files
 * 
 * codificação utf8: StandardCharsets.UTF_8
 */
 
