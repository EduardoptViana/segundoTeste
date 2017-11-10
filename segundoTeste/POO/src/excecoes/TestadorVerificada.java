package excecoes;

import java.io.File;

import java.io.IOException;

public class TestadorVerificada {

	public static void main(String[] args) {

		criarArquivo("arquivo");

	}

	private static void criarArquivo(String nome) {

		File f = new File(nome);

		
			try {
				
				f.createNewFile();
				
			} catch (IOException e) {
				
				e.printStackTrace();
				
			}finally{
				
			}
			
	

	}
}
