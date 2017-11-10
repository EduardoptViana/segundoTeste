package contacorrente;

public class Testador {

	public static void main(String[] args) {
		
		Correntista c1 = new Correntista("Juquinha","234567");
		ContaCorrente cc1 = new ContaCorrente(1,c1);
		cc1.depositar(1000);
		
		Correntista c2 = new Correntista("Noah Morto","332224");
		ContaCorrente cc2 = new ContaCorrente(2,c2);
		cc2.depositar(1000);
		
		cc1.transferir(cc2, 500);
		
		System.out.println("Conta 1: "+cc1.getSaldo());
		System.out.println("Conta 2: "+cc2.getSaldo());

		
	}

}
