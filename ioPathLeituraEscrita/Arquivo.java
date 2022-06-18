package ioPathLeituraEscrita;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Arquivo {

	public static void main(String[] args) throws IOException  {
	
		Path path = Paths.get("C:\\ws-eclipse\\cursoJava2\\files\\texto.txt");//inicio de tudo: classe path=> define/manipula os caminhos 
		System.out.println(path.toAbsolutePath());//retorna o caminho absoluto
		System.out.println(path.getParent());//arquivo pai desse arquivo.
		System.out.println(path.getRoot());//raiz
		System.out.println(path.getFileName());//nome do arquivo
		
		//CRIA��O DE DIRET�RIOS:(at� o caminho java2: pai do arquivo)
		Files.createDirectories(path.getParent());
		
		//escrever e ler arquivos:
		
		byte [] bytes = "Meu Texto".getBytes();
		Files.write(path, bytes);// cria, limpa, escreve;
		
		//ler um arquivo:
		byte [] retorno = Files.readAllBytes(path);
		System.out.println(new String (retorno));
		

	}

}
/*
 * arquivos e diretorios t�m um caminho, uma localiza��o
 * a classe Pathdefine/manipula esses caminhos add throws declaration
 * 
 * Cria��o de diretr�rios p/ armazenar arquivos:
 * 1- classe Files
 * 2-metodo createDirectories
 * 3-coloca como par�metro o caminho da classe pai ou entao: path.getParent()
 * 4- lanca a exce��o no m�todo main
 * 
 * escrever e ler arquivos:
 * o m�todo write cria, abre, escreve dentro dele e fecha.
 * util quando manipula arquivos pequenos
 * */
