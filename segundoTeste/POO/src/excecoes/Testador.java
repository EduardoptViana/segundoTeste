package excecoes;

public class Testador {

	public static void main(String[] args) {

		System.out.println("Iniciando main");
	
			metodo1();
		
		System.out.println("Terminando main");

	}

	private static void metodo1()  {
		System.out.println("Iniciando metodo1");

		metodo2();

		System.out.println("Terminando metodo1");

	}

	private static void metodo2()  {
		System.out.println("Iniciando metodo2");
		int[] vetor = new int[10];
		try{
		
			for (int i = 0; i < 11; i++) {
				vetor[i] = i;
				System.out.println("Imprimindo vetor: " + i);
			}
		}catch(Exception rex){
			
			
			throw new CristianoException("execao",rex);
		}
		System.out.println("Terminando metodo2");

	}
}
