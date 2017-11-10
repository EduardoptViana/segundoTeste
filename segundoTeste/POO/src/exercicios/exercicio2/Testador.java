package exercicios.exercicio2;

class Testador {

	public static void main(String[] args) {
		
		Apolice ap = new Apolice();
		
		ap.idade=35;
		ap.nome="Juca";
		ap.valorPremio=1000;
		
		ap.imprimir();
		
		ap.calcularPremio();
		ap.imprimir();
		
		ap.oferecerDesconto("Blumenau");
		ap.imprimir();
		

	}

}
