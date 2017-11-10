package decorator.recheio;

import decorator.RecheioDecorator;
import decorator.Sanduiche;

public class Bacon extends RecheioDecorator{
	private Sanduiche sanduiche;
	
	public Bacon(Sanduiche sanduiche){
		this.sanduiche=sanduiche;
	}
	
	@Override
	public String getDescricao() {
		return sanduiche.getDescricao()+" Bacon ";
	}

	@Override
	public double calcularCusto() {
		return sanduiche.calcularCusto() + 0.9;
	}

}
