package decorator.recheio;

import decorator.RecheioDecorator;
import decorator.Sanduiche;

public class Alface extends RecheioDecorator {

	private Sanduiche sanduiche;

	public Alface(Sanduiche sanduiche) {
		this.sanduiche = sanduiche;
	}

	@Override
	public String getDescricao() {
		return sanduiche.getDescricao() + " Alface ";
	}

	@Override
	public double calcularCusto() {
		return sanduiche.calcularCusto() + 0.9;
	}

}
