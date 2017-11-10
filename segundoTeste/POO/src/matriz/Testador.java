package matriz;

public class Testador {

	public static void main(String[] args) {
		
		int[][] matriz = new int[5][5];
		
		for(int i=0; i<5;i++){
			for(int j=0;j<5;j++){
				
				matriz[i][j] = (int) (Math.random() * 100);
				
				System.out.print(matriz[i][j] + " ");
			}
			System.out.println();
			
		}
		
		Matriz m = new Matriz(matriz);
		
		
		
		System.out.println("Maior: "+m.encontrarMaiorElemento());
		System.out.println("Soma " +m.somarDiagonalPrincipal());
	}

}
