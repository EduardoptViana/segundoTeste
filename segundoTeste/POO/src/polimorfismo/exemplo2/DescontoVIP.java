package polimorfismo.exemplo2;

public class DescontoVIP extends Desconto {

	@Override
	public double calcularDesconto(double valor) {

		return valor - (valor * 0.15);
	}

}
