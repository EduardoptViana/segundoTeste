package exercicios.exercicio1;

public class Eleitoral {
	int idade;
	String nome;

	void verificar() {
		if (idade < 16) {
			System.out.println("Não pode votar");
		} else if (idade >= 16 && idade <= 65) {
			System.out.println("Deve votar");
		} else {
			System.out.println("Facultativo");
		}

	}

	void imprimir(){
		verificar();
	}
}
