package decorator.recheio;

import decorator.RecheioDecorator;
import decorator.Sanduiche;

public class QueijoExtra extends RecheioDecorator{
	
private Sanduiche sanduiche;
	
	public QueijoExtra(Sanduiche sanduiche){
		this.sanduiche=sanduiche;
	}
	
	@Override
	public String getDescricao() {
		return sanduiche.getDescricao()+" Queijo ";
	}

	@Override
	public double calcularCusto() {
		return sanduiche.calcularCusto() + 2.5;
	}

}
