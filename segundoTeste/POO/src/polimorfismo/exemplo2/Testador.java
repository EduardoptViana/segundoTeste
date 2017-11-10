package polimorfismo.exemplo2;

public class Testador {

	public static void main(String[] args) {

		Venda v1 = new Venda();

		v1.setTotalDaVenda(1000);

		DescontoVIP dv = new DescontoVIP();

		System.out.println(v1.calcularTotalVenda(dv));

		Venda v2 = new Venda();
		v2.setTotalDaVenda(2000);

		System.out.println(v2.calcularTotalVenda(new DescontoBolsaFamilia()));
	}

}
