package ioPathLeituraEscrita;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Arquivo {

	public static void main(String[] args) throws IOException {
		
		Path path = Paths.get("C:\\ws-eclipse\\cursoJava2");//recebe uma string pra ser informado a localização do arquivo/diretório a ser manipulado
		
		path.toAbsolutePath();//retorna o caminho absoluto do arquivo
		System.out.println(path.toAbsolutePath());
		
		path.getParent();//arquivo pai
		System.out.println(path.getParent());
		
		path.getRoot();//raíz do sistema
		System.out.println(path.getRoot());
		
		path.getFileName();//nome do arquivo
		System.out.println(path.getFileName());
		
		//Criação de diretrórios p/ armazenar arquivos:
		

		
		//escrever e ler arquivos:
		
		byte[] bytes = "Meu texto".getBytes();
		Files.write(path, bytes);//cria, limpa e escreve
		
		byte [] retorno = Files.readAllBytes(path);
		System.out.println(retorno);

	}

}
/*
 * arquivos e diretorios têm um caminho, uma localização
 * a classe Pathdefine/manipula esses caminhos add throws declaration
 * 
 * Criação de diretrórios p/ armazenar arquivos:
 * 1- classe Files
 * 2-metodo createDirectories
 * 3-coloca como parâmetro o caminho da classe pai ou entao: path.getParent()
 * 4- lanca a exceção no método main
 * 
 * escrever e ler arquivos:
 * o método write cria, abre, escreve dentro dele e fecha.
 * util quando manipula arquivos pequenos
 * */
