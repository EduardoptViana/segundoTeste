package matriz;

class Matriz {

	int[][] matriz;

	/**
	 * Construtor
	 * 
	 * @param mat
	 */
	Matriz(int[][] mat) {

		matriz = mat;

	}

	int somarDiagonalPrincipal() {
		int soma = 0;

		for (int i = 0; i < 5; i++) {
			soma = soma + matriz[i][i];
		}
		return soma;

	}

	int encontrarMaiorElemento() {
		int maior = Integer.MIN_VALUE;

		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				if (matriz[i][j] > maior)
					maior = matriz[i][j];
			}

		}
		return maior;
	}

}
