package polimorfismo.exemplo2;

public class Venda {

	private double totalDaVenda;

	public double calcularTotalVenda(Desconto desconto) {

		return desconto.calcularDesconto(totalDaVenda);

	}

	public double getTotalDaVenda() {
		return totalDaVenda;
	}

	public void setTotalDaVenda(double totalDaVenda) {
		this.totalDaVenda = totalDaVenda;
	}

}
